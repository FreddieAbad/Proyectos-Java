

import javax.swing.*;

import java.awt.*;
import java.io.*;
import java.net.*;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		/*
		 * El servidor pasara pendiente el texto y pasara mostrando texto
		 * 
		 * Construyo un hilo <threads> para que permmanezca escuchando
		 * */
	}	
}

class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		
		Thread miHilo=new Thread(this);
		
		miHilo.start();
		}
	
	private	JTextArea areatexto;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		/**
		 * 
		 * Codigo que pasara pendiente de la escucha
		 * */
		//System.out.println("Pendiente");
		
		try {
		
			ServerSocket servidor=new ServerSocket(9999); // crea socket de servidor abierto dado un puerto, paso el puerto como parametro
		
			String  nick,ip,mensaje;
			
			PaqueteEnvio paquete_recibido;
			
			
			while(true){
				
				Socket misocket=servidor.accept(); // permanece a la escucha y esta abierto y acepta conexiones externas
				/*
				DataInputStream flujo_entrada=new DataInputStream(misocket.getInputStream());// hay fljo de datos que usa misocket como socket
				
				String mensaje_texto=flujo_entrada.readUTF();
				
				
				areatexto.append("\n"+mensaje_texto);//agrega texto a area de texto
				*/
				ObjectInputStream paquete_datos=new ObjectInputStream(misocket.getInputStream());
				
				paquete_recibido=(PaqueteEnvio) paquete_datos.readObject();		//agrego cast para que lea objeto
				
				nick=paquete_recibido.getNick();
				
				ip=paquete_recibido.getIp();
				
				mensaje=paquete_recibido.getMensaje();
				
				areatexto.append("\n Nick: "+nick+"\nMenaje : "+ mensaje+"\nPara "+ip);
				
				Socket enviaDestinatario=new Socket(ip, 9090);
				
				ObjectOutputStream paqueteReenvio=new ObjectOutputStream(enviaDestinatario.getOutputStream());
				
				paqueteReenvio.writeObject(paquete_recibido);
				
				paqueteReenvio.close();
					
				enviaDestinatario.close();
				
				misocket.close();
				
			}
		
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
