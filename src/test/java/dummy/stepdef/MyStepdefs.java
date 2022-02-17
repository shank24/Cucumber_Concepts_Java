package dummy.stepdef;

import dummy.objects.Product;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {



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

    @Given("I'm on the Store/Product page")
    public void iMOnTheStorePage() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("I add a {product} to the Cart")
    public void iAddAToTheCart(Product product) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Product Name  " + product.getName());

    }
    @Then("I see {int} {product} in the cart")
    public void
    iSeeInTheCart(Integer int1, Product product) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Product Name  " + product.getName());
    }


    /*
    Note -
    Cucumber uses Regex to find the step,
    and the regex is applied on the text (I am dummy)
    For ex - Given I am dummy
    @Given("^I am dummy$")
    public void iAmDummy()

    We can use @When also, it does not consider keyword into consideration.
     */
}
