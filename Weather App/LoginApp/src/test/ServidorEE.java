import java.io.*;
import java.net.*;

public class ServidorEE extends Thread{

	Socket servicio = null;
	DataInputStream flujoDatosEntrada = null;
	DataOutputStream flujoDatosSalida = null;

	public ServidorEE(Socket servicio,DataInputStream x,DataOutputStream y){  //Constructor

		this.servicio = servicio;
		flujoDatosEntrada = x;
		flujoDatosSalida = y;
	}

	public void run(){  //Esto es un metodo, que es lo que correra cada hilo de nustro servidor

		System.out.println("Se acepto una nueva conexion");

		try{

			String mensaje = flujoDatosEntrada.readUTF();  //Recibimos un mensaje

			System.out.println(mensaje);  //Imprimimos el mensaje recibido
		}catch(Exception e){

		}

	}

}