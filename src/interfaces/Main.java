package interfaces;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        car.acc();
        car.start();
        car.brake();

        NiceCar car1=new NiceCar();
        car1.start();
        car1.MediaStart();
        car1.UpgradeEngine();
        car1.start();
    }
}
