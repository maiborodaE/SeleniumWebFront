package Manufacturers;

import Credentials.UserCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static Credentials.UserCredentials.*;

public class ChromeManufTest {
    private static String randomName = UserCredentials.randomName;


    public static void main(String[] args) throws InterruptedException, Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maiboroda.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get(UserCredentials.baseURL);
        driver.manage().window().maximize();

        WebElement loginform = driver.findElement(By.name("userName"));
        loginform.sendKeys(UserCredentials.login);
        WebElement pswrdform = driver.findElement(By.name("password"));
        pswrdform.sendKeys(UserCredentials.pswrd);
        pswrdform.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WebElement directoiries = driver.findElement(By.cssSelector(directoriesMenu));
        directoiries.click();
        Thread.sleep(1000);
        WebElement manuf = driver.findElement(By.cssSelector(manufMenu));
        manuf.click();
        Thread.sleep(3000);
        WebElement createManuf = driver.findElement(By.cssSelector(createManufbutton));
        createManuf.click();
        WebElement manufName = driver.findElement(By.cssSelector(nameManufField));
        manufName.sendKeys("newManufactor"+randomName);
        WebElement saveNewManufButton = driver.findElement(By.cssSelector(saveManufButton));
        saveNewManufButton.click();
        WebElement createdManuf = driver.findElement(By.xpath("//div[@class=\"ag-body-container\"]//div[contains(text(),'newManufactor" + randomName + "')]"));

    }
}
