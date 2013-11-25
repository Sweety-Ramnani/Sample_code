

package mary;
import com.sun.speech.freetts.*;

import java.util.*;

public class voice
{
private String speaktext;
public void dospeak(String speak,String
voice)
{
speaktext = speak; 
try
{
VoiceManager voiceManager = VoiceManager.getInstance();
Voice voices = 
voiceManager.getVoice(voice);

Voice sp=null;
if(voices!=null)
{
sp=voices; 

}
else
{
System.out.println("No Voice Available");
}

//========================
 sp.allocate();
sp.speak(speaktext);
sp.deallocate();
//=========================
}catch(Exception e){}
} 
public static void main(String[] args)
{

}

}