package startegy;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    
    public abstract void display();

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void fly() {
        // not checking null
        this.flyBehaviour.fly();
    }

    public void quack() {
        // not checking null
        this.quackBehaviour.quack();
    }
    
    public void swim() {
        System.out.println("Duck is swimming");
    }

}
