/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.sql.*;
import dominio.ComandaTecnica;
import java.util.ArrayList;
/**
 *
 * @author Chelo
 */
public class ConectorBD {
    /*Clase diseñada para manejar la Conexion con la BD*/
    private static Connection conector;
    
   
    public static void agregarComanda(ComandaTecnica comanda) throws SQLException{
         /*---Agrega una Comanda a la Base de Datos---*/
         
        conectar();
        String total = String.valueOf(comanda.getTotal());
        total.replace(',','.');
        String cantGB = String.valueOf(comanda.getCantidadGB());
        cantGB.replace(',','.');
        Statement s = conector.createStatement();
        String sql = String.format("insert into Comanda(fecha,dniCliente,nombreCliente,total,sbackup,formateo,office,cantidadGB)values('%s',%d,'%s',%s,%b,%b,%b,%s)",
                comanda.getFecha(),comanda.getDniCliente(),comanda.getNombreCliente(),
                total,comanda.isBackup(),comanda.isFormateo(),comanda.isOffice(),cantGB);
        s.execute(sql);
        desconectar();
    }
    public static ArrayList<ComandaTecnica> obtenerComandas() throws SQLException{
        /*---Obtiene todas las Comandas guardadas en la BD----*/
        
        ArrayList<ComandaTecnica> comandas = new ArrayList<>();
        conectar();
        Statement s = conector.createStatement();
        String sql = "SELECT * FROM Comanda";
        ResultSet res = s.executeQuery(sql);
        while(res.next()){
            ComandaTecnica nuevo = new ComandaTecnica(
                    res.getInt("id"),
                    res.getString("fecha"),
                    res.getLong("dniCliente"),
                    res.getString("nombreCliente"),
                    res.getDouble("total"),
                    res.getBoolean("sbackup"),
                    res.getBoolean("formateo"),
                    res.getBoolean("office"),
                    res.getDouble("cantidadGB")                        
            );
            comandas.add(nuevo);
        }
        desconectar();
        return comandas;
    }
      public static ArrayList<ComandaTecnica> obtenerComandas(String fecha) throws SQLException{
         /*---Metodo Sobreescrito, obtiene las Comandas de acuerdo a la fecha que se envie como parametro---*/     
         
        ArrayList<ComandaTecnica> comandas = new ArrayList<>();
        conectar();
        Statement s = conector.createStatement();
        String sql = String.format("SELECT * FROM Comanda WHERE fecha='%s'",fecha);
        ResultSet res = s.executeQuery(sql);
        while(res.next()){
            ComandaTecnica nuevo = new ComandaTecnica(
                    res.getInt("id"),
                    res.getString("fecha"),
                    res.getLong("dniCliente"),
                    res.getString("nombreCliente"),
                    res.getDouble("total"),
                    res.getBoolean("sbackup"),
                    res.getBoolean("formateo"),
                    res.getBoolean("office"),
                    res.getDouble("cantidadGB")                        
            );
            comandas.add(nuevo);
        }
        desconectar();
        return comandas;
    }
    private static void conectar() throws SQLException{
        /*-Se conecta con la BD -*/
        conector = DriverManager.getConnection("jdbc:mysql://localhost/ejemploService","root","");        /*agrega la cadena de conexion*/
    }
    private static void desconectar() throws SQLException{
        /*Se desconecta de la BD*/
        conector.close();
    }
}
