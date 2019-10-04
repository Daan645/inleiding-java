package H12;

import java.applet.Applet;
import java.awt.*;

public class Getal extends Applet {
    Button okKnop;
    TextField tekstvak;
    int[] getallen;


    public void init() {
        setSize(500, 500);

        okKnop = new Button("OK");
        add(okKnop);
       // okKnop.addActionListener(OkKnopListener);


      //  getallen = new int[1000]
        for (int i = 0; i < getallen.length; i++) {


        }

    }

    private class OkKnopListener {
       // String s = tekstvak.getText(s);
    //    int getallen = Integer.parseInt(s);


    }
}

