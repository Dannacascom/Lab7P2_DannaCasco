
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class MainLab7 extends javax.swing.JFrame {
    ArrayList<Carpeta> car = new ArrayList();
    ArrayList<Archivo> ar = new ArrayList();

    unidad u = new unidad ();
    destacados d = new destacados();
    papelera p = new papelera();


    public MainLab7() {
        initComponents();
    }

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        botones = new javax.swing.JPanel();
        miUnidadB = new javax.swing.JButton();
        destacadosB = new javax.swing.JButton();
        papeleraB = new javax.swing.JButton();
        crear = new javax.swing.JButton();
        bar = new javax.swing.JProgressBar();
        treeP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        miUnidadB.setText("Mi unidad");
        miUnidadB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miUnidadBMouseClicked(evt);
            }
        });
        miUnidadB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUnidadBActionPerformed(evt);
            }
        });

        destacadosB.setText("Destacados");
        destacadosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destacadosBActionPerformed(evt);
            }
        });

        papeleraB.setText("Papelera");
        papeleraB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papeleraBActionPerformed(evt);
            }
        });

        crear.setText("Crear");
        crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearMouseClicked(evt);
            }
        });
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonesLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(papeleraB, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destacadosB, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(miUnidadB, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        botonesLayout.setVerticalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(miUnidadB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(destacadosB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(papeleraB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout treePLayout = new javax.swing.GroupLayout(treeP);
        treeP.setLayout(treePLayout);
        treePLayout.setHorizontalGroup(
            treePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );
        treePLayout.setVerticalGroup(
            treePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.png"))); // NOI18N
        jLabel1.setText("GOOGLE DRIVE\n");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(treeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(treeP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miUnidadBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miUnidadBMouseClicked
        // TODO add your handling code here:
        
        
      
    }//GEN-LAST:event_miUnidadBMouseClicked

    private void miUnidadBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUnidadBActionPerformed
        // TODO add your handling code here:
        u.setSize(300,300);
        u.setLocation(0,0);
        treeP.removeAll();
        treeP.add(u,BorderLayout.CENTER);
        treeP.revalidate();
        treeP.repaint();
        
         
    }//GEN-LAST:event_miUnidadBActionPerformed

    private void destacadosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destacadosBActionPerformed
        // TODO add your handling code here:
        
        d.setSize(300,300);
        d.setLocation(0,0);
        treeP.removeAll();
        treeP.add(d,BorderLayout.CENTER);
        treeP.revalidate();
        treeP.repaint();
        
    }//GEN-LAST:event_destacadosBActionPerformed

    private void papeleraBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papeleraBActionPerformed
        // TODO add your handling code here:
        p.setSize(300,300);
        p.setLocation(0,0);
        treeP.removeAll();
        treeP.add(p,BorderLayout.CENTER);
        treeP.revalidate();
        treeP.repaint();
    }//GEN-LAST:event_papeleraBActionPerformed

    private void crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMouseClicked
        // TODO add your handling code here:
        
      
        DefaultTreeModel modelo;
        if (treeP.isVisible()) {
            modelo = (DefaultTreeModel) u.getTree().getModel();
        } else {
            modelo = (DefaultTreeModel) d.getTree().getModel();
        }
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();

         String[] opciones = {"Archivo", "Carpeta"};
        String op = (String) JOptionPane.showInputDialog(this, "Seleccione una opción", "Creacion", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
        String name ;
        String link;
        if (op.equals("Carpeta")) {
            name = JOptionPane.showInputDialog(this, "Nombre de carpeta:");
            Carpeta c = new Carpeta(
                    name,
                    "dive.google.com/" + cadenaAleatoria(5)
            );
            car.add(c);

            DefaultMutableTreeNode carp = new DefaultMutableTreeNode(c);
            raiz.add(carp);
        } else {
            name = JOptionPane.showInputDialog(this, "Nombre de Archivo:");
           String[] ext = {"pdf", "docx","txt","png","jpg"};
            Archivo arc = new Archivo(
                    name,
                    "dive.google.com/" +cadenaAleatoria(10),
                     
           (String) JOptionPane.showInputDialog(this, "Seleccione una opción", "Creacion", JOptionPane.PLAIN_MESSAGE, null, ext, ext[0]),
                    Integer.parseInt(JOptionPane.showInputDialog(this, "Tamaño:"))
            );
            ar.add(arc);

            DefaultMutableTreeNode a = new DefaultMutableTreeNode(arc);
            raiz.add(a);
        }
        modelo.reload();
    }//GEN-LAST:event_crearMouseClicked

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearActionPerformed

    
    public static String cadenaAleatoria(int longitud) {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String cadena = "";
        for (int x = 0; x < longitud; x++) {
            int indiceAleatorio = numeroAleatorioEnRango(0, chars.length() - 1);
            char caracterAleatorio = chars.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }

    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
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
            java.util.logging.Logger.getLogger(MainLab7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainLab7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainLab7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainLab7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainLab7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel botones;
    private javax.swing.JButton crear;
    private javax.swing.JButton destacadosB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton miUnidadB;
    private javax.swing.JButton papeleraB;
    private javax.swing.JPanel treeP;
    // End of variables declaration//GEN-END:variables
}
