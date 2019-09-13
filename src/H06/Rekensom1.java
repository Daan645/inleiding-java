package H06;

import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class Rekensom1 extends Applet {

    double a;
    double b;
    double c;
    double uitkomst;
    @Override
    public void init() {
        a = 113;
        b = 4;
        uitkomst = a / b ;
    }


    @Override
    public void paint(Graphics g) {
        g.drawString("Jan krijgt " + uitkomst, 20,20);
        g.drawString("Ali krijgt " + uitkomst, 20,40);
        g.drawString("Jeannette krijgt " + uitkomst, 20,60);
        g.drawString("Ik krijg " + uitkomst, 20,80);
    }

}

