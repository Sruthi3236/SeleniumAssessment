package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features",
    glue = {"StepDefs"},
    monochrome=true,//to have formatted output in console
    plugin= {"pretty","html:target/HtmlReports",
   		 "json:target/JSONReports/report.json",
   		 "junit:target/JUnitReports/report.xml"},//reporting 
    tags="@RegressionTest"
)
public class TestRunner  {
}


/*
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
                 glue={"StepDefs"},
                 monochrome=true,//to have formatted output in console
                 plugin= {"pretty","html:target/HtmlReports",
                		 "json:target/JSONReports/report.json",
                		 "junit:target/JUnitReports/report.xml"},//reporting 
                 tags="@RegressionTest")  
*/