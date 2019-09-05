import javax.swing.*;
import java.applet.*;
import java.awt.*;



public class  Dobbelsteen extends Applet{

public void paint(Graphics g){

        getGraphics().drawRoundRect(575,300,240,240,175,175);
        g.fillOval(625,340,50,50);
        g.drawOval(625,340,50,50);
        g.fillOval(715,340,50,50);
        g.drawOval(715,340,50,50);
        g.fillOval(625,450,50,50);
        g.drawOval(625,450,50,50);
        g.fillOval(715,450,50,50);
        g.drawOval(715,450,50,50);
        }
}
