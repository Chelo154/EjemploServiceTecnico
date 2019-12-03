/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Chelo
 */

/*--------------------------------------------------------------------------------------*/
/*El Paquete Dominio Guarda todas las clases propias del modelo de Dominio del Problema*/
/*-------------------------------------------------------------------------------------*/
public class ComandaTecnica {
    /*-----------------Atributos ----------------------*/
    private int id;
    private String fecha;
    private long dniCliente;
    private String nombreCliente;
    private double total;
    private boolean sBackup;
    private boolean formateo;
    private boolean office;
    private double cantidadGB;
    /*----------Constructor---------------*/
    public ComandaTecnica(){
        
    }
     public ComandaTecnica(int id, String fecha, long dniCliente, String nombreCliente, double total, boolean backup, boolean formateo, boolean office, double cantidadGB) {
        this.id = id;
        this.fecha = fecha;
        this.dniCliente = dniCliente;
        this.nombreCliente = nombreCliente;
        this.total = total;
        this.sBackup = backup;
        this.formateo = formateo;
        this.office = office;
        this.cantidadGB = cantidadGB;
    }
    /*----------------Metodos--------------------------*/
    public double calcularTotal(){
        double total = 0;
        if(sBackup) total+=500*cantidadGB;
        if(formateo)total+=1000;
        if(office)total+=500;
        this.total = total;
        return total;
    }
    /*----------------Getters y Setter------------------------*/ 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isBackup() {
        return sBackup;
    }

    public void setBackup(boolean backup) {
        this.sBackup = backup;
    }

    public boolean isFormateo() {
        return formateo;
    }

    public void setFormateo(boolean formateo) {
        this.formateo = formateo;
    }

    public boolean isOffice() {
        return office;
    }

    public void setOffice(boolean office) {
        this.office = office;
    }

    public double getCantidadGB() {
        return cantidadGB;
    }

    public void setCantidadGB(double cantidadGB) {
        this.cantidadGB = cantidadGB;
    }
    
   
}
