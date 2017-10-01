import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeDayWRepositoryTest {

    @Test
    public void testIfThreeDayWRepositoryRespCityEqualsReqSity() {
        try  {
            WeatherRequest request = new WeatherRequest("Tallinn", "EE", "metric");
            ThreeDayWRepository repository = new ThreeDayWRepository();
            ThreeDayWReport report = repository.getThreeDayW(request);
            assertEquals(report.cityName, request.cityName);
        }catch(Exception e){
            fail("Failure cause: " + e.getMessage());
        }
    }

}