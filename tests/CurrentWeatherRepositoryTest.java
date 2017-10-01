import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrentWeatherRepositoryTest {

    @Test
    public void testIfWeatherRepositoryRespCityEqualsReqSity() {
        try  {
            WeatherRequest request = new WeatherRequest("Tallinn", "EE", "metric");
            CurrentWeatherRepository repository = new CurrentWeatherRepository();
            CurrentWeatherReport report = repository.getCurrentWeather(request);
            assertEquals(report.cityName, request.cityName);
        }catch(Exception e){
            fail("Failure cause: " + e.getMessage());
        }
    }
}