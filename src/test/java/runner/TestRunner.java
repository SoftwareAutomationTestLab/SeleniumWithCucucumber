package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

/**
 * Created by Karthik on 21/09/2019.
 */

@CucumberOptions(//specifying the feature File,StepDefinitions and reporting plugin using Extent Report
		features = "src/test/java/features/login1.feature"
		,glue="StepDefinitions",
	    plugin= {"pretty","html:target/cucumber.html",
	    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	    		"rerun:target/failedscenarios.txt",
	    		"json:target/cucumber.json"
	    		})
        glue = "steps")
public class TestRunner extends AbstractTestNGCucumberTests {


    @Override
    @DataProvider
    //@DataProvider (parallel = true) -- For parallel execution support (which is not going to work for our code)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
