/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author DURGA
 */
public class CommonClassImage_hms{
    public static void addLabelBackgroundimage(JLabel lbl,String path)
    {
        BufferedImage img = null;
        try
        {
            img=ImageIO.read(new File(path));
            Image newing = img.getScaledInstance(lbl.getWidth(),lbl.getHeight(),Image.SCALE_SMOOTH);
          ImageIcon icon = new ImageIcon(newing);
            lbl.setIcon(icon);
         
        } catch (Exception e)
        {
            System.out.println("caught");
        }
    }
}
    

