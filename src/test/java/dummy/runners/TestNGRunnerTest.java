package dummy.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import static io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE;

@CucumberOptions(
        plugin =  {"pretty", "html:target/cucumber.html", "summary"},
        snippets = CAMELCASE,
        dryRun = true,
        monochrome=true,
        tags = "@Scenario1 or @Scenario2",
        glue = {"dummy.stepdef","dummy.hooks"},
        features = "src/test/resources/dummy"
)

public class TestNGRunnerTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void beforeClass(){
    System.out.println("In Before Class");
    }


    @AfterClass
    public void afterClass(){
        System.out.println("In After Class");
    }
}
