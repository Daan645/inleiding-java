package H14;

import java.applet.Applet;
import java.awt.*;

public class Test extends Applet {



    @Override
    public void paint(Graphics g) {
        int y = 50;
        for (int i = 1; i < 11 ; i++) {
            g.drawString("Dit is regel " + i,50,y);
            y += 50;

            if(i == 5){
               g.drawString("Nu zijn we op de helft",50, y);
               y += 50;
            }
        }
    }
}
