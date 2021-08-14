public class CurrentConditionsDisplay implements Observer, DisplayUnit{
	  private WeatherData weatherData;
	  private float temperature;
	  private float pressure;
	  private float humidity;
	  
	  public CurrentConditionsDisplay (WeatherData weatherData) {
			this.weatherData = weatherData;
			weatherData.registerObserver(this);
	  }
	  
	  @Override
	  public void display () {
			System.out.println(this.getClass().getName());
			System.out.println("Temp ->" + temperature);
			System.out.println("Humidity ->" + humidity);
			System.out.println("Pressure ->"+ pressure);
	  }
	  
	  @Override
	  public void update (float temp, float humidity, float pressure) {
			this.pressure = pressure;
			this.humidity = humidity;
			this.temperature = temp;
			display();
	  }
}
