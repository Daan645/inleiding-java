package Challange;

import java.applet.Applet;
import java.awt.*;

public class MaakEenKunstwerk extends Applet {
    @Override
    public void init() {
        setSize(500,500);

    }

    public void paint(Graphics g) {
        setBackground(Color.black);

        g.setColor( Color.yellow);
        g.fillRect(50,50,100,100);

        g.setColor(Color.white);
        g.fillRect(160,50,110,100);

       g.fillRect(50,160,100,70);

        g.fillRect(160,160,80,70);

        g.fillRect(250,190,20,40);

        g.setColor(Color.blue);
       g.fillRect(250,160,20,20);


    }
}
