package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BTW extends Applet {
    Button okKnop;
    TextField TekstVak;
    Label label;
    String s;
    double Getal;
    double BtwBedrag = 1.21;


    @Override
    public void init() {
        okKnop = new Button("OK");
        okKnop.addActionListener(new okKnopListener());
        add(okKnop);

        TekstVak = new TextField("", 30);
        add(TekstVak);

        label = new Label("typ een getal in");
        add(label);

    }

    @Override
    public void paint(Graphics g) {
        g.drawString(""+ (Getal * BtwBedrag), 50,50);
    }

    class okKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = TekstVak.getText();
            Getal = Double.parseDouble(s);
            repaint();
        }
    }

}
