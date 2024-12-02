public class MotorBike extends LandVehicle implements IMaintenance {
    String coolType;

    public MotorBike(String fuelType, String make,
                     String model, String color, int maxSpeed,
                     long mileage, long weight,
                     int year, String coolType) {

        super(2, fuelType, make, model, color, maxSpeed, mileage,
                weight, year);
        this.coolType = coolType;
    }

    @Override
    public String stopAtService() {
        return "Motorbike stop at services";
    }

    @Override
    public double calculateFuelEfficiency() {
        return (double) mileage / weight * 1.2;
    }

    @Override
    public void clean() {
        System.out.println("Clean Motorbike");

    }

    @Override
    public void service() {
        System.out.println("Service Motorbike");

    }
}
