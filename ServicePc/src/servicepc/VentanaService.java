/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicepc;
import dominio.ComandaTecnica;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import datos.ConectorBD;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Chelo
 */
public class VentanaService extends javax.swing.JFrame {

    /**
     *  Ventana para poder Agregar una Comanda y Filtrar Comandas en base a la Fecha
     */
    private ComandaTecnica comanda;
    public VentanaService() {
        initComponents();
        this.setTitle("Service");
        this.setLocationRelativeTo(null);
        this.txtCantidadGB.setEditable(false);
        this.txtTotal.setEditable(false); 
        refrescar();
        this.setVisible(true);
        comanda = new ComandaTecnica();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDniCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        checkBackUp = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCantidadGB = new javax.swing.JTextField();
        checkFormateo = new javax.swing.JCheckBox();
        checkOffice = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaComandas = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtFechaBuscardor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Service");

        jLabel2.setText("Fecha:");

        jLabel3.setText("Dni del Cliente: ");

        jLabel4.setText("Nombre del Cliente: ");

        checkBackUp.setText("Back Up");
        checkBackUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBackUpActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Datos del Servicio");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Servicios Requeridos");

        jLabel7.setText("Cantidad de GB");

        txtCantidadGB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadGBKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadGBKeyTyped(evt);
            }
        });

        checkFormateo.setText("Formateo");
        checkFormateo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFormateoActionPerformed(evt);
            }
        });

        checkOffice.setText("Paquete Office");
        checkOffice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOfficeActionPerformed(evt);
            }
        });

        jLabel8.setText("Total a Pagar: ");

        btnAgregar.setText("Agregar Comanda");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tablaComandas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaComandas);

        jLabel9.setText("Fecha de Reparacion:  ");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRefrescar.setText("Refrescar");
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkBackUp)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantidadGB))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkFormateo)
                                .addGap(18, 18, 18)
                                .addComponent(checkOffice))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(275, 275, 275))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(49, 49, 49))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 20, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaBuscardor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRefrescar)
                                .addGap(63, 63, 63))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBackUp)
                    .addComponent(jLabel7)
                    .addComponent(txtCantidadGB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkFormateo)
                    .addComponent(checkOffice))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtFechaBuscardor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefrescar)
                        .addGap(80, 80, 80))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBackUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBackUpActionPerformed
        // TODO add your handling code here:
        /*--
        Si el checkButton de Backup Se encuentra tildado, automaticamente le indica al objeto comanda que el
        servicio de Backup esta vigente y habilita el campo cantidad de GB para ser usado
        ---*/
        if(this.checkBackUp.isSelected()){
            comanda.setBackup(true);
            this.txtCantidadGB.setEditable(true);
        }else{
            comanda.setBackup(false);
            this.txtCantidadGB.setEditable(false);
            this.txtCantidadGB.setText("0");
            comanda.setCantidadGB(0);
            calcularTotal();
        }
    }//GEN-LAST:event_checkBackUpActionPerformed

    private void checkFormateoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFormateoActionPerformed
        // TODO add your handling code here:
        /*Si el check  de Formateo se encuentra tildado, le indica al objeto comanda que el servicio de Formateo
        esta vigente y calcula el total */
        if(this.checkFormateo.isSelected()){
            comanda.setFormateo(true);// no entiendo esta linea, si el check de formateo esta tildado
            calcularTotal();
        }
        else{
            comanda.setFormateo(false);
            calcularTotal();
        }
    }//GEN-LAST:event_checkFormateoActionPerformed

    private void checkOfficeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOfficeActionPerformed
        // TODO add your handling code here:
        /*Identico a Formateo, pero con el chek de Office*/
        if(this.checkOffice.isSelected()){
            comanda.setOffice(true);
            calcularTotal();         
        }
        else{
            comanda.setOffice(false);
            calcularTotal();
        }
    }//GEN-LAST:event_checkOfficeActionPerformed

    private void txtCantidadGBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadGBKeyTyped
        // TODO add your handling code here:
        /*Controla que los caracteres que se ingresen al Campo cantidad de Gb sean o Numeros o el . */
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) && c != '.') evt.consume();
        /*Que opinas? abuso te gusta? SIIII amar bb <3*/
    }//GEN-LAST:event_txtCantidadGBKeyTyped

    private void txtCantidadGBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadGBKeyReleased
        // TODO add your handling code here:
        /*Una vez Ingresado el valor, automaticamente calcula el total */
        double cantidadGB = Double.parseDouble(this.txtCantidadGB.getText());
        comanda.setCantidadGB(cantidadGB);
        calcularTotal();
    }//GEN-LAST:event_txtCantidadGBKeyReleased

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        /*Registra una Comanda dentro de la BD, contiene Mensajes de Error en caso de algun altercado*/
        try{
            String fecha = this.txtFecha.getText();
            if(fecha.isEmpty())throw new Exception();
            long dni = Long.valueOf(this.txtDniCliente.getText());
            String nombreCliente = this.txtNombreCliente.getText();
            if(nombreCliente.isEmpty()) throw new Exception();
            comanda.setDniCliente(dni);
            comanda.setFecha(fecha);
            comanda.setNombreCliente(nombreCliente);   
            ConectorBD.agregarComanda(comanda);
            JOptionPane.showMessageDialog(this,"Comanda Agregada");
            limpiar();
            refrescar();
        }
        catch(SQLException e1){
            JOptionPane.showMessageDialog(this,"Hubo un error en la BD \n Detalles del error: "+e1.getMessage());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Debe Completar todos los campos");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        /*Muestra las comandas de acuerdo a la fecha deseada*/
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Fecha");
        modelo.addColumn("Dni del Cliente");
        modelo.addColumn("Nombre del Cliente");
        modelo.addColumn("Backup");     
        modelo.addColumn("Formateo");
        modelo.addColumn("Paquete Office");
        modelo.addColumn("Total");
        try{
            for(ComandaTecnica c : ConectorBD.obtenerComandas(this.txtFechaBuscardor.getText())){
                Object fila[] ={
                    c.getFecha(),
                    c.getDniCliente(),
                    c.getNombreCliente(),
                    c.isBackup(),
                    c.isFormateo(),
                    c.isOffice(),
                    c.getTotal()
                };
                modelo.addRow(fila);
            }
        this.tablaComandas.setModel(modelo);
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        // TODO add your handling code here:        
        refrescar();
        /*bb?hola bebebebeebebebebeebeb estaba tomando awa, ya esta listo el programa
        usalo si queres. ual era el error de la base?
        me toma como separador la , en vez del . y sql piensa que hay un parametro mas guats 
        osea si yo pongo 2.5Gb el double lo muestra como 2,5Gb , sql lee una , y piensa que hay un separarador mas ya entiendo wow 
        mira para que veas esto que es interesante, mira la sintaxis del buscador de fecha si?*/
    }//GEN-LAST:event_btnRefrescarActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JCheckBox checkBackUp;
    private javax.swing.JCheckBox checkFormateo;
    private javax.swing.JCheckBox checkOffice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaComandas;
    private javax.swing.JTextField txtCantidadGB;
    private javax.swing.JTextField txtDniCliente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaBuscardor;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void calcularTotal() {
        /*Invoca al metodo de la comanda CalcularTotal y muestra el valor en pantalla*/
        double total = comanda.calcularTotal();
        this.txtTotal.setText(String.valueOf(total));
    }

    private void refrescar() {
        /*Obtiene todas las comandas agregadas a la BD*/
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Fecha");
        modelo.addColumn("Dni del Cliente");
        modelo.addColumn("Nombre del Cliente");
        modelo.addColumn("Backup");     
        modelo.addColumn("Formateo");
        modelo.addColumn("Paquete Office");
        modelo.addColumn("Total");
        try{
            for(ComandaTecnica c : ConectorBD.obtenerComandas()){
                Object fila[] ={
                    c.getFecha(),
                    c.getDniCliente(),
                    c.getNombreCliente(),
                    c.isBackup(),
                    c.isFormateo(),
                    c.isOffice(),
                    c.getTotal()
                };
                modelo.addRow(fila);
            }
        this.tablaComandas.setModel(modelo);
        }catch(Exception e){
            
        }
        
    }
    private void limpiar(){
        this.txtCantidadGB.setText("");
        this.txtDniCliente.setText("");
        this.txtFecha.setText("");
        this.txtNombreCliente.setText("");
        this.txtTotal.setText("0");
        this.checkBackUp.setSelected(false);
        this.checkFormateo.setSelected(false);
        this.checkOffice.setSelected(false);
    }
}
