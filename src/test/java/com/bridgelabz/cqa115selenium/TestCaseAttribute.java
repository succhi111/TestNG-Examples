package com.bridgelabz.cqa115selenium;

import org.testng.annotations.Test;

public class TestCaseAttribute {
    @Test(priority = 1,invocationCount = 2)
    public void xyz() {
        System.out.println("XYZ");
    }

    @Test(priority = 0,invocationCount = 3)
    public void abc(){
        System.out.println("ABC");
    }

    @Test(groups ="CQA115")
    public void jkl() {
        System.out.println("JKL");

    }

}
