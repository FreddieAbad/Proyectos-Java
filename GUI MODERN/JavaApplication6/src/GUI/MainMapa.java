package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import javax.swing.UIManager;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author Luis Marcos
 */
public class MainMapa {

   
    public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException{
        try {
//            Desktop.getDesktop().browse(new URI("https://maps.google.es/maps?q=Espa%C3%B1a&output=embed"));
        } catch (Exception ex) {
        }
        for(UIManager.LookAndFeelInfo laf:UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(laf.getName()))
                try {
                UIManager.setLookAndFeel(laf.getClassName());
            } catch (Exception ex) {
            }
        }
        MapasPrincipalAdministrador mainF=new MapasPrincipalAdministrador();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        //mainF.setLocation(d.width-(mainF.getWidth()+50), 50);
        mainF.setSize(750, 630);
//        mainF.setSize(550, 630);
        mainF.setLocationRelativeTo(null);
        mainF.setVisible(true);
       
    }
}
