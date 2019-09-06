package H05;

import java.applet.Applet;
import java.awt.*;

public class staafdiagram extends Applet {

    int GewichtValerie;
    int HoogteXas;
    int GewichtJeroen;
    int GewichtHans;


    @Override
    public void init() {
        setSize(400,400);
        GewichtValerie=40;
        HoogteXas=350;
        GewichtJeroen=100;
        GewichtHans=80;

    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(50, 50, 50, HoogteXas);
        g.drawLine(50, HoogteXas, HoogteXas, HoogteXas);

        g.setColor(Color.blue);
        g.fillRect(51, HoogteXas-GewichtValerie, 80, GewichtValerie);
        g.setColor(Color.black);
        g.drawString("Valerie", 167, 415);

        g.setColor(Color.green);
        g.fillRect(151, HoogteXas-GewichtJeroen, 80, GewichtJeroen);
        g.setColor(Color.black);
        g.drawString("Jeroen", 327, 415);

        g.setColor(Color.red);
        g.fillRect(251, HoogteXas-GewichtHans, 80, GewichtHans);
        g.setColor(Color.black);
        g.drawString("Hans", 511, 415);


        g.drawString("40", 30, HoogteXas-GewichtValerie);
        g.drawString("80", 30, HoogteXas-GewichtHans);
        g.drawString("100", 30, HoogteXas-GewichtJeroen);








    }

}



