package cucumberTest;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
/*
 * @CucumberOptions( features = "Features", glue = {"stepDefinitions"}, tags =
 * "@activity1_1", strict = true )
 */

/*
 * @CucumberOptions( features = "Features", glue = {"stepDefinitions"}, tags =
 * "@activity1_2" )
 */

/*
 * @CucumberOptions( features = "Features", glue = {"stepDefinitions"}, tags =
 * "@SmokeTest", strict = true )
 */


/*
 * @CucumberOptions( features = "Features", glue = {"stepDefinitions"}, tags =
 * "@activity1_3", strict = true )
 */
 
/*
 * @CucumberOptions( features = "Features", glue = {"stepDefinitions"}, tags =
 * "@activity2_4", strict = true )
 */

@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@activity2_5",
    strict = true
)

public class ActivitiesRunner {}


	
