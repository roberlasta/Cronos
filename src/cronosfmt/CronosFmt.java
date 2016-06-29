/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronosfmt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author roberto.salinas
 */
public class CronosFmt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     final ArrayList<Persona> listaPersonas;
     final ArrayList<Fichada> listaFichadas;
        
        // conectar a mdb
     Connection conexion;
     java.sql.Statement sentencia;   
     final String controlador;
     final String nombre_bd;
     final String usuarioBD;
     final String passwordBD;
     String sItem;
     sItem = "Ningun Item";
     nombre_bd="C:\\cronos\\CronosXXIbasebk.mdb";
     usuarioBD="";
     passwordBD="";
     listaPersonas = new ArrayList();
     listaFichadas = new ArrayList();
     try{
        conexion=DriverManager.getConnection("jdbc:ucanaccess://"+nombre_bd,usuarioBD,passwordBD);
     }
    catch (SQLException e){
             JOptionPane.showMessageDialog(null,"Error al realizar la conexion "+e);
             return ;
    }
    try {
        sentencia=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    }
    catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"Error al crear el objeto sentencia "+e);
            return ;
    }            
    frameCronosFmt cronos = new frameCronosFmt();      
    try{   
        ResultSet rs = sentencia.executeQuery("select * from personas");
        cronos.removeCboxLegajos();
        cronos.setConexion(conexion);
        cronos.setListaPersonas(listaPersonas);
        // levanto las personas y las agrego a la lista de personas
        listaPersonas.clear();
        while(rs.next()){
           sItem = rs.getString("idPersona") + " " + rs.getString("per_nombre") + " " + rs.getString("per_apellido") + " " + rs.getString("per_numero");
           Persona p = new Persona(rs.getString("per_nombre") + " " + rs.getString("per_apellido"),
                   rs.getString("per_numero"),
                   rs.getString("per_tarjeta"), LocalTime.of(8,0), LocalTime.of(16,30), LocalTime.of(0,0), LocalTime.of(0,0));
           listaPersonas.add(p); 
           cronos.addCboxLegajos(p.getLegajo() + " " + p.getNombre());
        }
        cronos.fillPersonas();
    }
    catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"Error al ejecutar query "+e);
        return ;
    }                     

    
    cronos.setVisible(true);           
    }
}
