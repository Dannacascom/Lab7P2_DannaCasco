
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;


public class Barra extends Thread{
    private JProgressBar bar;
    private double largo;

    public Barra() {
    }

    public Barra(JProgressBar bar, double largo) {
        this.bar = bar;
        this.largo = largo;
    }

   
    @Override
    public void run() {
        int contador = 0;
        while (contador <= 100) {
            bar.setValue(contador);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            contador += 10;
        }
        JOptionPane.showMessageDialog(null, "Descarga Exitosa");
    }
}
