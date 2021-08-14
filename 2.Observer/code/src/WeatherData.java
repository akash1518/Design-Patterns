import java.util.ArrayList;
import java.util.List;


public class WeatherData implements Subject {
	  
	  private final List<Observer> observers = new ArrayList<>();
	  private float temperature;
	  private float pressure;
	  private float humidity;
	  
	  
	  @Override
	  public void registerObserver (Observer observer) {
			observers.add(observer);
	  }
	  
	  @Override
	  public void removeObserver (Observer observer) {
			observers.remove(observer);
	  }
	  
	  @Override
	  public void notifyObservers () {
			observers.stream()
					.forEach(Observer::update);
	  }
	  
	  public void measurementsChanged () {
			notifyObservers();
	  }
	  
	  
	  public void setMeasurements (float temp, float humidity, float pressure) {
			this.temperature = temp;
			this.humidity = humidity;
			this.pressure = pressure;
			measurementsChanged();
	  }
	  
	  public float getTemperature () {
			return temperature;
	  }
	  
	  public float getPressure () {
			return pressure;
	  }
	  
	  public float getHumidity () {
			return humidity;
	  }
}
