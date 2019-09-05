import java.applet.*;
import java.awt.*;

public class GelijkbenigeDriehoek extends Applet {


    @Override
    public void paint(Graphics g) {
        g.drawPolygon(new int[] {20, 30, 40}, new int[] {250, 100, 250}, 3);
    }
}

