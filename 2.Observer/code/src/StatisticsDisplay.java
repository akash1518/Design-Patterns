import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StatisticsDisplay implements Observer,DisplayUnit{
	  private WeatherData weatherData;
	  private List<Float> temperatureReadings = new ArrayList<>();
	  
	  public StatisticsDisplay (WeatherData weatherData) {
			this.weatherData = weatherData;
			weatherData.registerObserver(this);
	  }
	  
	  @Override
	  public void display () {
			System.out.println(this.getClass().getName());
	  	  	Float sum = temperatureReadings.stream().reduce(0f,(a,b) -> Float.sum(a,b));
			System.out.println("Avg temp -> "+ sum/temperatureReadings.size());
	  }
	  
	  @Override
	  public void update (float temp, float humidity, float pressure) {
			temperatureReadings.add(temp);
			display();
	  }
}
