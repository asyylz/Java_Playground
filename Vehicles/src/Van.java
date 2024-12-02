public class Van extends LandVehicle{
    float carriageVolume;


    public Van(String fuelType, String make, String model, String color, int maxSpeed,
               long mileage, long weight, int year) {
        super(4, fuelType, make, model, color, maxSpeed, mileage, weight, year);
        this.carriageVolume = 0.0f;
    }

    @Override
    public String stopAtService() {
        return "Van stop at services";
    }

    @Override
    public double calculateFuelEfficiency() {
        return  (double) mileage / weight * 1.8;
    }
}
