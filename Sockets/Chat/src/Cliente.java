

import javax.swing.*;
import java.awt.event.*; //Implementa ActionListener
import java.io.*;
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

class LaminaMarcoCliente extends JPanel implements Runnable{
	
	public LaminaMarcoCliente(){
		
		nick=new JTextField(5);
		
		add(nick);
	
		JLabel texto=new JLabel("CHAT");
		
		add(texto);
		
		ip=new JTextField(8);
		
		add(ip);
		
		campochat=new JTextArea(12,20);
		
		add(campochat);
		
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		EnviaTexto mievento=new EnviaTexto();
		
		miboton.addActionListener(mievento); // responde al evento de presionar boton
		
		add(miboton);	
		
		Thread mihilo=new Thread(this);  ///creo hilo, paso parametro misma clase
		
		mihilo.start();
				
		
	}
	
	//EVENTOS QUE CREA SOCKETS
	private class EnviaTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//System.out.println(campo1.getText()); 	// Hace que lo escrito en el area de texto responda a evento
			
			campochat.append("\n "+campo1.getText());
			
			
			
			
			try {
				Socket  miSocket=new Socket("192.168.1.11",9999); /*//Pasa como parametros direccion ip (local en el caso, o sino el cual se alojara)
																	
																	*PASO COMO PUERTO ALGUNO QUE NO ESTE OCUPADO, EN ESTE CASO 9999 QUE ES RARO
																	*SI ME DA UN ERROR HAGO QUE ECLIPSE TRATE LA EXCEPCION
								
																	*/
				
				///EMPAQUETO NICK , IP , MENSAJE
				
				PaqueteEnvio datos=new PaqueteEnvio();
				
				datos.setNick(nick.getText());
				
				datos.setIp(ip.getText());
		
				datos.setMensaje(campo1.getText());
				
				ObjectOutputStream paquete_datos=new ObjectOutputStream(miSocket.getOutputStream());//Envio objeto 
				
				paquete_datos.writeObject(datos);//escribo objeto
				
				miSocket.close();
				
				
				
				
				/*
				DataOutputStream flujo_salida=new DataOutputStream(miSocket.getOutputStream()); // consigue que fluira
				
				flujo_salida.writeUTF(campo1.getText()); // en campo de salida viajara lo del campo1
				
				flujo_salida.close();//cierro flujo
				*/
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("Error "+e1.getMessage()); // cuando no comunica con servidor manda un mensaje a consola cual es el error 
			} 
			
		}
		
	}
	
	
	
		
		
		
	private JTextField campo1,  nick , ip;
	
	private JButton miboton;
	
	private JTextArea campochat;

	@Override
	public void run() {
		
		try{
			
			ServerSocket servidor_cliente=new ServerSocket(9090);
			
			Socket cliente;
			
			PaqueteEnvio paqueteRecibido;
			
			while(true){
				
				cliente=servidor_cliente.accept();
				
				ObjectInputStream flujo_entrada=new ObjectInputStream(cliente.getInputStream());
				
				paqueteRecibido=(PaqueteEnvio) flujo_entrada.readObject();//
				
				campochat.append("\n NICK: "+paqueteRecibido.getNick()+"\n IP : "+paqueteRecibido.getIp()+"\n MENSAJE: "+paqueteRecibido.getMensaje());
			}
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
}

class PaqueteEnvio implements Serializable{
	
	private String nick,ip , mensaje;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}