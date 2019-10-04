package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Tekstvakken extends Applet {
    TextField[] tekstvak;
    int[] cijfers;
    Button okKnop;

    public void init() {
        setSize(800, 500);

        tekstvak = new TextField[5];
        cijfers = new int[5];
        okKnop = new Button("OK");
        add(okKnop);
        okKnop.addActionListener(new OkKnopListener());
        for (int i = 0; i < tekstvak.length; i++) {
            tekstvak[i] = new TextField("", 10);
            add(tekstvak[i]);
        }
    }

    public class OkKnopListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < tekstvak.length; i++) {
                String s = tekstvak[i].getText();
                int input = Integer.parseInt(s);
                cijfers[i] = input;
            }
            Arrays.sort(cijfers);
            for (int i = 0; i < cijfers.length; i++) {
                tekstvak[i].setText(String.valueOf(cijfers[i]));
            }
        }
    }
}
