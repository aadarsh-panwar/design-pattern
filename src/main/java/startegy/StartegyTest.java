package startegy;

/*
 * startegy pattern which uses composition rather than inheritance
 * to encapsulate family of algorithm and let them use independently from client
 * 
 * Seperate the behaviour which is changing from what is not
 * 
 * Duck may be any type like mallard, domestic, whistling, rubber
 * Each duck may be different from other not all them will fly, quack like rubber one can't fly, swim
 * 
 * Here inheritance wont be produced desired result as any behaviour any base class will inherited by derived
 * and fly and quack doesnt make any sense in rubber duck
 *
 */

public class StartegyTest {
    public static void main(String args[]) {
        FlyBehaviour flywing = new WingFlyBehaviour();
        QuackBehaviour squeak = new SqueakBehaviour();
        Duck  mallard = new Mallard();
        mallard.setFlyBehaviour(flywing);
        mallard.setQuackBehaviour(squeak);
        mallard.fly();
        mallard.quack();

    }
}