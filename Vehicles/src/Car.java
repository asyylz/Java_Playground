public class Car extends LandVehicle implements  IMaintenance {
    int numberOfPassengers;
    String carType;

    public Car(String fuelType,
               String make, String model, String color,
               int maxSpeed, long mileage, long weight, int year, int numberOfPassengers, String carType) {
        super(4, fuelType, make, model, color,
                maxSpeed, mileage, weight, year);
        this.numberOfPassengers = numberOfPassengers;
        this.carType = carType;
    }


    @Override
    public String stopAtService() {
        return "Car stopped at services";
    }

    @Override
    public double calculateFuelEfficiency() {
        return  (double) this.getMileage() / this.getWeight() * 0.8;
    }

    @Override
    public void clean() {
        System.out.println("Car cleaned");

    }

    @Override
    public void service() {
        System.out.println("Car service started");

    }
}
