/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mary;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;

/**
 *
 * @author dell
 */
public class text {
 
    /**
     *
     * @param con
     */
    public static void  text1(String con,String time) {
        try{ 
        System.out.println(con+time);
  
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("D:/text"+time+".txt", true)));
    out.println(con);
    out.close();
} catch (IOException e) {
    e.printStackTrace();
    //oh noes!
}
    }

    
 public static void main(String[] args)
    {
  text1("tiger","1234");
} }
