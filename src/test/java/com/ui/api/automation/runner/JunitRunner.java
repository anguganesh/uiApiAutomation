package com.ui.api.automation.runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.Suite;
import io.cucumber.junit.platform.engine.Constants;


@Suite
@IncludeEngines("cucumber")
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME, value = "./Features")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "com.ui.automation.steps,"
                                                                  + "com.api.automation.steps,"
		                                                          + "com.ui.api.automation.configuration")
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@Test")
@ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME, value = "false")





public class JunitRunner {
	
}
