import java.awt.*;
import java.applet.*;
/* <applet code="AppletTest" width=200 height= 100>
</applet>
*/
public class AppletTest extends Applet {

    public void init() {
        System.out.println("Applet Initialised...");
        setBackground(Color.cyan);
    }
    public void start() {
        System.out.println("Applet Started. ");
    }
    public void stop() {
        System.out.println("Applet Stopped. ");
    }
    public void destroy() {
        System.out.println("Applet Destroyed.   ");
    }
    public void paint(Graphics g) {
        g.drawString("Applet Text", 200, 400);
        showStatus("This is shown in Status.");
    }
}
