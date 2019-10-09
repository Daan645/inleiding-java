package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Muren extends Applet {
    Button rodeMuur;
    Button grijzeMuur;
    boolean rood;
    boolean grijs;


    public void init() {
        setSize(500, 500);

        rood = false;
        grijs = false;

        rodeMuur = new Button("Rode Muur");
        rodeMuur.addActionListener( new RodeMuurListener());
        add(rodeMuur);

        grijzeMuur = new Button("Grijze Muur");
        grijzeMuur.addActionListener( new GrijzeMuurListener());
        add(grijzeMuur);
    }


    public void paint(Graphics g) {
        if (rood) {
            g.setColor(Color.red);
            tekenmuur(g, 50, 50, 100, 50);
            tekenmuur(g, 151, 50, 100, 50);
            tekenmuur(g, 252, 50, 100, 50);
            tekenmuur(g, 353, 50, 100, 50);
            tekenmuur(g, 0, 101, 100, 50);
            tekenmuur(g, 101, 101, 100, 50);
            tekenmuur(g, 202, 101, 100, 50);
            tekenmuur(g, 303, 101, 100, 50);
            tekenmuur(g, 404, 101, 100, 50);
            tekenmuur(g, 50, 152, 100, 50);
            tekenmuur(g, 151, 152, 100, 50);
            tekenmuur(g, 252, 152, 100, 50);
            tekenmuur(g, 353, 152, 100, 50);
            tekenmuur(g, 0, 203, 100, 50);
            tekenmuur(g, 101, 203, 100, 50);
            tekenmuur(g, 202, 203, 100, 50);
            tekenmuur(g, 303, 203, 100, 50);
            tekenmuur(g, 404, 203, 100, 50);
            tekenmuur(g, 50, 254, 100, 50);
            tekenmuur(g, 151, 254, 100, 50);
            tekenmuur(g, 252, 254, 100, 50);
            tekenmuur(g, 353, 254, 100, 50);
        }

        if (grijs) {
           g.setColor(Color.gray);
            tekenmuur(g, 50, 50, 120, 60);
            tekenmuur(g, 171, 50, 120, 60);
            tekenmuur(g, 292, 50, 120, 60);
            tekenmuur(g, 413, 50, 120, 60);
            tekenmuur(g, 0, 111, 120, 60);
            tekenmuur(g, 121, 111, 120, 60);
            tekenmuur(g, 242, 111, 120, 60);
            tekenmuur(g, 363, 111, 120, 60);
            tekenmuur(g, 484, 111, 120, 60);
            tekenmuur(g, 50, 172, 120, 60);
            tekenmuur(g, 171, 172, 120, 60);
            tekenmuur(g, 292, 172, 120, 60);
            tekenmuur(g, 413, 172, 120, 60);
            tekenmuur(g, 0, 233, 120, 60);
            tekenmuur(g, 121, 233, 120, 60);
            tekenmuur(g, 242, 233, 120, 60);
            tekenmuur(g, 363, 233, 120, 60);
            tekenmuur(g, 484, 233, 120, 60);
            tekenmuur(g, 50, 294, 120, 60);
            tekenmuur(g, 171, 294, 120, 60);
            tekenmuur(g, 292, 294, 120, 60);
            tekenmuur(g, 413, 294, 120, 60);




        }
        }


    void tekenmuur(Graphics g, int x1, int y1, int width, int height) {

        g.fillRect(x1, y1, width, height);

    }

    public class GrijzeMuurListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            grijs = true;
            rood = false;
            repaint();
        }


    }


public class RodeMuurListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            rood = true;
            grijs = false;
            repaint();

        }
    }
}

