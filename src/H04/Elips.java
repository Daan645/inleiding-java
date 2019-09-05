import javax.swing.*;
import java.applet.*;
import java.awt.*;

    public class Elips extends Applet {

    @Override
    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(20,20,100,50,0,360);
    }
}