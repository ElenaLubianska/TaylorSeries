import Test2.Before;
import org.junit.Assert;
import org.junit.Test;

public class TestTest {
    double x;
    int n;

    @Before
    public void setX(){

        x = 0.01;
    }
    @Test
    public void test1(){
        double result = 1.0;
       Assert.assertNotEquals("Result must be < 1", result, TaylorSeries.arctgFunctionA(x, n));

    }
    @Test
    public void test2(){
        TaylorSeries ts1 = new TaylorSeries();

        Assert.assertNotNull("the object must be empty",ts1);
    }
    @Test
    public void test3(){
      Assert.assertNotSame("both variables refer to different objects", x, n);
    }

}