package rvt;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.LayoutManager;



public class Grafikaspanelis extends JPanel {
    
    public void drawTriangle(java.awt.Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
    }
    
    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
         g.setColor(Color.RED);
       g.drawRect(10,100, 200, 150);
       g.setColor(Color.BLUE);
       g.drawRect(20, 130, 50, 60);
       drawTriangle(g, 10, 100, 110, 0, 210, 100);
        g.setColor(Color.GREEN);
       g.drawRect(100, 150, 60, 100);
       g.setColor(Color.YELLOW);
       g.fillOval(90, 50, 50, 50);
       
    
    }


    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame("Grafikaspanelis");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        Grafikaspanelis panel = new Grafikaspanelis();
        frame.add(panel);
        frame.setVisible(true);
    }
}
