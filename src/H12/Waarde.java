package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Waarde extends Applet {
    TextField tekstvak;
    String s, tekst;
    int[] getallen = {10, 10, 10, 20, 20, 30, 30, 40, 50};


    public void init() {
        setSize(500, 500);
        tekstvak = new TextField(20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);

        tekst = new String();

    }


    public void paint(Graphics g) {
        g.drawString(tekst, 130, 50);

    }

    public class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < getallen.length; i++) {
                getallen[0] = 10;
                getallen[1] = 20;
                getallen[2] = 30;
                getallen[3] = 40;
                getallen[4] = 50;
                s = tekstvak.getText();
                int cijfer = Integer.parseInt(s);
                if (cijfer == getallen[0]) {
                    tekst = "De waarde " + cijfer + " komt 3 keer voor";
                }
                if (cijfer == getallen[1]) {
                    tekst = "De waarde " + cijfer + " komt 2 keer voor";
                }
                if (cijfer == getallen[2]) {
                    tekst = "De waarde " + cijfer + " komt 2 keer voor";
                }
                if (cijfer == getallen[3]) {
                    tekst = "De waarde " + cijfer + " komt 1 keer voor";
                }
                if (cijfer == getallen[4]) {
                    tekst = "De waarde " + cijfer + " komt 1 keer voor";
                }
                else  {
                    tekst = "Het getal dat u heeft ingevoerd bestaat niet!";
                }

                repaint();

            }
        }
    }
}
