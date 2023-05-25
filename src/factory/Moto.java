package factory;

public class Moto implements Ivehicule {
    public void startEngine() {
        System.out.println("Le moteur de la moto démarre.");
    }

    public void stopEngine() {
        System.out.println("Le moteur de la moto s'arrête.");
    }
}
