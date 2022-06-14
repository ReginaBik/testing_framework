package testng_learning;

import org.testng.annotations.Test;

public class _06_Groups {

    @Test(priority = 1, groups = "Login")
    public void test1(){
        System.out.println("This is test 1");
    }

    @Test(priority = 2, groups = "Purchase")
    public void test2(){
        System.out.println("This is test 2");
    }

    @Test(priority = 3, groups = {"Login", "Purchase", "Functional"})
    public void test3(){
        System.out.println("This is test 3");
    }

    @Test(priority = 4, groups = "Purchase")
    public void test4(){
        System.out.println("This is test 4");
    }

    @Test(priority = 5, groups = {"Functional", "Login"})
    public void test5(){
        System.out.println("This is test 5");
    }

}
