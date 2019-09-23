package h11;

import java.applet.Applet;
import java.awt.*;

public class Tafel3 extends Applet {

    public void init() {
        setSize(600, 600);

    }

    public void paint(Graphics graphics) {


        for (int i = 0; i < 11; i++) {
            graphics.drawString("" + i * 3, 50, 50 + i * 20);



        }

    }


}