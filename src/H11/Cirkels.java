package H11;

import java.applet.Applet;
import java.awt.*;

public class Cirkels extends Applet {

int teller = 0;

    public void init() {
    setSize(500,500);
    }


    public void paint(Graphics g) {
    while (teller <= 5){
        g.drawArc(5 * teller,5 * teller,100 - 10 * teller,100 -10 * teller,0,360);
        teller++;
    }
    }
}
