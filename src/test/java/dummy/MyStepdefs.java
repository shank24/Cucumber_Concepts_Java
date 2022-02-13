package dummy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    /*
    Note -
    Cucumber uses Regex to find the step,
    and the regex is applied on the text (I am dummy)
    For ex - Given I am dummy
    @Given("^I am dummy$")
    public void iAmDummy()

    We can use @When also, it does not consider keyword into consideration.
     */
    @Given("I am dummy")
    public void iAmDummy() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I do dummy things")
    public void iDoDummyThings() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("dummy things happen")
    public void dummyThingsHappen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I'm on the store page")
    public void iMOnTheStorePage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I add a {string} to the Cart")
    public void iAddAToTheCart(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I see {int} {string} in the cart")
    public void iSeeInTheCart(Integer int1, String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
