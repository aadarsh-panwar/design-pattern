package startegy;

public class MuteQuackBehviour implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Mute quack");
    }
    
}
