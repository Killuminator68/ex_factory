package factory;

public class Main {
    public static void main(String[] args) {
        VehiculeFactory vehiculeFactory = new VehiculeFactory();

        Voiture voiture = (Voiture) vehiculeFactory.createVehicule(VehiculeType.VOITURE);
        voiture.startEngine();
        voiture.stopEngine();

        Moto moto = (Moto) vehiculeFactory.createVehicule(VehiculeType.MOTO);
        moto.startEngine();
        moto.stopEngine();

        Camion camion = (Camion) vehiculeFactory.createVehicule(VehiculeType.MOTO);
        camion.startEngine();
        camion.stopEngine();
    }
}
