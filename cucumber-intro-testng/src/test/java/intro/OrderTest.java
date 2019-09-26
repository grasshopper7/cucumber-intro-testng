package intro;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = { "summary", "progress" })
public class OrderTest extends AbstractTestNGCucumberTests{}