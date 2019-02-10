

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor(){
		
		setBounds(500,300,480,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		
                
                ///// crear hilo 
                
                Thread miHilo=new Thread(this);
		
                miHilo.start();
                        
               
        }
	
	private	JTextArea areatexto;

    @Override
    public void run() {
        
            try {
                // System.out.println("fgsdfg");
                ServerSocket miservidor=new ServerSocket(9999);
                while(true){
                    Socket misocket =miservidor.accept();

                    DataInputStream flujoEntrada=new DataInputStream(misocket.getInputStream());

                    String mensajeTexto=flujoEntrada.readUTF();

                    //pongo en area texto
                    areatexto.append("\n "+mensajeTexto);

                    misocket.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(MarcoServidor.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}

