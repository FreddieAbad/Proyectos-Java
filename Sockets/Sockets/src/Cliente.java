

import javax.swing.*;
import java.awt.event.*; //Implementa ActionListener
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;


public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		}	
	
}

class LaminaMarcoCliente extends JPanel{
	
	public LaminaMarcoCliente(){
	
		JLabel texto=new JLabel("CLIENTE");
		
		add(texto);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		EnviaTexto mievento=new EnviaTexto();
		
		miboton.addActionListener(mievento); // responde al evento de presionar boton
		
		add(miboton);	
		
	}
	
	//EVENTOS QUE CREA SOCKETS
	private class EnviaTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//System.out.println(campo1.getText()); 	// Hace que lo escrito en el area de texto responda a evento
			
			try {
				Socket  miSocket=new Socket("192.168.1.11",9999); /*//Pasa como parametros direccion ip (local en el caso, o sino el cual se alojara)
																	
																	*PASO COMO PUERTO ALGUNO QUE NO ESTE OCUPADO, EN ESTE CASO 9999 QUE ES RARO
																	*SI ME DA UN ERROR HAGO QUE ECLIPSE TRATE LA EXCEPCION
																	*/
				DataOutputStream flujo_salida=new DataOutputStream(miSocket.getOutputStream()); // consigue que fluira
				
				flujo_salida.writeUTF(campo1.getText()); // en campo de salida viajara lo del campo1
				
				flujo_salida.close();//cierro flujo
				
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage()); // cuando no comunica con servidor manda un mensaje a consola cual es el error 
			} 
			
		}
		
	}
	
	
	
		
		
		
	private JTextField campo1;
	
	private JButton miboton;
	
}