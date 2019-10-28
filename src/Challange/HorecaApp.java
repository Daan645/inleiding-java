package Challange;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HorecaApp extends Applet {

    //doubles prijzen
    double fris = 2.25;
    double bier = 2.50;
    double wijn = 2.75;
    double koffie = 2;
    double binnGedist = 3;
    double buitGedist = 3.75;
    double dagomzetTotaal = 0;
    double bestellingTotaal = 0;

    //knoppen
    Button frisknop;
    Button bierknop;
    Button wijnknop;
    Button koffieknop;
    Button binnGedistknop;
    Button buitGedistknop;
    Button nieuweBestellingknop;

    //Strings
    String bestelling;
    String dagomzet;

    public void init() {
        setSize(500, 500);

        //string tekst
        bestelling = "Bestelling totaal =";
        dagomzet = "Totaal dagomzet =";

        //knop fris
        frisknop = new Button("Fris");
        add(frisknop);
        frisknop.addActionListener(new FrisKnopListener());

        //knop bier
        bierknop = new Button("Bier");
        add(bierknop);
        bierknop.addActionListener(new BierKnopListener());

        //knop wijn
        wijnknop = new Button("Wijn");
        add(wijnknop);
        wijnknop.addActionListener(new WijnKnopListener());

        //knop koffie
        koffieknop = new Button("Koffie");
        add(koffieknop);
        koffieknop.addActionListener(new KoffieKnopListener());

        //knop Binnenlands gedestilleerd
        binnGedistknop = new Button("Binn gedist");
        add(binnGedistknop);
        binnGedistknop.addActionListener(new BinnGedistKnopListener());

        //knop Buitenlands gedestilleerd
        buitGedistknop = new Button("Buit gedist");
        add(buitGedistknop);
        buitGedistknop.addActionListener(new BuitGedistKnopListener());

        //knop Nieuwe bestelling
        nieuweBestellingknop = new Button("Nieuwe bestelling");
        add(nieuweBestellingknop);
        nieuweBestellingknop.addActionListener(new NieuweBestellingKnopListener());


    }

    public void paint(Graphics g) {
//strings
        g.drawString(dagomzet + bestellingTotaal , 150, 175);
        g.drawString(bestelling + dagomzetTotaal, 150, 150);
    }

    //actionlisteners

    class FrisKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double prijsfris = bestellingTotaal + fris;
            bestellingTotaal = prijsfris;
            double dagomzetfris = dagomzetTotaal + fris;
            dagomzetTotaal = dagomzetfris;
    repaint();
        }
    }

    class BierKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double prijsbier = bestellingTotaal + bier;
            bestellingTotaal = prijsbier;
            double dagomzetbier = dagomzetTotaal + bier;
            dagomzetTotaal = dagomzetbier;
            repaint();

        }
    }

    class WijnKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double prijswijn = bestellingTotaal + wijn;
            bestellingTotaal = prijswijn;
            double dagomzetwijn = dagomzetTotaal + wijn;
            dagomzetTotaal = dagomzetwijn;
            repaint();


        }
    }

    class KoffieKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double prijskoffie = bestellingTotaal + koffie;
            bestellingTotaal = prijskoffie;
            double dagomzetkoffie = dagomzetTotaal + koffie;
            dagomzetTotaal = dagomzetkoffie;
            repaint();


        }
    }

    class BinnGedistKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double prijsbinngedist = bestellingTotaal + binnGedist;
            bestellingTotaal = prijsbinngedist;
            double dagomzetbinngedist = dagomzetTotaal + binnGedist;
            dagomzetTotaal = dagomzetbinngedist;
            repaint();

        }
    }

    class BuitGedistKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double prijsbuitgedist = bestellingTotaal + buitGedist;
            bestellingTotaal = prijsbuitgedist;
            double dagomzetbuitgedist = dagomzetTotaal + buitGedist;
            dagomzetTotaal = dagomzetbuitgedist;
            repaint();

        }
    }

    class NieuweBestellingKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double reset = 0;
            dagomzetTotaal = reset;




            repaint();

        }
    }


}
