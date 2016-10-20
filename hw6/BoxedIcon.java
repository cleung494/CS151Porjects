/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

/**
 *
 * @author chris
 * 
 * puts a box around an icon
 */
public class BoxedIcon implements Icon{

    /**
    * this program will put a rectangular box around the icon that's specified
    **/
    
    public BoxedIcon(Icon icon, int aSize)
    {
        pixel_size = aSize;
        image = icon;
    }
    
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (pixel_size == 0)
        {
            image.paintIcon(c, g, this.image.getIconWidth(), this.image.getIconHeight());
        }
        else{
            
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D.Double box = new Rectangle.Double(x, y, image.getIconWidth() + pixel_size, + image.getIconHeight() + pixel_size);
        g2.draw(box);
        image.paintIcon(c, g, this.image.getIconWidth(), this.image.getIconHeight());
        }
    }

    @Override
    public int getIconWidth() {
        return (image.getIconHeight() + pixel_size); //because there will be a 1 pixel space and 1 pixel thick line
    }

    @Override
    public int getIconHeight() {
        return (image.getIconHeight() + pixel_size);
    }
    private int pixel_size;
    private Icon image;
}
