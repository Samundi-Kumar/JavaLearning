package day03;

abstract class VehicleType {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class MyCar extends VehicleType {

    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        MyCar car = new MyCar();

        car.start();
        car.stop();
    }
}
