package H08;

import javax.swing.*;
import javax.swing.plaf.LabelUI;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Knoppen extends Applet {
    Button OkKnop;
    Button Back;
    Label label;
    TextField Tekstvak;
    String s;



    @Override
    public void init() {
        OkKnop = new Button("Ok");
        add(OkKnop);
        Back = new Button("Return");
        Back.addActionListener(new BackActionListener());
        add(Back);

        Tekstvak = new TextField("", 30);
        add(Tekstvak);
        label = new Label("type hier iets in swa");
        OkKnop.addActionListener(new OKknopActionListener());
        add(label);

    }

    @Override
    public void paint(Graphics g) {
    }

    class OKknopActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            s = Tekstvak.getText();
            label.setText(s);
            repaint();
        }
    }
    class BackActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("");
            Tekstvak.setText("");

        }
    }
}
