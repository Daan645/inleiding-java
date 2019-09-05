import javax.swing.*;
import java.applet.*;
import java.awt.*;

public class Nederlandsevlag extends Applet {

    @Override
    public void paint(Graphics g) {
g.drawLine(20,400,20,20);
g.drawRect(20,20,300,150);
        g.setColor(Color.red);
        g.fillRect(20,20,300,50);
       g.setColor(Color.black);
        g.drawRect(20,20,300,50);
        g.drawRect(20,120,300,50);
        g.setColor(Color.blue);
        g.fillRect(20,120,300,50);



    }
}
