/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal;

import principal.Lobby;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectito.Archivo;
import proyectito.Usuario;

/**
 *
 * @author yo
 */
public class Registro extends javax.swing.JFrame {

     private Archivo nuevo;
     private Usuario p;
    public Registro() {
        initComponents();
        nuevo= new Archivo();
        setLocationRelativeTo(null);
        grupo.add(radiof);
        grupo.add(radiom);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        txtnombre = new proyectito.TextField();
        jLabel6 = new javax.swing.JLabel();
        txtapep = new proyectito.TextField();
        txtapm = new proyectito.TextField();
        txtUsuario = new proyectito.TextField();
        txtContraseña = new proyectito.PasswordField();
        jPanel1 = new javax.swing.JPanel();
        radiom = new javax.swing.JRadioButton();
        radiof = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        equis = new javax.swing.JLabel();
        Bentrar = new javax.swing.JLabel();
        ojo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtnombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtnombre.setLabelText("NOMBRE (S)");
        txtnombre.setLineColor(new java.awt.Color(51, 51, 51));
        txtnombre.setName(""); // NOI18N

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REGISTRO");

        txtapep.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtapep.setLabelText("APELLIDO PATERNO");
        txtapep.setLineColor(new java.awt.Color(51, 51, 51));
        txtapep.setName(""); // NOI18N

        txtapm.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtapm.setLabelText("APELLIDO MATERNO");
        txtapm.setLineColor(new java.awt.Color(51, 51, 51));
        txtapm.setName(""); // NOI18N

        txtUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtUsuario.setLabelText("USUARIO");
        txtUsuario.setLineColor(new java.awt.Color(51, 51, 51));
        txtUsuario.setName(""); // NOI18N

        txtContraseña.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtContraseña.setLabelText("CONTRASEÑA");
        txtContraseña.setLineColor(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        radiom.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        radiom.setText("Masculino");

        radiof.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        radiof.setText("Femenino");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Sexo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(radiof, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(radiom, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radiof)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radiom)
                .addContainerGap())
        );

        equis.setBackground(new java.awt.Color(255, 255, 255));
        equis.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        equis.setForeground(new java.awt.Color(51, 51, 51));
        equis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconFlecha.png"))); // NOI18N
        equis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equisMouseClicked(evt);
            }
        });

        Bentrar.setBackground(new java.awt.Color(37, 187, 211));
        Bentrar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Bentrar.setForeground(new java.awt.Color(255, 255, 255));
        Bentrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bentrar.setText("CONFIRMAR");
        Bentrar.setOpaque(true);
        Bentrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BentrarMouseClicked(evt);
            }
        });

        ojo.setBackground(new java.awt.Color(255, 255, 255));
        ojo.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        ojo.setForeground(new java.awt.Color(51, 51, 51));
        ojo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconOjo.png"))); // NOI18N
        ojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ojoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtapep, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtapm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(equis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ojo)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(ojo)))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Bentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equis, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void equisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equisMouseClicked
        Lobby ventana  = new Lobby();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_equisMouseClicked
        boolean a;
    private void BentrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BentrarMouseClicked
        try {
            String sexo;
            if(radiof.isSelected()){
                sexo="Femenino";   
            } else {
                sexo="Masculino";
            }
            p=new Usuario(txtnombre.getText(),txtapep.getText(),txtapm.getText(),txtUsuario.getText(),txtContraseña.getText(),sexo);
            nuevo.agregar(p);
            nuevo.guardarGeneral();
            JOptionPane.showMessageDialog(null, "Registrado correctamente");
            txtnombre.setText("");
            txtapep.setText("");
            txtapm.setText("");
            txtUsuario.setText("");
            txtContraseña.setText("");
            grupo.clearSelection();
            txtnombre.requestFocus();
         } catch (IOException ex) {
             Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_BentrarMouseClicked

    private void ojoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojoMouseClicked
        char i = txtContraseña.getEchoChar(); // Almacena el valor actual del EchoChar
        if (a) {
            txtContraseña.setEchoChar((char)0); // Hace visible el texto del JPasswordField
        } else {
            txtContraseña.setEchoChar('*'); // Restaura el valor original del EchoChar (oculta la contraseña)
        }
        a = !a; // Alterna el valor de la variable booleana
    }//GEN-LAST:event_ojoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bentrar;
    private javax.swing.JLabel equis;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel ojo;
    private javax.swing.JRadioButton radiof;
    private javax.swing.JRadioButton radiom;
    private proyectito.PasswordField txtContraseña;
    private proyectito.TextField txtUsuario;
    private proyectito.TextField txtapep;
    private proyectito.TextField txtapm;
    private proyectito.TextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
