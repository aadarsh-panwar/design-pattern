package observer;

// Display current stats of weather
public class WeatherConditionDisplay implements Observer<Weather>, Display {
    private Weather weather;
    @Override
    public void update(Weather weather) {
        // make a local copy
        this.weather =weather;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current weather");
        System.out.println("Tempearature:"+ weather.getTemperature());
        System.out.println("Pressure:"+ weather.getPressure());
        System.out.println("Humidity:"+ weather.getHumidity());
    }
}
