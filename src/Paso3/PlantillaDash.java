package Paso3;


public class PlantillaDash extends javax.swing.JFrame {

   
    public PlantillaDash() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LienaRecta = new javax.swing.JButton();
        tablero = new javax.swing.JPanel();
        Cuadrado = new javax.swing.JButton();
        Circulo = new javax.swing.JButton();
        LienaRecta1 = new javax.swing.JButton();
        tablero2 = new javax.swing.JPanel();
        tablero1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LienaRecta.setBackground(new java.awt.Color(51, 153, 255));
        LienaRecta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LienaRecta.setForeground(new java.awt.Color(255, 255, 255));
        LienaRecta.setText("BRUJA - LINEAS");
        LienaRecta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LienaRectaMouseClicked(evt);
            }
        });
        LienaRecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LienaRectaActionPerformed(evt);
            }
        });

        tablero.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout tableroLayout = new javax.swing.GroupLayout(tablero);
        tablero.setLayout(tableroLayout);
        tableroLayout.setHorizontalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 919, Short.MAX_VALUE)
        );
        tableroLayout.setVerticalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        Cuadrado.setBackground(new java.awt.Color(51, 153, 255));
        Cuadrado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Cuadrado.setForeground(new java.awt.Color(255, 255, 255));
        Cuadrado.setText("PANDA - POLIGONOS");
        Cuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuadradoMouseClicked(evt);
            }
        });
        Cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadradoActionPerformed(evt);
            }
        });

        Circulo.setBackground(new java.awt.Color(51, 153, 255));
        Circulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Circulo.setForeground(new java.awt.Color(255, 255, 255));
        Circulo.setText("ABEJA -  CIRCULOS");
        Circulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CirculoMouseClicked(evt);
            }
        });
        Circulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CirculoActionPerformed(evt);
            }
        });

        LienaRecta1.setBackground(new java.awt.Color(51, 153, 255));
        LienaRecta1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LienaRecta1.setForeground(new java.awt.Color(255, 255, 255));
        LienaRecta1.setText("IMAGEN ACOPLADA");
        LienaRecta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LienaRecta1MouseClicked(evt);
            }
        });
        LienaRecta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LienaRecta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablero2Layout = new javax.swing.GroupLayout(tablero2);
        tablero2.setLayout(tablero2Layout);
        tablero2Layout.setHorizontalGroup(
            tablero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        tablero2Layout.setVerticalGroup(
            tablero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout tablero1Layout = new javax.swing.GroupLayout(tablero1);
        tablero1.setLayout(tablero1Layout);
        tablero1Layout.setHorizontalGroup(
            tablero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );
        tablero1Layout.setVerticalGroup(
            tablero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Primer Dibujo Lineas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Segundo dibujo Poligonos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LienaRecta, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Circulo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(Cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(LienaRecta1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tablero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tablero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LienaRecta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Circulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LienaRecta1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(65, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tablero2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LienaRectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LienaRectaActionPerformed
        
    }//GEN-LAST:event_LienaRectaActionPerformed

    private void LienaRectaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LienaRectaMouseClicked
        
        Dibujo2d.Bruja(tablero2.getGraphics());
       
    }//GEN-LAST:event_LienaRectaMouseClicked

    private void CuadradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuadradoMouseClicked
       
        Dibujo2d.Panda(tablero1.getGraphics());
        
    }//GEN-LAST:event_CuadradoMouseClicked

    private void CirculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CirculoMouseClicked
        Dibujo2d.Abeja(tablero.getGraphics());       
    }//GEN-LAST:event_CirculoMouseClicked

    private void LienaRecta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LienaRecta1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LienaRecta1MouseClicked

    private void LienaRecta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LienaRecta1ActionPerformed
        Dibujo2d.paisaje(tablero.getGraphics());
    }//GEN-LAST:event_LienaRecta1ActionPerformed

    private void CirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CirculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CirculoActionPerformed

    private void CuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadradoActionPerformed

 
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlantillaDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlantillaDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlantillaDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlantillaDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlantillaDash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Circulo;
    private javax.swing.JButton Cuadrado;
    private javax.swing.JButton LienaRecta;
    private javax.swing.JButton LienaRecta1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel tablero;
    private javax.swing.JPanel tablero1;
    private javax.swing.JPanel tablero2;
    // End of variables declaration//GEN-END:variables
}
