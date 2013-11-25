package mary;
 
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
import javax.sound.sampled.LineUnavailableException;
 
/**
 * A sample program that tests the SoundRecordingUtil utility class.
 * @author www.codejava.net
 *
 */
public class TestSoundRecordingUtil {
    private static final int RECORD_TIME = 10000;   // 60 seconds   
     
    public static void main(String[] args) {
      /*final SoundRecordingUtil recorder = new SoundRecordingUtil();
        record(0,recorder);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestSoundRecordingUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        record(1,recorder);*/
    }
    public  void record(int i, final SoundRecordingUtil recorder,String time)
    {
File wavFile = new File("D:/audio"+time+".wav");
         
       
         
        // create a separate thread for recording
        Thread recordThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Start recording...");
                    recorder.start();
                } catch (LineUnavailableException ex) {
                    ex.printStackTrace();
                    System.exit(-1);
                }               
            }
        });
         
        if(i==0)
        {recordThread.start();
         
        try {
            Thread.sleep(300);
             System.out.println("STOPPED");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
         System.out.println("STOPPED");
        }
        else{
        try {
            
            recorder.save(wavFile);
            System.out.println("STOPPED");
          //  System.exit(0);
            //recorder.stop();
            System.out.println("STOPPED");
            return;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        }
        System.out.println("DONE");
      

     }
}