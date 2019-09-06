package H05;

import java.applet.Applet;
import java.awt.*;

public class vormen extends Applet {
int hoogte;

    @Override
    public void init() {
        hoogte=100;
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(220,20,20,20);
        g.drawRect(20,40,200,hoogte);
        g.setColor(Color.green);
        g.fillRect(250,40,200,hoogte);
        g.setColor(Color.black);
        g.drawOval(250,40,200,hoogte);

        g.setColor(Color.blue);
        g.fillArc(500,40,200,hoogte,0,45);
        g.setColor(Color.black);
       g.drawOval(500,40,200,hoogte);

       g.drawRoundRect(20,160,200,hoogte,20,20);

       g.setColor(Color.red);
        g.fillOval(250,160,200,hoogte);
                g.setColor(Color.black);

                g.drawArc(550,150,100,hoogte,0,360);

    }

}
