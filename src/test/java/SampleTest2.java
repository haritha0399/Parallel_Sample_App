import org.testng.annotations.Test;
import pageEvents.Calculation;

public class SampleTest2 extends BaseTest{
    @Test
    public void secondTest() throws InterruptedException {
        System.out.println("::Test2::");
        Calculation calObj = new Calculation(getTLDriver());
        calObj.secondCalculation();
    }
}
