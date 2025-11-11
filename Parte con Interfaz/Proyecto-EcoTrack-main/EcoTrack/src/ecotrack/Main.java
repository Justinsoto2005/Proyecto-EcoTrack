package ecotrack;

public class Main {
    
    public static void main(String[] args) {
        // --- PEGA ESTE CÓDIGO AQUÍ ---
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            // (Si Nimbus no está disponible, usará el por defecto)
            ex.printStackTrace();
        }
        // --- FIN DEL CÓDIGO ---

        /*
         * Esto le dice a Java que ponga la tarea de crear
         * y mostrar la ventana en la cola de eventos gráficos.
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // ... (el resto de tu código) ...
            }
        });
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // 1. Creamos una instancia de nuestra ventana
                VentanaPrincipal ventana = new VentanaPrincipal();
                
                // 2. La centramos en la pantalla (opcional pero recomendado)
                ventana.setLocationRelativeTo(null);
                
                // 3. La hacemos visible
                ventana.setVisible(true);
            }
        });
    }
}