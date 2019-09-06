import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    @Override
    public void paint(Graphics g) {
        g.drawLine(220,20,20,20);
        g.drawRect(20,40,200,100);
        g.setColor(Color.magenta);
        g.fillRect(250,40,200,100);
        g.setColor(Color.black);
        g.drawOval(250,40,200,100);

        g.setColor(Color.magenta);
        g.fillArc(500,40,200,100,0,45);
        g.setColor(Color.black);
       g.drawOval(500,40,200,100);

       g.drawRoundRect(20,160,200,100,20,20);

       g.setColor(Color.magenta);
        g.fillOval(250,160,200,100);
                g.setColor(Color.black);

                g.drawArc(550,150,100,100,0,360);

    }

}
