package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/ProvaQA.feature",
		glue = "provaQA", 
		tags = "@provaQA-A",
		plugin = {"pretty", "html:target/report-html/ProvaQAA" , "json:target/report-html/ProvaQAA/report-json"},
		monochrome = true, 
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false)
public class ProvaQAARunner {

}
