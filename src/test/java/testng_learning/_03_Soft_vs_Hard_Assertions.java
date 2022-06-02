package testng_learning;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _03_Soft_vs_Hard_Assertions {

    //Hard assertions
    //when the is an error  at any line , the program flow will break, and it will not continue with the rest

    @Test(priority = 1, description = "Practicing hard assertions")
    public void method1(){
        Assert.assertTrue(true);
        Assert.assertTrue(false, "========Failure");

        System.out.println("Hello World");
    }

    @Test(priority = 2, description = "practicing soft assertions")
    public void method2(){
        //Soft assertions
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(true);
        softAssert.assertTrue(false, "========Failure");

        System.out.println("Hello world");
        softAssert.assertAll();
    }




}
