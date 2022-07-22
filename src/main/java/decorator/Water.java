package decorator;

public class Water extends Beverage{
    public Water() {
        description = "Water";
    }
    @Override
    public int cost() {
        return 5;
    }
}
