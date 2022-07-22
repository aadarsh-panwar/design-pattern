import decorator.*;
import observer.*;
import startegy.*;

public class Main {
    public static void main(String ads[]) {
        decoratorTest();
    }

    public static void decoratorTest() {
        Beverage darkRoast = new DarkRoast();
        System.out.println("Dark roast:"+ darkRoast.cost());
        SoyFlavour soyFlavour = new SoyFlavour(darkRoast);
        System.out.println("Dark roast with soy:"+ soyFlavour.cost());
        System.out.println("Description:"+ soyFlavour.getDescription());
        Beverage water = new Water();
        System.out.println(water.getDescription());
        LemonWater lemon = new LemonWater(water);

        System.out.println(lemon.cost());
        System.out.println(lemon.getDescription());
    }

    public static void observerTest() {
        Weather weather = new Weather();
        weather.setTemperature(10);
        weather.setHumidity(20);
        weather.setPressure(30);
        WeatherData weatherData = new WeatherData();
        WeatherStatisticDisplay statisticDisplay = new WeatherStatisticDisplay();
        WeatherConditionDisplay conditionDisplay = new WeatherConditionDisplay();

        weatherData.registerObserver(statisticDisplay);
        weatherData.registerObserver(conditionDisplay);
        weatherData.setWeather(weather);
        weatherData.weatherChanged();
        weatherData.removeObserver(conditionDisplay);
        System.out.println("-------------");
        weather.setTemperature(30);
        weatherData.setWeather(weather);
        weatherData.weatherChanged();
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
