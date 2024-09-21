import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Semaphore mutex = new Semaphore(1);// Se crea el semafoto

        Worker trabajador1= new Worker("Juan",mutex);//Primero
        Worker trabajador2= new Worker("Pepito",mutex);// Segndo
        Worker trabajador4= new Worker("Felipe",mutex);//Tercero

        trabajador1.start();//Corre el primero
        trabajador2.start();// Corre el segundo
        trabajador4.start();// Corre el tercero



    }
}