
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Danna Casco
 */
public class unidad extends javax.swing.JPanel {
destacados d = new destacados();
papelera p = new papelera();
    
    public unidad() {
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

        pop = new javax.swing.JPopupMenu();
        destacar = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JMenuItem();
        jScrollPane3 = new javax.swing.JScrollPane();
        treeu = new javax.swing.JTree();

        destacar.setText("Destacar\n");
        destacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destacarActionPerformed(evt);
            }
        });
        pop.add(destacar);

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        pop.add(eliminar);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treeu.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(treeu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void treeuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeuMouseClicked
        // TODO add your handling code here;
       try {
            if (evt.isMetaDown()) {
                Object obj = treeu.getSelectionPath().getLastPathComponent();
                DefaultMutableTreeNode nod = (DefaultMutableTreeNode) obj;
                if (nod.getUserObject() instanceof Carpeta) {
                    pop.show(treeu, evt.getX(), evt.getY());
                } else if (nod.getUserObject() instanceof Archivo) {
                    pop.show(treeu, evt.getX(), evt.getY());
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_treeuMouseClicked

    private void destacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destacarActionPerformed
        try {
            if (treeu.isVisible()) {
                destacar(treeu);
            } else {
                destacar(d.getTree());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_destacarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
       TreePath selectedPath = treeu.getSelectionPath();
        if (treeu.isVisible()) {
          if (selectedPath != null) {
    DefaultMutableTreeNode nod = (DefaultMutableTreeNode) selectedPath.getLastPathComponent();
    DefaultMutableTreeNode parent = (DefaultMutableTreeNode) nod.getParent();
    if (parent != null) {
        parent.remove(nod);
    } else {
        treeu.setModel(null);
    }
   ((DefaultTreeModel) treeu.getModel()).reload();
               
   
   DefaultTreeModel model; 
               model = (DefaultTreeModel) p.getTree().getModel();
       
           
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.add((DefaultMutableTreeNode) nod);
        model.reload();
           
          }   
        }
    }//GEN-LAST:event_eliminarActionPerformed

    public void destacar(JTree tree){
        Object obj = tree.getSelectionPath().getLastPathComponent();
        DefaultMutableTreeNode nod = (DefaultMutableTreeNode) obj;
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        DefaultMutableTreeNode roots = (DefaultMutableTreeNode) model.getRoot();
        roots.remove(nod);
        model.reload();

        DefaultTreeModel model2;
        if (tree.equals(treeu)) {
            model2 = (DefaultTreeModel) d.getTree().getModel();
        } else if (tree.equals(p.getTree())) {
            model2 = (DefaultTreeModel) treeu.getModel();
        } else {
            model2 = (DefaultTreeModel) treeu.getModel();
        }
        DefaultMutableTreeNode root2 = (DefaultMutableTreeNode) model2.getRoot();
        root2.add((DefaultMutableTreeNode) nod);
        model2.reload();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem destacar;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu pop;
    private javax.swing.JPanel treeP;
    private javax.swing.JPanel treeP1;
    private javax.swing.JTree treeUnidad;
    private javax.swing.JTree treeUnidad1;
    private javax.swing.JTree treeu;
    // End of variables declaration//GEN-END:variables

    void setSize(JPanel treeP) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public JTree getTree() {
        return treeu;
    }
}
