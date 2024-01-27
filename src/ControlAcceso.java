public class ControlAcceso {
    private static final int AFORO_MAXIMO = 10;
    private int aforoActual;

    public ControlAcceso() {
        this.aforoActual = 0;
    }

    public int getAforoActual() {
        return aforoActual;
    }

    public synchronized void entrar() {
        while (aforoActual >= AFORO_MAXIMO) {
            try {
                System.out.println("Aforo completo. Por favor, espere a que salga algún cliente.");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        aforoActual++;
        notifyAll();
    }

    public synchronized void salir() throws InterruptedException {
        while (aforoActual <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        aforoActual--;
        notifyAll();
    }
}
