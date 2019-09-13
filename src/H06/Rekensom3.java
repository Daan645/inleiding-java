package H06;

import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class Rekensom3 extends Applet {

    int a;
    int b;
    int uitkomst;

    @Override
    public void init() {
        a = 2147483647;
        b = 2147483647;
        uitkomst = a + b;

    }


    @Override
    public void paint(Graphics g) {
        g.drawString("2147483647 + 2147483647 = " +uitkomst, 20,20);

    }

}

