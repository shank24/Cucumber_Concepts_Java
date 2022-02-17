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
    @Before ("@Scenario1")
    public void beforeOrder1(Scenario scenario){
        System.out.println("Before Hook For Scenario 1");
        //scenarioInfo(scenario);
    }

    //Executed before each of the example listed in the Scenario Outline
    @Before ("@Scenario2")
    public void beforeOrder0(Scenario scenario){
        System.out.println("Before Hook For Scenario 2");
        //scenarioInfo(scenario);
    }



    //Executed before each of the example listed in the Scenario Outline
    @After("@Scenario1")
    public void afterOrder1(Scenario scenario){
        System.out.println("After Hook For Scenario 1");
        //scenarioInfo(scenario);
    }

    //Executed before each of the example listed in the Scenario Outline
    @After("@Scenario2")
    public void afterOrder0(Scenario scenario){
        System.out.println("After Hook For Scenario 2");
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
