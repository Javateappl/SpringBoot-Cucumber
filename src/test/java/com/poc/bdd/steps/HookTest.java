package com.poc.bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

//Hooks are defined within the step definition file only
public class HookTest {
    @Before
    public void beforeTest(){
        System.out.println("=======Before Test=======");
    }

    @After
    public void afterTest(){
        System.out.println("=======After Test=======");
    }
}
