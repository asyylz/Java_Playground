import java.time.Year;

public abstract class LandVehicle {
    private int numberOfWheels;
    private String fuelType;
    private String make;
    private String model;
    private String color;
    private int maxSpeed;
    private long mileage;
    private long weight;
    private int year;

    public LandVehicle(int numberOfWheels, String fuelType,
                       String make, String model, String color, int maxSpeed,
                       long mileage, long weight, int year) {
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
        this.make = make;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
        this.weight = weight;
        this.year = year;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int calculateAge(int year) {
        return Year.now().getValue() - year;
    }

    public abstract String stopAtService();

    public abstract double calculateFuelEfficiency();

}
