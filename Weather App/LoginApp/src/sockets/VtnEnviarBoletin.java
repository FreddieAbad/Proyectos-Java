

import java.awt.event.*;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.swing.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VtnEnviarBoletin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(400,300,480,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		}	
	
}

class LaminaMarcoCliente extends JPanel{
	
	public LaminaMarcoCliente(){
	
		JLabel texto=new JLabel("BOLETINES");
		
		add(texto);
	
		campo1=new JTextField(40);
	
		add(campo1);		
	
		miboton=new JButton("Enviar Boletin");
		
		
                
                /////
                EnviaTexto evento=new EnviaTexto();
                
                miboton.addActionListener(evento);
		
                
                
                ///
                add(miboton);
	}
	
	
	private class EnviaTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                
                //campo1.getText();
                Socket misocket=new Socket("192.168.1.11",9999);
            
                DataOutputStream flujoSalida;
                flujoSalida = new DataOutputStream(misocket.getOutputStream());
            //circula lo que capturo en vetanan
                flujoSalida.writeUTF(campo1.getText());
                
                flujoSalida.close();
                        
                
                
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            
            
        }
            
        }
		
		
		
	private JTextField campo1;
	
	private JButton miboton;
	
}