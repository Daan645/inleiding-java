package H06;

import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    double cijfer1;
    double cijfer2;
    double cijfer3;
    double gemiddelde;

    @Override
    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3;
        gemiddelde = gemiddelde * 10;
        gemiddelde= (int) gemiddelde;
        gemiddelde = gemiddelde / 10;

    }


    @Override
    public void paint(Graphics g) {
        g.drawString("gemiddelde cijfer = " +gemiddelde, 20,20);

    }

}

