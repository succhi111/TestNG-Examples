package com.bridgelabz.cqa115selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnExample {

    @Test()
    public  void createUser(){
        Assert.assertFalse(false,"Create user failed");
    }

    @Test(dependsOnMethods = "createUser")
    public void deleteUser(){
        System.out.println("Deleted user successfully");
    }
}
