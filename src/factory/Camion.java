package factory;

public class Camion implements Ivehicule {
    public void startEngine() {
        System.out.println("Le moteur du camion démarre.");
    }

    public void stopEngine() {
        System.out.println("Le moteur du camion s'arrête.");
    }
}
