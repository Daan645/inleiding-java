package H13;

import java.applet.Applet;
import java.awt.*;

public class Boom extends Applet {


    public void init() {
        setSize(600, 600);
    }


    public void paint(Graphics g) {
        int x = 50;
        int y = 100;
        for (int i = 0; i < 3; i++) {

            x = 50;

            for (int j = 0; j < 5; j++) {

                tekenstam(g, x, y, 25, 75);

                x += 80;


            }
            y += 200;

        }

    }


    void tekenstam(Graphics g, int x, int y, int width, int height) {
        g.setColor(Color.black);
        g.fillRect(x, y + height, width, height);

        g.setColor(Color.green);
        g.fillOval(x - width, y, width * 3, height);
    }

}
