package u0LoginTest;
import Credentials.UserCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class QuestItemsTests {
    private static String randomName = UserCredentials.randomName;
    private static String activityMenu = UserCredentials.activityMenu;
    private static String constrAnketMenu = UserCredentials.constrAnketMenu;
    private static String createQHbutton = UserCredentials.createQHbutton;
    private static String saveQHbutton = UserCredentials.saveQHbutton;
    private static String deleteQHbutton = UserCredentials.deleteQHbutton;
//    private static String testname = "112";





    static String namePath = "name";
    static String nameQIselector = "[name=\"name\"]";
    static String answerFormatField = "[name=\"answerFormatId\"] > div:nth-of-type(1) > div:first-child > div:nth-of-type(2)";
    private static String saveQItemButton = "div.button-wrap > button:first-child > div > span";

    public static void main(String[] args) throws InterruptedException {
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
        WebElement activity = driver.findElement(By.cssSelector(activityMenu));
        activity.click();
        Thread.sleep(1000);
        WebElement constranket = driver.findElement(By.cssSelector(constrAnketMenu));
        constranket.click();
        Thread.sleep(3000);
        WebElement createQH = driver.findElement(By.cssSelector(createQHbutton));
        createQH.click();
        WebElement fieldQHname = driver.findElement(By.name(namePath));
        fieldQHname.sendKeys(randomName);
        WebElement saveButton = driver.findElement(By.cssSelector(saveQHbutton));
        saveButton.click();
        WebElement createdQH  = driver.findElement(By.xpath("//div[@class=\"selectable-list questionare-list\"]//div[contains(text(),'"+randomName+"')]"));
        createdQH.click();
        WebElement createQIbutton = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/div/div/div[2]/div/div/div[1]/div/div/div[3]/button/div/span"));
        createQIbutton.click();
        WebElement nameQI = driver.findElement(By.cssSelector(nameQIselector));
        nameQI.sendKeys(randomName);
        WebElement answerformat = driver.findElement(By.cssSelector(answerFormatField));
        answerformat.click();
        Thread.sleep(2000);
        WebElement danetelement = driver.findElement(By.cssSelector("body > div:nth-of-type(7) > div > div > div > div:nth-of-type(2) > span > div > div > div"));
        danetelement.click();
        Thread.sleep(2000);
        WebElement saveQI = driver.findElement(By.cssSelector(saveQItemButton));
        saveQI.click();
        Thread.sleep(3000);
        WebElement findQHtoDelete  = driver.findElement(By.xpath("//div[@class=\"selectable-list questionare-list\"]//div[contains(text(),'"+randomName+"')]"));
        findQHtoDelete.click();
        WebElement deleteQH  = driver.findElement(By.cssSelector(deleteQHbutton));
        deleteQH.click();
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        
        {
        }
    }
}
