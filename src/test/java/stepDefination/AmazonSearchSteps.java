package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearchSteps  {
    @Given("I am on the Amazon homepage")
    public void iAmOnTheAmazonHomepage() {

    }

    @When("I search for {string}")
    public void iSearchFor(String arg0) {
    }

    @Then("I should see a list of laptops in the search results")
    public void iShouldSeeAListOfLaptopsInTheSearchResults() {
    }

    @And("the search results should contain at least {int} items")
    public void theSearchResultsShouldContainAtLeastItems(int arg0) {
    }

    @And("the first item should have a price displayed")
    public void theFirstItemShouldHaveAPriceDisplayed() {
    }

}
