package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    TextField tekstvak;
    String s, tekst;
    int cijfer;


    @Override
    public void init() {
        tekstvak = new TextField("",20);
           tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);
        s = new String();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(tekst,20,20);
    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
    s= tekstvak.getText();
    cijfer= Integer.parseInt( s );
    switch (cijfer) {
                case 1:
                    tekst ="Slecht";
                    break;

                case 2:
                    tekst ="Slecht";
                    break;

                case 3:
                    tekst = "Slecht";
                    break;

                case 4:
                    tekst= "Onvoldoende";
                    break;

                case 5:
                    tekst = "Matig";
                    break;

                case 6:
                    tekst = "Voldoende";
                    break;

                case 7:
                    tekst = "Voldoende";
                    break;

                case 8:
                    tekst = "Goed";
                    break;

                case 9:
                    tekst = "Goed";
                    break;

                case 10:
                    tekst = "Goed";
                    break;

                default:
                    tekst = "U heeft het verkeerde cijfer ingevoerd";
                    break;
            }
            repaint();

        }
    }

}
