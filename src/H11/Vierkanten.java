package H11;

import java.applet.Applet;
import java.awt.*;

public class Vierkanten extends Applet {
    int x = 0;
int y = 0;
int teller = 0;


    public void init() {
        setSize(500,500);
    }

    public void paint(Graphics g) {
        while (teller < 5) {
            y += 50;
            x += 50;
            g.drawRect(x,y,50,50);
            teller++;

        }

    }
}
