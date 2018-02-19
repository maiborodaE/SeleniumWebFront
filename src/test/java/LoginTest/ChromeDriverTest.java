package LoginTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeDriverTest {
    public static void main(String[] args) {
        String baseURL = "https://portal-dev.effie.ua/login";
        String mainURL;
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maiboroda.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get(baseURL);
        driver.manage().window().maximize();

        driver.findElement(By.id("email--1")).sendKeys("popov.m@ipland.com.ua");
        driver.findElement(By.id("password--2")).sendKeys("Qq123456");
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            mainURL = driver.getCurrentUrl();
        System.out.println(mainURL);
//        driver.findElement(By.linkText("Welcome to Main Page!"));
//        driver.close();
//        driver.quit();

    }
}
