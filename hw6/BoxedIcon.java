/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author chris
 * 
 * puts a box around an icon
 */
public class BoxedIcon implements Icon{

    public BoxedIcon(Icon icon, int aSize)
    {
        size = aSize;
        image = icon;
    }
    
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getIconWidth() {
        return (image.getIconHeight() + 2); //because there will be a 1 pixel space and 1 pixel thick line
    }

    @Override
    public int getIconHeight() {
        return (image.getIconHeight() + 2);
    }
    private int pixel_size;
    private Icon image;
}
