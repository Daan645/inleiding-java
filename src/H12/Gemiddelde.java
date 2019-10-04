package H12;

import java.applet.Applet;
import java.awt.*;

public class Gemiddelde extends Applet {
    int[] cijfers;
    int totaal;
    int aantal;


    public void init() {
        cijfers = new int[10];

        for (int i = 0; i < cijfers.length; i++) {
            cijfers[i] = (int) (Math.random() * 100 + 1);
        }


        for (int i = 0; i < cijfers.length; i++) {
            totaal += cijfers[i];
            aantal++;



        }


    }

    public void paint(Graphics g) {
        int x = 50;
        for (int i = 0; i < cijfers.length; i++) {
            g.drawString("" + cijfers[i], x, 25);
            x +=20;

        }

        g.drawString("het gemiddelde is: " + ((double) totaal / aantal), 50, 50);

    }

    }

