
package shapesdemo;

/**
 *
 * @author ASHISH
 */
import java.awt.*;
import java.applet.Applet;
 

public class ShapesDemo extends Applet {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
          
     
 
    final int maxCharHeight = 15;
 
    public void init() {
        validate();
    }
 
    public void paint(Graphics g) {
        Dimension d = size();
        int x = 5;
        int y = 7;
 final int maxCharHeight = 15;
        Color bg = getBackground();
        Color fg = getForeground();
 
        int gridWidth = d.width / 7;
        int gridHeight = d.height / 2;
        int stringY = gridHeight - 7;
        int rectWidth = gridWidth - 2*x;
        int rectHeight = stringY - maxCharHeight - y;
 
        g.setColor(bg);
        g.draw3DRect(0, 0, d.width - 1, d.height - 1, true);
        g.draw3DRect(3, 3, d.width - 7, d.height - 7, false);
        g.setColor(fg);
 
        // drawLine()
        g.drawLine(x, y+rectHeight-1, x + rectWidth, y); // x1, y1, x2, y2
        g.drawString("drawLine()", x, stringY);
        x += gridWidth;
 
        // drawRect()
        g.drawRect(x, y, rectWidth, rectHeight); // x, y, width, height
        g.drawString("drawRect()", x, stringY);
        x += gridWidth;
 
        // draw3DRect()
        g.setColor(bg);
        g.draw3DRect(x, y, rectWidth, rectHeight, true);
        g.setColor(fg);
        g.drawString("draw3DRect()", x, stringY);
        x += gridWidth;
 
        // drawRoundRect()
        g.drawRoundRect(x, y, rectWidth, rectHeight, 10, 10); // x, y, w, h, arcw, arch
        g.drawString("drawRoundRect()", x, stringY);
        x += gridWidth;
 
        // drawOval()
        g.drawOval(x, y, rectWidth, rectHeight); // x, y, w, h
        g.drawString("drawOval()", x, stringY);
        x += gridWidth;
 
        // drawArc()
        g.drawArc(x, y, rectWidth, rectHeight, 90, 135); // x, y, w, h
        g.drawString("drawArc()", x, stringY);
        x += gridWidth;
 
        // drawPolygon()
        Polygon polygon = new Polygon();
        polygon.addPoint(x, y);
        polygon.addPoint(x+rectWidth, y+rectHeight);
        polygon.addPoint(x, y+rectHeight);
        polygon.addPoint(x+rectWidth, y);
        //polygon.addPoint(x, y); //don't complete; fill will, draw won't
        g.drawPolygon(polygon);
        g.drawString("drawPolygon()", x, stringY);
 
        x = 5 + gridWidth;
        y += gridHeight;
        stringY += gridHeight;
 
        // fillRect()
        g.fillRect(x, y, rectWidth, rectHeight); // x, y, width, height
        g.drawString("fillRect()", x, stringY);
        x += gridWidth;
 
        // fill3DRect()
        g.setColor(bg);
        g.fill3DRect(x, y, rectWidth, rectHeight, true);
        g.setColor(fg);
        g.drawString("fill3DRect()", x, stringY);
        x += gridWidth;
 
        // fillRoundRect()
        g.fillRoundRect(x, y, rectWidth, rectHeight, 10, 10); // x, y, w, h, arcw, arch
        g.drawString("fillRoundRect()", x, stringY);
        x += gridWidth;
 
        // fillOval()
        g.fillOval(x, y, rectWidth, rectHeight); // x, y, w, h
        g.drawString("fillOval()", x, stringY);
        x += gridWidth;
 
        // fillArc()
        g.fillArc(x, y, rectWidth, rectHeight, 90, 135); // x, y, w, h
        g.drawString("fillArc()", x, stringY);
        x += gridWidth;
 
        // fillPolygon()
        Polygon filledPolygon = new Polygon();
        filledPolygon.addPoint(x, y);
        filledPolygon.addPoint(x+rectWidth, y+rectHeight);
        filledPolygon.addPoint(x, y+rectHeight);
        filledPolygon.addPoint(x+rectWidth, y);
        //filledPolygon.addPoint(x, y);
        g.fillPolygon(filledPolygon);
        g.drawString("fillPolygon()", x, stringY);
    
}
}

}

