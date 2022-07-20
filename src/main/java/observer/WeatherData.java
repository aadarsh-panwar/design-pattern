package observer;

import java.util.ArrayList;
import java.util.List;
/*
An Object called subject has one more dependents called observer needs to be notified on changing of
state/value of subject.

WeatherData has list of observers which needs to be notified on change of weather
All observer implements Subject interface which contains update method through information of updates are sent
 */
public class WeatherData implements Subject<Weather> {
    private List<Observer<Weather>> observers = new ArrayList<>();
    private Weather weather;

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void registerObserver(Observer<Weather> o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer<Weather> o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        // notify all observers
        for(Observer<Weather> obs: observers) {
            obs.update(weather);
        }
    }

    public void weatherChanged() {
        notifyObservers();
    }

}
