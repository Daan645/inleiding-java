package H11;

import java.applet.Applet;
import java.awt.*;

public class Cirkels100 extends Applet {

    int teller = 0;

    public void init() {
        setSize(1920,1080);
    }


    public void paint(Graphics g) {
        while (teller <= 100){
            g.drawArc(10 * teller,10 * teller,2000 - 20 * teller,2000 -20 * teller,0,360);
            teller++;
        }
    }
}