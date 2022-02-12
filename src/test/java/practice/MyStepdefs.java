package practice;

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
    @Given("^I am dummy$")
    public void iAmDummy() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("^I do dummy things$")
    public void iDoDummyThings() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("^dummy things happen$")
    public void dummyThingsHappen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("My Account Balance is ${int}")
    public void myAccountBalanceIs$(int arg0) {
        
    }

    @When("I withdraw ${int}")
    public void iWithdraw$(int arg0) {
        
    }

    @Then("the account balance should be ${int}")
    public void theAccountBalanceShouldBe$(int arg0) {
    }
}
