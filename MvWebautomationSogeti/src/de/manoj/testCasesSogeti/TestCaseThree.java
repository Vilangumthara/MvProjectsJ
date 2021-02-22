package de.manoj.testCasesSogeti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestCaseThree {
    /**
     * Entry point
     */
    static ChromeDriver driver;

    public static void main(String[] args) {
        /**
         * Application Starts
         * Main method of the application
         */
        // set the system properties and cookies
        systemPropertiesAndCoockies();
        // Click on the worlwide button and check the url
        checkCountryUrl();

        System.out.println("\n*** END OF PROGRAM ***");
    }
     // Create the method CheckCountryUrl
    private static void checkCountryUrl() {
        WebElement worldwide = driver.findElementByXPath("//*[@id=\"header\"]/div[1]/div[2]/div[2]/div[2]/span");
        worldwide.click();

        // Belgium
        WebElement belgium = driver.findElementByXPath("//*[@id=\"header\"]/div[3]/ul/li[1]/a");
        belgium.click();

        // Finland
        WebElement finland = driver.findElementByXPath("//*[@id=\"header\"]/div[3]/ul/li[2]/a");
        finland.click();

        // France
        WebElement france = driver.findElementByXPath("//*[@id=\"header\"]/div[3]/ul/li[3]/a");
        france.click();

        // Germany
        WebElement germany = driver.findElementByXPath("//*[@id=\"header\"]/div[3]/ul/li[4]/a");
        germany.click();

        // Ireland
        WebElement ireland = driver.findElementByXPath("//*[@id=\"header\"]/div[3]/ul/li[4]/a");
        ireland.click();

        // Luxemburg
        WebElement luxemburg = driver.findElementByXPath("//*[@id=\"header\"]/div[3]/ul/li[4]/a");
        luxemburg.click();

        // Netherlands
        WebElement netherlands = driver.findElementByXPath("//*[@id=\"header\"]/div[3]/ul/li[4]/a");
        netherlands.click();

        // Norway
        WebElement norway = driver.findElementByXPath("//*[@id=\"header\"]/div[3]/ul/li[4]/a");
        norway.click();

        // Spain
        WebElement spain = driver.findElementByXPath("//*[@id=\"header\"]/div[3]/ul/li[4]/a");
        spain.click();

        // Sweden
        WebElement sweden = driver.findElementByXPath("//*[@id=\"header\"]/div[3]/ul/li[4]/a");
        sweden.click();

        // UK
        WebElement uk = driver.findElementByXPath("//*[@id=\"header\"]/div[3]/ul/li[4]/a");
        uk.click();

        // USA
        WebElement usa = driver.findElementByXPath("//*[@id=\"header\"]/div[3]/ul/li[4]/a");
        usa.click();
    }

    // Create the method systemPropertiesAndCoockies
    public static void systemPropertiesAndCoockies() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Vmanoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.sogeti.com/");
        // call the method to accept all coockies
        By            cookies_accept = By.xpath("//*[@id=\"CookieConsent\"]/div[1]/div/div[2]/div[2]/button[1]");
        WebDriverWait wait           = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(cookies_accept)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(cookies_accept));
    }
}
