package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(
		
		plugin = {"html:target/html-cucumber", "json:target/cucumber.json"},
		
		features = "src/test/java/features",
		
		//tags = {"@Sanity"}, //to run one single tag
		tags = {"@F_Login"}, //to run one single tag
		//tags = {"@F_1234"}, //to run one single tag 
		//tags = {"@Sanity, @Regression"}, //running multiple tags
		//tags = {"@Regression and @Rapid"}, //running multiple tags using AND
		//tags = {"@Regression", "@Rapid"},  //running multiple tags using AND
		//tags= {"@Sanity or (@Regression and @Rapid)"}
		//tags = {"not @Sanity"}, //to exclude one single tag
		//tags = {"~ @Sanity"}, //to exclude one single tag
		
		glue = {"stepDefs"}
		
		)

public class TestRunner  {

}
