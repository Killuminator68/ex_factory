package factory;

public class Main {
    public static void main(String[] args) {
        VehiculeFactory vehicleFactory = new VehiculeFactory();

        Ivehicule voiture = vehicleFactory.createVehicle("VOITURE");
        voiture.startEngine();
        voiture.stopEngine();

        Ivehicule moto = vehicleFactory.createVehicle("MOTO");
        moto.startEngine();
        moto.stopEngine();

        Ivehicule camion = vehicleFactory.createVehicle("Camion");
        camion.startEngine();
        camion.stopEngine();
    }
}
