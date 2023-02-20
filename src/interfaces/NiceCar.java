package interfaces;

public class NiceCar {
    private Engine engine;
    private Media player=new CdPlayer();

   public NiceCar(){
        engine=new PowerEngine();
    }
    public NiceCar(Engine engine){
       this.engine=engine;
    }
    public void start(){
       engine.start();
    }
    public void stop(){
       engine.stop();
    }
    public void MediaStart(){
       player.start();
    }
    public void MediaStop(){
       player.stop();
    }
    public void UpgradeEngine(){
       engine=new EletricEngine();
    }
}
