import java.util.concurrent.Semaphore;

public class Worker extends Thread {
    private String name; //Nombre del trabajador
    private Semaphore mutex;// Instancia del semaforo


    public Worker(String name,Semaphore mutex){//Constructor donde se incia tanto el nombre como el semaforo
        this.name=name;
        this.mutex=mutex;


    }

    @Override

    public void run(){// El programa donde se inicializara el programa

        while (true){
            try {
                mutex.acquire(); //Await
                System.out.println("El trabajador  " + name + " Esta corriendo"); // Seccion critica
                sleep(500); //Se espera 500 milisegundos

                mutex.release();//Signal
                sleep(2000);//Espera 2 segundos


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
