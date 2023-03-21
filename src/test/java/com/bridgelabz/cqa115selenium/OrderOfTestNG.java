package com.bridgelabz.cqa115selenium;

import org.testng.annotations.*;

public class OrderOfTestNG {
    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("Before suit...");
    }
    @BeforeClass
    public  void beforeClass(){
        System.out.println("Before class...");
    }
    @BeforeTest
    public  void beforeTest(){
        System.out.println("Before test...");
    }
    @BeforeMethod
    public  void beforeMethod(){
        System.out.println("Before method...");
    }
    @Test(groups = "CQA115")
    public  void Test1(){
        System.out.println("TEST CASE 1");
    }
    @Test
    public  void Test2(){
        System.out.println("TEST CASE 2");
    }
    @Test
    public  void Test3(){
        System.out.println("TEST CASE 3");
    }
    @AfterSuite
    public  void afterSuit(){
        System.out.println("After suite");
    }
    @AfterClass
    public  void afterClass(){
        System.out.println("After class");
    }
    @AfterTest
    public  void afterTest(){
        System.out.println("After test");
    }
    @AfterMethod
    public  void afterMethod(){
        System.out.println("After method");
    }

}
