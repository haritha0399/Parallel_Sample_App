import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    //Server trigger class
    public ThreadLocal<AppiumDriver> tld =  new ThreadLocal<>();

    public AppiumDriver getTLDriver(){
        return tld.get();
    }

    public void setTLDriver(AppiumDriver driver){
        tld.set(driver);
    }

    @BeforeTest
    public void initiateDriver() throws MalformedURLException {
        System.out.println("::Before Test::");
//        startServer(portNumber);
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appium:automationName", "UiAutomator2");
        cap.setCapability("appium:appActivity","com.bak.mnr.calculatrice.MainActivity");
        cap.setCapability("appium:app","C:\\Users\\hnavane\\Parallel_Sample_App\\sample Calculator-v1.0-ChipApk.apk");

        setTLDriver(new AndroidDriver(new URL("http://127.0.0.1:4723"),cap));
    }

    public void startServer(String portNumber){
        System.out.println("::Start server::");
        AppiumDriverLocalService service;
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1");
//        builder.usingPort(Integer.parseInt(portNumber));
        builder.usingPort(4723);
        service = AppiumDriverLocalService.buildService(builder);
        service.start();
        System.out.println("Service has been started in port number: "+portNumber);
    }

    @AfterTest
    public void closeDriver(){
        System.out.println("::After method::");
        getTLDriver().quit();
    }
}
