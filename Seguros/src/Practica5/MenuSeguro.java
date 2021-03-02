package Practica5;

/**
 * @author Gabriel
 * Esta es la clase MenuSeguro (Interfaz)
 */
public class MenuSeguro extends javax.swing.JFrame {
    /**Esta es una asociación de la clase PanelSeguroVida con la clase MenuSeguro*/
    PanelSeguroVida panelV;
    /**Esta es una asociación de la clase PanelSeguroAuto con la clase MenuSeguro*/
    PanelSeguroAuto panelA;
    /**Esta es una asociación de la clase PanelVisualizarSeguros con la clase MenuSeguro*/
    PanelVisualizarSeguros panelVS;

    /**
     * Creates new form MenuSeguro
     * Este es el constructor de la clase MenuSeguro
     */
    public MenuSeguro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        AgregarSVida = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        AgregarSAuto = new javax.swing.JMenuItem();
        VerTotal = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seguro");

        panelPrincipal.setBackground(new java.awt.Color(0, 102, 255));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(420, 390));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenu3.setText("Seguro De Vida");

        AgregarSVida.setText("Agregar");
        AgregarSVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarSVidaActionPerformed(evt);
            }
        });
        jMenu3.add(AgregarSVida);

        jMenu1.add(jMenu3);

        jMenu4.setText("Seguro De Auto");

        AgregarSAuto.setText("Agregar");
        AgregarSAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarSAutoActionPerformed(evt);
            }
        });
        jMenu4.add(AgregarSAuto);

        jMenu1.add(jMenu4);

        VerTotal.setText("Total");
        VerTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerTotalActionPerformed(evt);
            }
        });
        jMenu1.add(VerTotal);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Este es el metodo que se encarga de agregar el panel PanelSeguroVida al menu
     * @param evt 
     */
    private void AgregarSVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarSVidaActionPerformed
        panelV = new PanelSeguroVida();
        // Ajustando el tamaño
        panelV.setBounds(panelPrincipal.getBounds());
        panelPrincipal.removeAll();
        // Agregando el panel de seguro al principal
        panelPrincipal.add(panelV);
        // Lo agrega pero lo tiene que actualizar la interfaz
        panelPrincipal.updateUI();
    }//GEN-LAST:event_AgregarSVidaActionPerformed

    /**
     * Este es el metodo que se encarga de agregar el panel PanelSeguroAuto al menu
     * @param evt 
     */
    private void AgregarSAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarSAutoActionPerformed
        panelA = new PanelSeguroAuto();
        panelA.setBounds(panelPrincipal.getBounds());
        panelPrincipal.removeAll();
        panelPrincipal.add(panelA);
        panelPrincipal.updateUI();
    }//GEN-LAST:event_AgregarSAutoActionPerformed

    /**
     * Este es el metodo que se encarga de agregar el panel PanelVisualizarSeguros al menu
     * @param evt 
     */
    private void VerTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerTotalActionPerformed
        panelVS = new PanelVisualizarSeguros();
        panelVS.setBounds(panelPrincipal.getBounds());
        panelPrincipal.removeAll();
        panelPrincipal.add(panelVS);
        panelPrincipal.updateUI();
    }//GEN-LAST:event_VerTotalActionPerformed

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
            java.util.logging.Logger.getLogger(MenuSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuSeguro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarSAuto;
    private javax.swing.JMenuItem AgregarSVida;
    private javax.swing.JMenuItem VerTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
