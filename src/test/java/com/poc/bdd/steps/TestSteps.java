package com.poc.bdd.steps;

import com.poc.bdd.service.UserInfo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration
public class TestSteps {

    @Autowired
    UserInfo userInfo;

    @Given("^I want to write a step with precondition \"([^\"]*)\"$")
    public void step1(String search){
        System.out.println("Search content is " + search);
        System.out.println("This is step 1~");
        userInfo.setInfo("TestUser", "pwd");
        System.out.println(userInfo.toString());
    }

    @Then("Some other precondition")
    public void step2() {
        System.out.println("This is step 2~");
    }

}
