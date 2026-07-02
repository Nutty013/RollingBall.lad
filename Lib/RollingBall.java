package Lib;

import javax.swing.*;
import java.awt.*;

public class RollingBall extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int size = 50; 

    
        int x = (getWidth() - size) / 2;
        int y = (getHeight() - size) / 2;


        g.setColor(Color.BLACK);
        g.fillArc(x, y, size, size, 0, 180);

  
        g.setColor(Color.WHITE);
        g.fillArc(x, y, size, size, 180, 180);


        g.setColor(Color.BLACK);
        g.drawLine(x, y + size / 2, x + size, y + size / 2);

        g.drawOval(x, y, size, size);
    }
}