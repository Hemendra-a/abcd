package cucumberoptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"},
glue = {"stepDefinitions"},
monochrome = true,
plugin = {"pretty","json:target/jsonReports/cucumber-report.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt",
		"html:target/HtmlReports/report.html","junit:target/JUnitReports/report.xml"
		 },
tags = "@Allclick or @Sanity"
)
public class TestngRunner extends AbstractTestNGCucumberTests{

//	@Override
//	@DataProvider(parallel=true)
//	public Object[][] scenarios()
//	{
//		return super.scenarios();
//	}
//	
}
