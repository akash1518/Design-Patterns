public class Main {
	  
	  public static void main (String[] args) {
			WeatherData weatherData = new WeatherData();
			CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
			StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
			weatherData.setMeasurements(98,15,1.5f);
			weatherData.setMeasurements(100,15,1.8f);
		 
	  }
}
