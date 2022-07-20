package observer;

//Display avg, min, max of weather stats
// Taking temperature in this case, other can be used as well
public class WeatherStatisticDisplay implements Observer<Weather>, Display{
    private Weather weather;
    private double avgTemperature = 0;
    private int temperatureReadings =0;
    private double minTemperature = Integer.MAX_VALUE;
    private double maxTemperture = Integer.MIN_VALUE;

    @Override
    public void update(Weather weather) {
        this.weather = weather;
        // new average from old average + new temperature value
        avgTemperature = (avgTemperature*temperatureReadings + weather.getTemperature())/(temperatureReadings+1);
        ++temperatureReadings;
        minTemperature = Math.min(minTemperature, weather.getTemperature());
        maxTemperture = Math.max(maxTemperture, weather.getTemperature());
        display();
    }

    @Override
    public void display() {
        System.out.println("Weather Temperature statistics");
        System.out.println("Average Temperature:"+ avgTemperature);
        System.out.println("Max Temperature:"+ maxTemperture);
        System.out.println("Min Temperature:"+ minTemperature);
    }
}
