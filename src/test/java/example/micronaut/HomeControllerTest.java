package example.micronaut;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.test.annotation.MicronautTest;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class HomeControllerTest {

    RxHttpClient client;

    public void helloTest(){
        HttpRequest<String> request = HttpRequest.GET("/hello");
        String body = client.toBlocking().retrieve(request);

        assertNotNull(body);
        assertEquals("Hello World", body);
    }
}