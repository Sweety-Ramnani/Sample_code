/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame3.java
 *
 * Created on Jul 16, 2013, 6:24:03 AM
 */

package mary;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.lang.*;
import java.io.*;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author welcome-raj
 */
public class NewJFrame3 extends javax.swing.JFrame {

    /** Creates new form NewJFrame3 */
    public NewJFrame3() {
        initComponents();
    }

    public static String details[] = new String [11];
    public static String str;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 8, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mary/5.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 80)); // NOI18N
        jLabel2.setText("MAKE MY TRIP ++");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setText("We know where you are going..... We would love to plan your trip.....");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mary/5.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("FIRST NAME :");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("LAST NAME :");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("AGE :");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("GENDER :");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setText("FLIGHT ID :");

        jTextField1.setEditable(false);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));

        jTextField2.setEditable(false);
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));

        jTextField3.setEditable(false);
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));

        jTextField4.setEditable(false);
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jTextField5.setEditable(false);
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel11.setText("SOURCE :");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel12.setText("DESTINATION :");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel13.setText("DEPARTURE TIME :");

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel14.setText("ARRIVAL TIME :");

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel15.setText("TICKET PRICE :");

        jTextField6.setEditable(false);
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jTextField7.setEditable(false);
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jTextField8.setEditable(false);
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jTextField9.setEditable(false);
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jTextField10.setEditable(false);
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel16.setText("Important note : Please be at the airport an hour before the scheduled departure of the airline for security purposes.");

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel17.setText("For ticket cancellations and refund procedures call our toll free number 01230123.");

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel18.setText("Maximum luggage load for 1 person is 15kg. If the luggage load exceeds then it will be charged Rs100 per kg.");

        jButton1.setText("Continue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel19.setText("DATE :");

        jTextField12.setEditable(false);

        jLabel20.setText("APPLICATION");

        jLabel21.setText("USER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextField4))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextField3))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextField2))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(109, 109, 109)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField10)
                                    .addComponent(jTextField9)
                                    .addComponent(jTextField8)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel17))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                                            .addComponent(jTextField12))))
                                .addGap(189, 189, 189)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(165, 165, 165))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

             this.setVisible(false);
           
        new NewJFrame4_1().setVisible(true);
    NewJFrame4_1.main(st);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.setVisible(false);
//        new NewJFrame().setVisible(true);
       TestSoundRecordingUtil tsru= new TestSoundRecordingUtil();
       NewJFrame f = new NewJFrame();
            final SoundRecordingUtil recorder = f.get();
        tsru.record(1,recorder,time);
NewJFrame.main(st);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
static String[] st=new String[3];

    /**
    * @param args the command line arguments
    */
    public static String time,answer,string;
    public static text tx=new text();
    public static void main(String args[]) {
        details[0]=args[0];
        details[1]=args[1];
        details[2]=args[2];
        details[3]=args[3];
        details[4]=args[4];
        details[5]=args[5];
        details[6]=args[6];
        details[7]=args[7];
        details[8]=args[8];
        details[9]=args[9];
        details[10]=args[12];
        time=args[10];
        st[0]=args[0];
        st[1]=args[11];
        st[2]=time;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame3().setVisible(true);
            }
        });

        try{
             voice obj=new voice();
             
            
            
           

             
                
               tx.text1(str,time);
             String str="Here is your ticket! ";
             tx.text1(str, time);
             obj.dospeak(str,"kevin16");
             str="Thank you for using make my trip++!";
             tx.text1(str, time);
             jTextField1.setText(details[0]);
             jTextField2.setText(details[1]);
             jTextField3.setText(details[2]);
             jTextField4.setText(details[3]);
             jTextField6.setText(details[4]);
             jTextField7.setText(details[5]);
             jTextField8.setText(details[6]);
             jTextField9.setText(details[7]);
             jTextField10.setText(details[8]);
             jTextField5.setText(details[9]);
              jTextField11.setText(details[10]);
             
             
            str="Do you Want to Book more tickets ! say continue to book or Logout";
         obj.dospeak(str,"kevin16");
             
            tx.text1(str, time);
        jTextField12.setText(str);
        wait(str);
        string = answer;
        
        if(string.contains("continue")||string.contains("Continue")) 
        {
            jButton1.doClick();
        
        }  
                   
         else if(string.contains("Logout")||string.contains("logout")) 
        {
            jButton2.doClick();
        
        }  
             
        }
        catch(Exception e){
        e.printStackTrace();};
    }


public static void wait(String str){
        String str1;
     //   int i=0;
    sleep();
    if(str.length()<1)
        str="Sir";
    
    try{
        str1=jTextField13.getText();
  //  while(true){
        
    while(jTextField13.getText().isEmpty())
    {    
        sleep();
    }
    answer=jTextField13.getText();
           
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
              str=jTextField13.getText();
              Thread.sleep(2000);
              while(! jTextField13.getText().equals(str))
              {
                  str=jTextField13.getText();
                  Thread.sleep(2000);
              }
             rb.keyPress(KeyEvent.VK_CONTROL);
            rb.keyPress(KeyEvent.VK_1);
            rb.keyRelease(KeyEvent.VK_CONTROL);
            rb.keyRelease(KeyEvent.VK_1);

    }catch(Exception e){}
}















    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton jButton1;
    private static javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField10;
    private static javax.swing.JTextField jTextField11;
    private static javax.swing.JTextField jTextField12;
    private static javax.swing.JTextField jTextField13;
    private static javax.swing.JTextField jTextField2;
    private static javax.swing.JTextField jTextField3;
    private static javax.swing.JTextField jTextField4;
    private static javax.swing.JTextField jTextField5;
    private static javax.swing.JTextField jTextField6;
    private static javax.swing.JTextField jTextField7;
    private static javax.swing.JTextField jTextField8;
    private static javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables



}
