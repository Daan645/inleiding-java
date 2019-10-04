package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet {
    String[] namen;
    String[] nummers;
    TextField tekstvaknamen;
    TextField tekstvaknummers;
    Label labelnamen;
    Label labelnummers;
    Button okKnopnamen;
    String namenstring;
    String nummerstring;

    int aantal;

    public void init() {
        setSize(1000, 1000);

        labelnamen = new Label("Voer hier de namen in");
        add(labelnamen);

        okKnopnamen = new Button("OK");
        add(okKnopnamen);

        okKnopnamen.addActionListener(new OkKnopnamenListener());
        tekstvaknamen = new TextField(20);
        add(tekstvaknamen);


        labelnummers = new Label("Voer hier de nummers in");
        add(labelnummers);

        tekstvaknummers = new TextField(20);
        add(tekstvaknummers);

        namen = new String[10];
        nummers = new String[10];






    }


    public void paint(Graphics g) {
        int y = 50;
        int x1 = 50;
        int x2 = 150;

        if (aantal > 0){
            for (int i = 0; i < namen.length ; i++) {
                g.drawString("" + namen[i],x1,y);
                g.drawString("" + nummers[i],x2,y);

                y += 20;

            }
        }

    }

    public class OkKnopnamenListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
                namenstring = tekstvaknamen.getText();
                namen[aantal] = namenstring;

                nummerstring = tekstvaknummers.getText();
                nummers[aantal] = nummerstring;

                aantal++;
                if (aantal == 10){
                    repaint();



            }

        }



            }

    }



