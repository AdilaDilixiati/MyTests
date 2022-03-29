package com.MyTests.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        //in order to get the path of definitions
        features = "src/test/resources/features",
        //if true we can get the snippets which are unimplemented
        //if false we can run the methods
        glue = "com/cydeo/step_definitions",
        //in order to get the path of feature files
        dryRun = false,
        tags = "@smoke",
        publish = false
)
public class CukesRunner {
}
