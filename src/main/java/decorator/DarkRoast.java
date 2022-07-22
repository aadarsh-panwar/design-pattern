package decorator;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        this.description = "Dark Roast";
    }

    @Override
    public int cost() {
        return 10;
    }
}
