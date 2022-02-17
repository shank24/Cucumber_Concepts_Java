package dummy.hooks;

import io.cucumber.java.*;

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
    @Before (order = 1)
    public void beforeOrder1(Scenario scenario){
        System.out.println("Before Hook Order 1");
        //scenarioInfo(scenario);
    }

    //Executed before each of the example listed in the Scenario Outline
    @Before (order = 0)
    public void beforeOrder0(Scenario scenario){
        System.out.println("Before Hook Order 0");
        //scenarioInfo(scenario);
    }



    //Executed before each of the example listed in the Scenario Outline
    @After(order = 1)
    public void afterOrder1(Scenario scenario){
        System.out.println("After Hook Order 1");
        //scenarioInfo(scenario);
    }

    //Executed before each of the example listed in the Scenario Outline
    @After(order = 0)
    public void afterOrder0(Scenario scenario){
        System.out.println("After Hook Order 0");
        //scenarioInfo(scenario);
    }

    private void scenarioInfo(Scenario scenario) {
        System.out.println("SCENARIO NAME -> " + scenario.getName());
        System.out.println("SCENARIO LINE -> " + scenario.getLine());
        System.out.println("SCENARIO TAGS -> " + scenario.getSourceTagNames());
        System.out.println("SCENARIO STATUS -> " + scenario.getStatus());
        System.out.println("SCENARIO URI -> " + scenario.getUri());
        System.out.println("SCENARIO IsFailed -> " + scenario.isFailed() + "\n");
    }
}
