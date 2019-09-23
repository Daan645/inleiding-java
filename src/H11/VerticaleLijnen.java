package H11;

import java.applet.Applet;
import java.awt.*;

public class VerticaleLijnen extends Applet {


    public void init() {
        setSize(500,500);


    }


    public void paint(Graphics g) {
        int teller = 0;
        int x1 = 20;
        int y1 = 100;
        int x2 = 20;
        int y2 = 0;

       while (teller < 10) {
           g.drawLine(x1,y1,x2,y2);
            teller++;
            x1 += 20;
            x2 += 20;
       }



    }
}
