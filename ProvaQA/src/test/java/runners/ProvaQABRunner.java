package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/ProvaQA.feature",
		glue = "provaQA", 
		tags = "@provaQA-B",
		plugin = {"pretty", "html:target/report-html/ProvaQAB" , "json:target/report-html/ProvaQAB/report-json"},
		monochrome = true, 
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false)
public class ProvaQABRunner {

}
