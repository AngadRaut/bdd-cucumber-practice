package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class OpenGoogleApiApplicationSteps {

    private String endpoint;

    @Given("the API is available")
    public void apiIsAvailable() {
        // Always hit the root Google URL
        endpoint = "https://www.google.com/";

        given()
                .get(endpoint)
                .then()
                .statusCode(200);
    }

    @When("^I call the \"([^\"]*)\" endpoint$")
    public void iCallTheEndpoint(String apiEndpoint) {
        // Ensure apiEndpoint always starts with "/"
        if (!apiEndpoint.startsWith("/")) {
            apiEndpoint = "/" + apiEndpoint;
        }
        endpoint = "https://www.google.com" + apiEndpoint;
    }

    @Then("^the response should contain \"([^\"]*)\"$")
    public void theResponseShouldContain(String expectedMessage) {
        given()
                .get(endpoint)
                .then()
                .statusCode(200)
                .body(containsString(expectedMessage));
    }
}
