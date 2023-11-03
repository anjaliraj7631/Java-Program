package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SpeedTest {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void checkSpeed() throws LowSpeed,AvgSpeed,OverSPeed{
        if (speed < 40) {
            throw new LowSpeed();
        } else if (speed >= 40 && speed <= 60) {
            throw new AvgSpeed();
        } else if (speed > 60) {
            throw new OverSPeed();
        }
    }
}
class LowSpeed extends RuntimeException{

}
class AvgSpeed extends RuntimeException{

}
class OverSPeed extends RuntimeException{

}


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpeedTest s = new SpeedTest();
        try {
            int speed = sc.nextInt();
            s.setSpeed(speed);
            try {
                s.checkSpeed();
            } catch (LowSpeed e) {
                System.out.println("low speed");
            } catch (AvgSpeed a) {
                System.out.println("avg speed");
            } catch (OverSPeed o) {
                System.out.println("over speed");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid output");
        }
    }
}

