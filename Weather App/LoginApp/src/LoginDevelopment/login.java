/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginDevelopment;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;

/**
 *
 * @author USUARIO
 */
public class login {
    
    public static void main(String args[]){
        String Login, Password;

        Login= request.getParameter("Login");

        Password=request.getParameter("Password");

        try{

            Conex Ls = new Conex();

            Connection conn= Ls.getConexion();

            String Consulta="SELECT * FROM caf_tb_usuarios WHERE " + " LoginUsuario ='" + Login + " ' AND " + " PasswordUsuario = '"+ Password+"'";



        ResultSet rs = conn.createStatement().executeQuery(Consulta);





        if (rs.next()){



            out.print("La contraseña es incorrecta");

            session.putValue("LoginUsuario", Login);

            session.putValue("PerfilUsusario",rs.getString(5));

            response.sendRedirect("caf_menu.jsp");

               }

        else

            out.print("El usuario es incorrecto");

        }

        catch (SQLException ex){

               out.print("Error: " + ex.getMessage().toString());

            }
    }
    
}


 


