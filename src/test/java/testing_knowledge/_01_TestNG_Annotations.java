package testing_knowledge;

import org.testng.annotations.Test;

public class _01_TestNG_Annotations {

    @Test (priority = 1)
    public void test1(){
        System.out.println("Hello World");
    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("Hello World 2");
    }

    @Test (priority = 3)
    public void abc(){
        System.out.println("a b c");
    }

    @Test (priority = 4)
    public void ABC(){
        System.out.println("A B C");
    }


}
