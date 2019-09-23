package H11;

import java.applet.Applet;
import java.awt.*;

public class Cirkels50 extends Applet {

    int teller = 0;

    public void init() {
        setSize(500,500);
    }


    public void paint(Graphics g) {
        while (teller <= 50){
            g.drawArc(10 * teller,10 * teller,1000 - 20 * teller,1000 -20 * teller,0,360);
            teller++;
        }
    }
}