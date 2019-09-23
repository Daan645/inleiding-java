package H11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht1 extends Applet {
    TextField tafelnummer;
    String tekst;
    Button knopOk;
    Label label;
    int invoer;


    public void init() {
        setSize(500, 500);

        tafelnummer = new TextField("", 30);
        knopOk = new Button("OK");
        label = new Label("Type iets in het tekstvak en klik op OK.");
        tekst = "";
        add(label);
        add(tafelnummer);
        add(knopOk);

        knopOk.addActionListener(new knopOkListener());

    }


    public void paint(Graphics g) {
        for (int i = 1; i <= 10; i++) {
            g.drawString(i + "x" + invoer + "=" + (i * invoer), 50, 50 + i * 20);
        }
    }

    private class knopOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst = tafelnummer.getText();
            invoer = Integer.parseInt(tekst);

            repaint();
        }
    }
}
