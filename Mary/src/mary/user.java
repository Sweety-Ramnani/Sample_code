/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * user.java
 *
 * Created on Aug 2, 2013, 11:30:46 PM
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
public class user extends javax.swing.JFrame {

    /** Creates new form user */
    public user() {
        initComponents();
    }

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Administrator");

        jLabel2.setText("Guest");

        /*
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        */

        jButton1.setText("Submit");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jButton2)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
*/

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
Admin ad=new Admin();
String[] ap=new String[2];
ad.main(ap);
 // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed
   /**
    * @param args the command line arguments
    */
   static String answer=new String();
    public static void main(String args[]) {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/MakeMyTrip","root","1234");
       Statement st=con.createStatement();
       String str= "select * from record";
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
         // System.out.println(rs.getString(8));
          //System.out.println(rs.getString(9));

         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{rs.getString(1),rs.getString(2)});
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
            String str="Say delete ! to delete any record";
            obj.dospeak(str,"kevin");
              jTextField1.setText(str);
         //   Thread.sleep(10000);
           //   jTextField1.setText(str);
              wait(str);
              string=jTextField2.getText();
              if(string.equals("delete"))
              {
                  str="Enter username for deletion";
                  obj.dospeak(str,"kevin");
                  jTextField1.setText(str);
                 wait(str);
                  str=jTextField2.getText();
                         String query= "delete from record where username="+"'"+str+"'";
                           System.out.println(st.executeUpdate(query)+" "+query);
                  jTextField2.setText("");
                            System.out.println("swap");
                  DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                while(model.getRowCount()>0)
                 {
                      model.removeRow(0);
                      System.out.print("swap");
                  }
              String[] string12=new String[1];
              Thread.sleep(1000);
                 main(string12);
              }else if(string.contains("back"))
               {
                   new Admin().setVisible(true);
                   String[] s=new String[1];
                   Admin.main(s);
               }   

              }

        catch(Exception e){e.printStackTrace();}

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user().setVisible(true);
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
