package com.TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="newTours",glue={"com.NewToursLoginTest"})

public class Runner {

}
