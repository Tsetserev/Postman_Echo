package ru.netology.pe;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class PostmanEchoTest {
    @Test
    void shouldReturnRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("HI") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия

                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("HI"))
        ;
    }
}
