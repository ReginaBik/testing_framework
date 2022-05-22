package testng_learning;

import org.testng.annotations.*;

public class _01_Annotations {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This is BEFORE SUITE");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This is BEFORE TEST");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This is BEFORE CLASS");
    }


    @BeforeMethod    //use each time we set up the driver before doing automation test
    public void beforeMethod(){
        System.out.println("This is BEFORE METHOD");
    }

    @AfterMethod //executed after each test. mostly quits the browser and link
    public void afterMethod(){
        System.out.println("This is AFTER METHOD");
    }

    @Test
    public void test1(){
        System.out.println("This is TEST1");
    }

    @Test
    public void test2(){
        System.out.println("This is TEST2");
    }


    @AfterClass
    public void afterClass(){
        System.out.println("This is AFTER CLASS");
    }  //we use it when we want to give report for our scripts

    @AfterTest
    public void afterTest(){
        System.out.println("This is AFTER TEST");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This is AFTER SUITE");
    }



}
