package H12;

import java.applet.Applet;
import java.awt.*;

public class Knoppen extends Applet {
Button[] knoppen;
int [] cijfers;
int knopnaam = 1;

    public void init() {
    setSize(500,500);

    knoppen= new Button[25];

        for (int i = 0; i < knoppen.length ; i++) {
            knoppen[i]= new Button(""+knopnaam);
            add(knoppen[i]);
            knopnaam ++;


        }
    }
}
