package u0LoginTest;

import Credentials.UserCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class QuestHeaderTests {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maiboroda.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://portal-test.effie.mobi/login";
        String login = "u0ba2@mail.ru";
        String pswrd = "testPass";
        String namePath = "name";
        String nameQH = "nameQH";
        String mainURL;
        String randomName = UserCredentials.randomName;
        String updatedQHname = "Updated "+ randomName;

//        WebDriver driver;
//        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get(baseURL);
        driver.manage().window().maximize();

        WebElement loginform =  driver.findElement(By.name("userName"));
                loginform.sendKeys(login);
        WebElement pswrdform = driver.findElement(By.name("password"));
                pswrdform.sendKeys(pswrd);
        pswrdform.sendKeys(Keys.ENTER);
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        Thread.sleep(3000);
        WebElement activity = driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/div[1]/div[2]/div[1]/div[1]/div[5]"));
                activity.click();
        Thread.sleep(1000);
        WebElement constranket = driver.findElement(By.xpath("//*[@id=\"app-root\"]/div/div[1]/div[2]/div[1]/div[2]/div/div[2]/span/div/div/div"));
        constranket.click();
        Thread.sleep(3000);
        WebElement createQH = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/div/div/div[1]/div/div/div[1]/div/div/div[3]/button/div/span"));
        createQH.click();
        WebElement fieldQHname = driver.findElement(By.name(namePath));
        fieldQHname.sendKeys(randomName);
        WebElement saveButton = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/form/div[4]/button[1]/div/span"));
        saveButton.click();
        WebElement createdQH  = driver.findElement(By.xpath("//div[@class=\"selectable-list questionare-list\"]//div[contains(text(),'"+randomName+"')]"));
        createdQH.click();
        WebElement editButton = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/div/div/div[1]/div/div/div[1]/div/div/div[2]/button/div"));
        editButton.click();
        WebElement fieldQHname2 = driver.findElement(By.name(namePath));
        fieldQHname2.clear();
        fieldQHname2.sendKeys(updatedQHname);
        WebElement saveButton2 = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/form/div[4]/button[1]/div/span"));
        saveButton2.click();
        WebElement updatedQH  = driver.findElement(By.xpath("//div[@class=\"selectable-list questionare-list\"]//div[contains(text(),'"+updatedQHname+"')]"));
        updatedQH.click();
        WebElement deleteButton  = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/div/div/div[1]/div/div/div[1]/div/div/div[1]/button/div/span"));
        deleteButton.click();
        driver.switchTo().alert().accept();



//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            mainURL = driver.getCurrentUrl();
//        System.out.println(mainURL);
//        driver.findElement(By.linkText("Welcome to Main Page!"));
//        driver.close();
//        driver.quit();

    }
}
