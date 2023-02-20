package interfaces;

public class CdPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Start Media Player");
    }

    @Override
    public void stop() {
        System.out.println("Stop Media Player");
    }
}
