package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenAvond extends Applet {

    Button Jongens;
    int JongensCount = 0;
    int MeisjesCount = 0;
    int MannenCount = 0;
    int VrouwenCount = 0;

    Button Meisjes;
    Button Mannen;
    Button Vrouwen;

    public void init() {
        Jongens = new Button("jongens");
        Meisjes = new Button("meisjes");
        Mannen = new Button("mannen");
        Vrouwen = new Button("vrouwen");

        Jongens.addActionListener(new JongensListener());
        Meisjes.addActionListener(new MeisjesListener());
        Mannen.addActionListener(new MannenListener());
        Vrouwen.addActionListener(new VrouwenListener());
        add(Jongens);
        add(Meisjes);
        add(Mannen);
        add(Vrouwen);
    }

    public void paint(Graphics g) {
        g.drawString("aantal jongens: " + JongensCount, 50, 50);
        g.drawString("aantal meisjes: " + MeisjesCount, 50, 70);
        g.drawString("aantal mannen: " + MannenCount, 50, 90);
        g.drawString("aantal vrouwen: " + VrouwenCount, 50, 110);
        g.drawString("Totaal" + (JongensCount + MeisjesCount + MannenCount + VrouwenCount),50,130);
    }


    class JongensListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JongensCount++;
            repaint();
        }
    }

    class MannenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MannenCount++;
            repaint();
        }
    }

    class MeisjesListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MeisjesCount++;
            repaint();
        }
    }

    class VrouwenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            VrouwenCount++;
            repaint();
        }
    }
}






