package dummy.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class CucumberHooks {

    //Executed before any of the scenario is executed
    @BeforeAll
    public static void beforeAll(){

        System.out.println("In Before All");
    }

    //Executed after any of the scenario is executed
    @AfterAll
    public static void afterAll(){

        System.out.println("In After All");
    }

    //Executed before each of the example listed in the Scenario Outline
    @Before
    public void before(){
        System.out.println("Before Hook");
    }


    //Executed before each of the example listed in the Scenario Outline
    @After
    public void after(){
        System.out.println("After Hook");
    }
}
