package decorator;

public class ExtraMilk extends FlavourDecorator{

    public ExtraMilk(Beverage beverage) {
        this.bevarage = beverage;
    }
    @Override
    public int cost() {
        return this.bevarage.cost() + 20;
    }

    @Override
    public String getDescription() {
        return this.bevarage.description + ",Extra Milk";
    }
}
