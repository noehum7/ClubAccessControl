public class Puerta implements Runnable{
    private ControlAcceso control;
    private String nombre;
    private boolean esEntrada;

    public Puerta(ControlAcceso control, String nombre, boolean esEntrada) {
        this.control = control;
        this.nombre = nombre;
        this.esEntrada = esEntrada;
    }

    @Override
    public void run() {
            for(int i = 0; i < 10; i++) {
            try {
                if(esEntrada) {
                    control.entrar();
                    System.out.println("Cliente " + (i + 1) + " entra por la puerta " + nombre + ". Aforo actual: " + control.getAforoActual());
                    Thread.sleep(1000);
                } else {
                    control.salir();
                    System.out.println("Cliente " + (i + 1) + " sale por la puerta " + nombre + ". Aforo actual: " + control.getAforoActual());
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                System.err.println("Error en la " + nombre + ": " + e.getMessage());
            }
        }
    }
}
