package crawler;

import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawler {
  private static final String REGEX = "^href=";
  
  public static void main(String ...s)
  {
    Pattern p = Pattern.compile(REGEX);
    try {
      StringBuilder sb = new StringBuilder();
      Desktop.getDesktop().browse(new URI("https://www.facebook.com/"));
      Robot r = new Robot();
      int a = KeyEvent.VK_A; 
      int control=KeyEvent.VK_CONTROL;
      
       int alt=KeyEvent.VK_ALT;
       int tab=KeyEvent.VK_TAB;
  
       r.keyPress(alt);
       r.keyPress(tab);
       r.keyRelease(alt);
       r.keyRelease(tab);   
       
      /* r.mousePress(InputEvent.BUTTON1_MASK);
       r.mouseRelease(InputEvent.BUTTON1_MASK);*/
      // the A key
      r.keyPress(control);
      r.keyPress(a);
      // later...
      r.keyRelease(control);
      r.keyRelease(a);
      
    
      URL google = new URL("https://www.google.co.in");
      URLConnection conn = google.openConnection();
      conn.setRequestProperty("Accept-Language", "en-US");
      BufferedReader in = new BufferedReader (
          new InputStreamReader(conn.getInputStream()));
          String inputLine;
          while ((inputLine = in.readLine()) != null)
            sb.append(inputLine);
          in.close();
          System.out.println(sb.toString());
    }
    catch (Exception e) {
      e.printStackTrace();
    }
   
  }
  

}
