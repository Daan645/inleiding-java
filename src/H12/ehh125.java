import java.applet.Applet;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class ehh125 extends Applet {
    TextField tekstvak;
    String string, s;
    int[] getallen = {20, 20, 30, 30, 40, 40, 50, 10};

    public void init() {
        setSize(500, 500);

        tekstvak = new TextField(20);
        add(tekstvak);
        tekstvak.addActionListener(new TekstvakListener());
    }


    public void paint(Graphics g) {
        g.drawString(string, 50, 50);

    }

    public class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            string = "dit getal is niet gevonden";
            s = tekstvak.getText();
            int userinput = Integer.parseInt(s);
            for (int i = 0; i < getallen.length; i++) {
                if (userinput == getallen[i]) {
                    string = "het getal ="+ userinput + "de index =" + i;

                }
                repaint();
                if (userinput == 30) {
                    break;
                }





            }

        }
    }

}


