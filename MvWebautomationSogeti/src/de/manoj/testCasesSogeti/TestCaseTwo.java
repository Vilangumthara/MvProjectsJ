package de.manoj.testCasesSogeti;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestCaseTwo {
    static ChromeDriver driver;

    public static void main(String[] args) {
// set the system property

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Vmanoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.sogeti.com/");
        // Accept all coockies
        By cookies_accept = By.xpath("//*[@id=\"CookieConsent\"]/div[1]/div/div[2]/div[2]/button[1]");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(cookies_accept)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(cookies_accept));

        // Print the url before mouse hover service button
        String currenturlstart = driver.getCurrentUrl();
        System.out.println("\ncurrent url before mouse hover service menu is  " + currenturlstart);

        // Step to mouse Hover the button "Service"
        Actions actions = new Actions(driver);
        WebElement myMaus = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/nav/ul/li[3]/div[1]/span"));
        actions.moveToElement(myMaus).perform();
        String currenturlOne = driver.getCurrentUrl();
        System.out.println("\nurl mouse hover at the button is " + currenturlOne);


        // Click on link "Automation"
        driver.findElementByXPath("//*[@id=\"header\"]/div[1]/nav/ul/li[3]/div[2]/ul/li[7]/a").click();
        String currenturlTwo = driver.getCurrentUrl();
        System.out.println("\nThe url after clicking on Automation is " + currenturlTwo);

        // Scroll down to the Input field First Name
        WebElement myElement = (WebElement) driver.findElement(By.id("4ff2ed4d-4861-4914-86eb-87dfa65876d8"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", myElement);

// Input the firstName,lastName,message and email
        String     firstName = "Manoj";
        String     lastName  = "Vilangumthara";
        String     email     = "abc@gmail.com";
        String     message   = "Hallo I am interested to know more about your company.please contact me via mail";
        String     phone     = "12345";
        try {
            WebElement myFirstName;
            myFirstName = (WebElement) driver.findElementByName("__field_123927");
            myFirstName.sendKeys(firstName);

            myFirstName = (WebElement) driver.findElementByName("__field_123938");
            myFirstName.sendKeys(lastName);

            myFirstName = (WebElement) driver.findElementByName("__field_123928");
            myFirstName.sendKeys(email);

            myFirstName = (WebElement) driver.findElementByName("__field_123931");
            myFirstName.sendKeys(message);

            myFirstName = (WebElement) driver.findElementByName("__field_123929");
            myFirstName.sendKeys(phone);


            myFirstName = (WebElement) driver.findElementByName("__field_132596");
            myFirstName.click();
            myFirstName.sendKeys("france");

            myFirstName = (WebElement) driver.findElementByName("__field_123935");
            myFirstName.click();

            // Check captha box

             // myFirstName = (WebElement) driver.findElementsById("c0706cb4-c58d-4c20-835a-a327a013a48f");
             // myFirstName.click();

            myFirstName = (WebElement) driver.findElementByName("submit");
            myFirstName.click();

            System.out.println("\n *** END OF PROGRAM *** ");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }

    }
}
