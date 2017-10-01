import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeoRepositoryTest {

    @Test
    public void testIfGeoRepositoryRespCityEqualsReqSity() {
        try  {
            WeatherRequest request = new WeatherRequest("Tallinn", "EE", "metric");
            GeoRepository repository = new GeoRepository();
            GeoReport report = repository.getGeo(request);
            assertEquals(report.cityName, request.cityName);
        }catch(Exception e){
            fail("Failure cause: " + e.getMessage());
        }
    }
}