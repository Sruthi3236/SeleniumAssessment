package StepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
                 glue={"StepDefs"},
                 monochrome=true,//to have formatted output in console
                 plugin= {"pretty","html:target/HtmlReports",
                		 "json:target/JSONReports/report.json",
                		 "junit:target/JUnitReports/report.xml"},//reporting 
                 tags="@RegressionTest")  



public class TestRunner {
	

}
