public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Electric", "BMW", "X4", "white", 300,
                22000, 2000, 2020, 4, "SUV");

        System.out.println(myCar.getColor());
        System.out.println(myCar.calculateAge(myCar.getYear()));

        MotorBike myMotorBike = new MotorBike("Diesel", "Yamaha", "13C", "black",
                150, 10000, 1000, 2018, "two-stroke");

     myMotorBike.service();
     myCar.clean();

    }
}