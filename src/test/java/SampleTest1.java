import org.testng.annotations.Test;
import pageEvents.Calculation;

public class SampleTest1 extends BaseTest{

    @Test
    public void firstTest() throws InterruptedException {
        System.out.println("::Test1::");
        Calculation calObj = new Calculation(getTLDriver());
        calObj.firstCalculation();
    }

}
