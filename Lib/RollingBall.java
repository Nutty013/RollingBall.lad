package Lib;

import javax.swing.*;
import java.awt.*;

public class RollingBall extends JPanel {

    private int size = 50;

    private int x = -1;
    private int y = -1;

    private int dx = -2;
    private int angle = 0;

    public RollingBall() {

        Timer timer = new Timer(15, e -> {

            if (x == -1) {
                x = (getWidth() - size) / 2;
                y = (getHeight() - size) / 2;
            }

            x += dx;

            angle += dx;
            angle %= 360;


            if (x + size >= getWidth()) {
                dx = -2;
            }

            if (x <= 0) {
                x = 0;
                dx = 2;
            }

            repaint();
        });

        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillArc(x, y, size, size, angle, 180);

        g.setColor(Color.WHITE);
        g.fillArc(x, y, size, size, angle + 180, 180);

        g.setColor(Color.BLACK);

        g.drawOval(x, y, size, size);
    }
}