package factory;



public class Voiture implements Ivehicule {
    public void startEngine() {
        System.out.println("Le moteur de la voiture démarre.");
    }

    public void stopEngine() {
        System.out.println("Le moteur de la voiture s'arrête.");
    }
}


