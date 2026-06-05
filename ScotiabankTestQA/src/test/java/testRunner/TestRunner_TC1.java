package testRunner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasspathResource("src/test/resources/features")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty")
@ConfigurationParameter(key = "cucumber.glue", value = "stepDefinition")

public class TestRunner_TC1 {

}
