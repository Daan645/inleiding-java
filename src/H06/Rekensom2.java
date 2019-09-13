package H06;

import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class Rekensom2 extends Applet {

    int seconden;
    int uitkomstuur;
    int uitkomstdag;
    int uitkomstjaar;
    @Override
    public void init() {
        seconden = 60;
        uitkomstuur = seconden * seconden;
        uitkomstdag = uitkomstuur * 24;
        uitkomstjaar = (uitkomstdag * 7) * 52;
    }


    @Override
    public void paint(Graphics g) {
        g.drawString("Seconden in een uur = " + uitkomstuur, 20,20);
        g.drawString("Seconden in een dag = " + uitkomstdag, 20,40);
        g.drawString("Seconden in een jaar = " + uitkomstjaar, 20,60);
    }

}

