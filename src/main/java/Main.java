import startegy.*;

public class Main {
    public static void main(String ads[]) {
       startegyTest();
    }

    public static void startegyTest() {
        Duck mallard = new Mallard();
        FlyBehaviour wingFly = new WingFlyBehaviour();
        QuackBehaviour squek = new SqueakBehaviour();
        mallard.setFlyBehaviour(wingFly);
        mallard.setQuackBehaviour(squek);
        Duck rubber = new Rubber();
        FlyBehaviour noFly = new NoFlyBehaviour();
        QuackBehaviour muteQuack = new MuteQuackBehviour();
        rubber.setQuackBehaviour(muteQuack);
        rubber.setFlyBehaviour(noFly);
        RedHead redHead = new RedHead();
        QuackBehaviour whistle = new WhistleQuackBehaviour();
        redHead.setFlyBehaviour(wingFly);
        redHead.setQuackBehaviour(whistle);

        mallard.fly();
        mallard.quack();;
        mallard.display();
        rubber.fly();
        rubber.quack();
        rubber.display();
        redHead.fly();
        redHead.quack();
        redHead.display();
    }
}
