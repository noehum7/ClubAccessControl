public class Main {
    public static void main(String[] args) {
        ControlAcceso controlAcceso = new ControlAcceso();

        Thread entrada1 = new Thread(new Puerta(controlAcceso, "Puerta 1", true));
        Thread entrada2 = new Thread(new Puerta(controlAcceso, "Puerta 2", true));
        Thread salida1 = new Thread(new Puerta(controlAcceso, "Puerta 1", false));
        Thread salida2 = new Thread(new Puerta(controlAcceso, "Puerta 2", false));

        try {
            entrada1.start();
            Thread.sleep(1000);
            entrada2.start();
            salida1.start();
            salida2.start();
            entrada1.join();
            entrada2.join();
            salida1.join();
            salida2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Programa finalizado. Todos los clientes han entrado y salido del club.");
    }
}