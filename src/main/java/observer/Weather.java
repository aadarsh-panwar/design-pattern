package observer;
// for simplicity taking 3 int properties
public class Weather {
    private int temperature;
    private int pressure;
    private int humidity;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }
}
