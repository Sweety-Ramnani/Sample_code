/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * customer.java
 *
 * Created on Aug 1, 2013, 10:14:47 PM
 */

package mary;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import com.sun.speech.freetts.*;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author welcome-raj
 */
public class customer1 extends javax.swing.JFrame {

    /** Creates new form customer */
    public customer1() {
        initComponents();
    }
static String answer=new String();
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

            @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Gender", "Age", "Mobile no.", "Card no.", "Customer ID", "Flight ID", "Ticket ID"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("DELETE A CUSTOMER");

        jLabel1.setText("APPLICATION:");

        jLabel2.setText("ADMINISTRATOR:");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

            private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                // TODO add your handling code here:
                this.setVisible(false);
                              
                   new Admin().setVisible(true);
                
                Admin ad=new Admin();
                String[] args=new String[2];
                ad.main(args);
            }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MakeMyTrip","root","tiger");
       Statement st= con.createStatement();
       String str= "select * from customer";
       System.out.println(str);
       ResultSet rs = st.executeQuery(str);
          while(rs.next()){
          System.out.println(rs.getString(1));
          System.out.println(rs.getString(2));
          System.out.println(rs.getString(3));
          System.out.println(rs.getString(4));
          System.out.println(rs.getString(5));
          System.out.println(rs.getString(6));
          System.out.println(rs.getString(7));
         System.out.println(rs.getString(8));
         System.out.println(rs.getString(9));

         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(4),rs.getString(3),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});

          }


          } catch (SQLException e) {
            System.out.println("SQL Exception: "+ e.toString());
        } catch (Exception cE) {
            cE.printStackTrace();
            System.out.println("Class Not Found Exception: "+ cE.toString());
        }
  try{
        //serverHost = System.getProperty("server.host", "cling.dfki.uni-sb.de");
       // serverPort = Integer.getInteger("server.port", 59125).intValue();
      // mary = MaryClient.getMaryClient(new Address(serverHost, serverPort));

       voice obj=new voice();
       // Robot rb=new Robot();
        Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MakeMyTrip","root","tiger");
       Statement st= con.createStatement();

                    String string=new String();
            String str="Say delete or insert !";
            obj.dospeak(str,"kevin");
              jTextField1.setText(str);
         //   Thread.sleep(10000);
           //   jTextField1.setText(str);
              wait(str);
              string=jTextField2.getText();
              if(string.equals("delete"))
              {
                  
                  str="Enter the ticket ID for deletion";
                  
                  obj.dospeak(str,"kevin");
                  jTextField1.setText(str);
                 wait(str);
                  str=jTextField2.getText();
                         String query= "delete from customer where C_id="+"'"+str+"'";
                           System.out.println(st.executeUpdate(query)+" "+query);
                  jTextField2.setText("");
                            System.out.println("swapnil");
                  DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

                while(model.getRowCount()>0)
                 {
                      model.removeRow(0);
                      System.out.print("hello");
                  }
              String[] string12=new String[1];
              Thread.sleep(1000);
                 main(string12);
              }

              }

        catch(Exception e){e.printStackTrace();}

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new customer1().setVisible(true);
            }
        });

      
        }
    public static void wait(String str){
        String str1;
     System.out.println("welcome");
    sleep();
    try{
        str1=jTextField2.getText();
  //  while(true){

    while(jTextField2.getText().isEmpty())
    {
        sleep();
    }
    answer=jTextField2.getText();

    }catch(Exception e){}
   // }
}
    public static void sleep(){
    try{
        String str;
    Robot rb=new Robot();
     //                 jTextField2.setText(str);
//             obj.dospeak(str,"kevin");
                rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(KeyEvent.VK_1);
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(KeyEvent.VK_1);
             Thread.sleep(2000);
              str=jTextField2.getText();
              Thread.sleep(2000);
              System.out.println("hello");
              while(! jTextField2.getText().equals(str))
              {
                  System.out.println("hello1");
                  str=jTextField2.getText();
                  Thread.sleep(2000);
              }
             rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(KeyEvent.VK_1);
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(KeyEvent.VK_1);

    }catch(Exception e){}

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
