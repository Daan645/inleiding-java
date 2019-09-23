package H11;

import java.applet.Applet;
import java.awt.*;

public class Getallen extends Applet {
int y = 20;
    public void init() {
        setSize(500,500);


    }


    public void paint(Graphics g) {

        for (int i = 20; i > 9; i--){
            g.drawString("" + i, 20,y );
           y += 20;

        }



    }
}


