package decorator;

public abstract class FlavourDecorator extends Beverage{
    protected Beverage bevarage;

    public abstract String getDescription();
}
