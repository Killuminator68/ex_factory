package factory;

public class VehiculeFactory {
    public Ivehicule createVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }

        if (vehicleType.equalsIgnoreCase("VOITURE")) {
            return new Voiture();
        } else if (vehicleType.equalsIgnoreCase("MOTO")) {
            return new Moto();
        } else if (vehicleType.equalsIgnoreCase("CAMION")) {
            return new Camion();
        }

        return null;
    }
}

