package startegy;
/*
 startegy pattern lets you define a family of algorithm
 and put them into classes and make their object interchangeable

  Duck could be of many types with different behaviour like quack, swim, etc,
  Duck may or may not quack or if does then may quack diffrently
  Duck may swim, fly or may not fly or swim (e.g.g rubber duck can only swim)
  Differnt quack - https://www.thespruce.com/sounds-ducks-make-386223

  Inheritance wont produce desired result as each duck must override this which incase of rubber or wooden
  duck wont make any sense.
  OOPS princpal -> Seperate what is changing from what is not
  Here we notice Behaviour of duck is changing so we remove behaviour from duck put in seperate class
 */
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
