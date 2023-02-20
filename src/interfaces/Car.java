package interfaces;

public class Car implements Brakes,Engine,Media {

    @Override
    public void brake() {
        System.out.println("My car is to brake");
    }

    @Override
    public void start() {
        System.out.println("My car is to start");
    }

    @Override
    public void stop() {
        System.out.println("My car is to stop");
    }

    @Override
    public void acc() {
        System.out.println("My car is to accelerate");
    }

}
