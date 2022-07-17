package startegy;

public class NoFlyBehaviour implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Cant fly");
    }
    
}
