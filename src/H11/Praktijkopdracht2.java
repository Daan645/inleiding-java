package H11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht2 extends Applet {
    String tekst;
    Button knopOk;
    Label label;
    int nummer;


    public void init() {
        setSize(500, 500);


        knopOk = new Button("OK");
        label = new Label("Type iets in het tekstvak en klik op OK.");
        tekst = "";
        add(label);

        add(knopOk);

        knopOk.addActionListener(new Praktijkopdracht2.knopOkListener());

    }


    public void paint(Graphics g) {
        for (int i = 1; i <= 10; i++) {
            g.drawString(i + "x" + nummer + "=" + (i * nummer), 50, 50 + i * 20);
        }
    }

    private class knopOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            nummer++;
            repaint();

        }
    }
    }
