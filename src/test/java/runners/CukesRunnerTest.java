package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/reports/html/cucumber-droneFlightPlanner_reports.html",
                "json:target/reports/json/json-reports/cucumber.json",
                "junit:target/reports/xml/xml-report/cucumber.xml",
                "rerun:target/reports/rerun.txt"
        },
        features = "src/test/resources/Features",
        glue = "com/droneFlightPlanner/stepDefinitions",
        tags = "@flightPlan"
)
public class CukesRunnerTest {
}
