package LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFdriverTest {
    public static void main(String[] args) {
//        WebDriver driver;
        System.setProperty("webdriver.firefox.bin",
                "C:\\Users\\maiboroda.e\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\maiboroda.e\\Downloads\\geckodriver-v0.19.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com.ua/");

//        File pathToBinary = new File("webdriver.gecko.driver", "C:\\Users\\maiboroda.e\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
//        FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
//        FirefoxProfile firefoxProfile = new FirefoxProfile();
//        WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);


//        System.setProperty("webdriver.gecko.driver","C:\\Users\\maiboroda.e\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
//        File pathBinary = new File("C:\\Users\\maiboroda.e\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
//        FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
//        DesiredCapabilities desired = DesiredCapabilities.firefox();
//        FirefoxOptions options = new FirefoxOptions();
//        desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
//        WebDriver driver = new FirefoxDriver(options);


    }
}
