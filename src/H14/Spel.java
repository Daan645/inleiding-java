package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Spel extends Applet {
    TextField invoerveld;
    Button zetknop;
    int aantalkruisjes = 23;
    int userinput;
    String tekst = "";
    URL pad;
    Image smiley;


    @Override
    public void init() {
        setSize(1000, 800);

        invoerveld = new TextField(20);
        zetknop = new Button("Zet!");
        add(invoerveld);
        add(zetknop);
        zetknop.addActionListener(new ZetknopListener());
        pad = Spel.class.getResource("/Resources/");
        smiley = getImage(pad, "basic1-119_smiley_neutral-512_40px.png");
    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 50;

        //weergave kruisjes
        for (int i = 0; i < aantalkruisjes; i++) {
            g.drawImage(smiley, x, y, 20, 20, this);
            x += 20;

            if (i == 3 || i == 7 || i == 11 || i == 15 || i == 19) {
                x = 50;
                y += 30;


            }

        }
        g.drawString("" + tekst, 100, 25);
        g.drawString("Er zijn nog " + aantalkruisjes, 300, 25);
    }

    public class ZetknopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String valerietekst = invoerveld.getText();
            userinput = Integer.parseInt(valerietekst);


            if (userinput == 1 || userinput == 2 || userinput == 3) {
                aantalkruisjes -= userinput;
                tekst = "";

                if (aantalkruisjes == 1) {
                    tekst = "Je habt gewonnen";
                    aantalkruisjes = 0;
                } else if (aantalkruisjes == 0) {
                    tekst = "Je habt verloren";
                    aantalkruisjes = 0;
                }


                // computer


                else if (aantalkruisjes == 22) {
                    aantalkruisjes -= 1;

                } else if (aantalkruisjes == 21) {
                    aantalkruisjes -= (int) (Math.random() * 1 + 3);

                } else if (aantalkruisjes == 20) {
                    aantalkruisjes -= 3;

                } else if (aantalkruisjes == 19) {
                    aantalkruisjes -= 2;

                } else if (aantalkruisjes == 18) {
                    aantalkruisjes -= 1;

                } else if (aantalkruisjes == 17) {
                    aantalkruisjes -= (int) (Math.random() * 1 + 3);


                } else if (aantalkruisjes == 16) {
                    aantalkruisjes -= 3;


                } else if (aantalkruisjes == 15) {
                    aantalkruisjes -= 2;


                } else if (aantalkruisjes == 14) {
                    aantalkruisjes -= 1;


                } else if (aantalkruisjes == 13) {
                    aantalkruisjes -= (int) (Math.random() * 1 + 3);


                } else if (aantalkruisjes == 12) {
                    aantalkruisjes -= 3;


                } else if (aantalkruisjes == 11) {
                    aantalkruisjes -= 2;


                } else if (aantalkruisjes == 10) {
                    aantalkruisjes -= 1;


                } else if (aantalkruisjes == 9) {
                    aantalkruisjes -= (int) (Math.random() * 1 + 3);


                } else if (aantalkruisjes == 8) {
                    aantalkruisjes -= 3;


                } else if (aantalkruisjes == 7) {
                    aantalkruisjes -= 2;


                } else if (aantalkruisjes == 6) {
                    aantalkruisjes -= 1;


                } else if (aantalkruisjes == 5) {
                    aantalkruisjes -= (int) (Math.random() * 1 + 3);


                } else if (aantalkruisjes == 4) {
                    aantalkruisjes -= 3;


                } else if (aantalkruisjes == 3) {
                    aantalkruisjes -= 2;


                } else if (aantalkruisjes == 2) {
                    aantalkruisjes -= 1;


                }

            }
            else {
                tekst = "fout getal kies tussen de 1 en 3!!";
            }
            repaint();
        }
    }
}
