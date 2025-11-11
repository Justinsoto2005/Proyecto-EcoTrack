/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ecotrack;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author Justi
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private SistemaEcoTrack sistema;
    public VentanaPrincipal() {
        initComponents();

        this.sistema = new SistemaEcoTrack();

        this.sistema.cargarSistema("residuos.txt");

        this.setTitle("EcoTrack - Sistema de Residuos");
        
        cmbCriterio.addItem("Por Tipo");
        cmbCriterio.addItem("Por Peso");
        cmbCriterio.addItem("Por Prioridad");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtDisplayResiduos = new javax.swing.JTextArea();
        btnActualizar = new javax.swing.JButton();
        cmbCriterio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDisplayResiduos.setColumns(20);
        txtDisplayResiduos.setRows(5);
        jScrollPane1.setViewportView(txtDisplayResiduos);

        btnActualizar.setText("Actualizar Lista");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        cmbCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por Tipo", "Por Peso", "Por Prioridad" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar)
                    .addComponent(cmbCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(cmbCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnActualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        String criterioSeleccionado = (String) cmbCriterio.getSelectedItem();
        
        Comparator<Residuo> comparador;
        
        if (criterioSeleccionado.equals("Por Peso")) {
            comparador = sistema.getCompPorPeso();
        } else if (criterioSeleccionado.equals("Por Prioridad")) {
            comparador = sistema.getCompPorPrioridad();
        } else {
            comparador = sistema.getCompPorTipo();
        }
        
        List<Residuo> listaOrdenada = sistema.getResiduosOrdenados(comparador);
        
        txtDisplayResiduos.setText("");
        
        if (listaOrdenada.isEmpty()) {
            txtDisplayResiduos.setText("No hay residuos registrados.");
        } else {
            txtDisplayResiduos.append("ID -- NOMBRE -- TIPO -- PESO (Kg) -- PRIORIDAD\n");
            txtDisplayResiduos.append("--------------------------------------------------------------------------\n");

            for (Residuo r : listaOrdenada) {
                String linea = r.getId() + " -- " +
                               r.getNombre() + " -- " +
                               r.getTipo() + " -- " +
                               r.getPeso() + " -- " +
                               r.getPrioridadAmbiental() + "\n";
                
                txtDisplayResiduos.append(linea);
            }
        }   
    }//GEN-LAST:event_btnActualizarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JComboBox<String> cmbCriterio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDisplayResiduos;
    // End of variables declaration//GEN-END:variables
}
