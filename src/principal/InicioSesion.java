
package principal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectito.Archivo;

public class InicioSesion extends javax.swing.JFrame {

    private Archivo nuevo;
    public InicioSesion() {
        initComponents();
        setLocationRelativeTo(null);
        nuevo = new Archivo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new proyectito.TextField();
        txtContraseña = new proyectito.PasswordField();
        regresar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ojo = new javax.swing.JLabel();
        Bentrar = new javax.swing.JLabel();
        iconuser = new javax.swing.JLabel();
        iconcontra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtUsuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtUsuario.setLabelText("USUARIO");
        txtUsuario.setLineColor(new java.awt.Color(51, 51, 51));
        txtUsuario.setName(""); // NOI18N

        txtContraseña.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtContraseña.setLabelText("CONTRASEÑA");
        txtContraseña.setLineColor(new java.awt.Color(51, 51, 51));

        regresar.setBackground(new java.awt.Color(255, 255, 255));
        regresar.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        regresar.setForeground(new java.awt.Color(51, 51, 51));
        regresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconFlecha.png"))); // NOI18N
        regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INICIO DE SESIÓN");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciarsesion.png"))); // NOI18N

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

        Bentrar.setBackground(new java.awt.Color(37, 187, 211));
        Bentrar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Bentrar.setForeground(new java.awt.Color(255, 255, 255));
        Bentrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bentrar.setText("ENTRAR");
        Bentrar.setOpaque(true);
        Bentrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BentrarMouseClicked(evt);
            }
        });

        iconuser.setBackground(new java.awt.Color(255, 255, 255));
        iconuser.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        iconuser.setForeground(new java.awt.Color(51, 51, 51));
        iconuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconUsuario.png"))); // NOI18N

        iconcontra.setBackground(new java.awt.Color(255, 255, 255));
        iconcontra.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        iconcontra.setForeground(new java.awt.Color(51, 51, 51));
        iconcontra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconcontra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconContraseña.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Bentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconcontra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(iconuser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ojo)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(iconuser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iconcontra))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(ojo)))))
                .addGap(103, 103, 103)
                .addComponent(Bentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseClicked
        Lobby ventana  = new Lobby();   
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarMouseClicked
        
    boolean a=true;
    private void ojoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojoMouseClicked
        if (a) {
            txtContraseña.setEchoChar((char)0); // Hace visible el texto del JPasswordField
        } else {
            txtContraseña.setEchoChar('*'); // Restaura el valor original del EchoChar (oculta la contraseña)
        }
        a = !a; // Alterna el valor de la variable booleana     
    }//GEN-LAST:event_ojoMouseClicked

    private void BentrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BentrarMouseClicked
        try {
           nuevo.validarContraseña(txtUsuario.getText(), txtContraseña.getText());
           if (nuevo.valid==true){
                Principal ventana  = new Principal();   
                ventana.setVisible(true);
                this.dispose();
           }else{
               
           }
       } catch (IOException ex) {
           Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_BentrarMouseClicked

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bentrar;
    private javax.swing.JLabel iconcontra;
    private javax.swing.JLabel iconuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ojo;
    private javax.swing.JLabel regresar;
    private proyectito.PasswordField txtContraseña;
    private proyectito.TextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
