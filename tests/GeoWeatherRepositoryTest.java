import com.weather.reports.GeoWeatherReport;
import com.weather.repositories.GeoWeatherRepository;
import com.weather.requests.WeatherRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeoWeatherRepositoryTest {

    @Test
    public void testIfGeoRepositoryRespCityEqualsReqSity() {
        try  {
            WeatherRequest request = new WeatherRequest("Tallinn", "EE", "metric");
            GeoWeatherRepository repository = new GeoWeatherRepository();
            GeoWeatherReport report = repository.getGeo(request);
            assertEquals(report.cityName, request.cityName);
        }catch(Exception e){
            fail("Failure cause: " + e.getMessage());
        }
    }
}