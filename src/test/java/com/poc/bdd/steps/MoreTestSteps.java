package com.poc.bdd.steps;

import com.poc.bdd.service.UserInfo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ContextConfiguration;

//@SpringBootTest
//@ContextConfiguration
//Please ensure only one glue class configures the spring context
public class MoreTestSteps {
    @Autowired
    UserInfo userInfo;
    @And("I complete action")
    public void step3(){
        System.out.println("This is step 3~ I complete action");
    }

    @Then("I Validate the outcomes")
    public void step4() {
        System.out.println("This is step 4~ I Validate the outcomes");
        System.out.println(userInfo.toString());
    }
}
