import java.io.*;
import java.net.*;

class ClienteEE{

	public static void main(String[] args){

	 String ip = "192.168.1.11";
	 Socket conexion = null;
	 int PUERTO = 9999;

		try{
			conexion = new Socket(ip,PUERTO);

			DataOutputStream flujoDatosSalida = new DataOutputStream(conexion.getOutputStream());//Creamos objeto para enviar
			flujoDatosSalida.writeUTF("Gracias por aceptarme");  //Mandamos el mensaje al servidor

		}catch(Exception e){

			System.out.println("No se puedo crear la conexion");
			e.printStackTrace();
		}
	}

}