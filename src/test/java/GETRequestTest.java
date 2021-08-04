import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GETRequestTest {

    private static Logger LOG = LoggerFactory.getLogger(GETRequestTest.class);

    @Test
    public void testGetRequest() {

        String url = "https://google.com";

        LOG.info("Step 1: Send GET Request");
        Response response = RestAssured.given().get(url).andReturn();

        LOG.info("Step 2: Print the JSON response body");
        response.getBody().prettyPrint();

        LOG.info("Step 3: Assert StatusCode = 200");
        assertEquals(response.getStatusCode(),200, "http status code");

    }
}
