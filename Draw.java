/* WRITE A SWING PROGRAM TO DRAW RECTANGLE AND CIRCLE */

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;

public class Draw extends Canvas{

    public void paint(Graphics g){

//      blank rectangle and circle
        g.drawRect(100,100,200,100);
        g.drawOval(150,250,100,100);
//      fill rectalge and circle
        g.setColor(Color.CYAN);
        g.fillRect(500,100,200,100);
        g.fillOval(550,250,100,100);

    }
    public static void main(String[]s){
        Draw m = new Draw();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Drawing");
        f.setSize(800,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
