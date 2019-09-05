import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class Staafdiagrammoe extends Applet {

    @Override
    public void paint(Graphics g) {
        g.drawLine(100, 400, 600, 400);
        g.drawLine(100, 100, 100, 400);

        g.setColor(Color.blue);
        g.fillRect(160, 300, 50, 100);
        g.setColor(Color.black);
        g.drawString("Valerie", 167, 415);

        g.setColor(Color.green);
        g.fillRect(320, 150, 50, 250);
        g.setColor(Color.black);
        g.drawString("Jeroen", 327, 415);

        g.setColor(Color.red);
        g.fillRect(500, 240, 50, 160);
        g.setColor(Color.black);
        g.drawString("Hans", 511, 415);

        g.drawString("20 KG", 55, 350);
        g.drawString("40 KG", 55, 300);
        g.drawString("60 KG", 55, 250);
        g.drawString("80 KG", 55, 200);
        g.drawString("100 KG", 55, 150);








    }

}



