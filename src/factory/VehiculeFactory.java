package factory;

public class VehiculeFactory {
    public Ivehicule createVehicule(VehiculeType vehiculeType) {
        if (vehiculeType == null) {
            return null;
        }

        switch (vehiculeType) {
            case VOITURE:
                return new Voiture();
            case MOTO:
                return new Moto();
            case CAMION:
                return new Camion();
            default:
                return null;
        }
    }
}



