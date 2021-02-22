package de.manoj.testCasesSogeti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TetstCaseOne {
    /**
     * Entry point of the Applicaion
     */

    static ChromeDriver driver;
    // main method and program starts

    public static void main(String[] args) {
        TestCaseThree myObject = new TestCaseThree();

        // set the web driver properties
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Vmanoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.sogeti.com/");

        // To accept all coockies
        By cookies_accept = By.xpath("//*[@id=\"CookieConsent\"]/div[1]/div/div[2]/div[2]/button[1]");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(cookies_accept)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(cookies_accept));

        // Print the url before mouse hover service button
        String currenturlstart = driver.getCurrentUrl();
        System.out.println("\ncurrent url before mouse hover service menu is  " + currenturlstart);

        // Step to mouse Hover the button "Service"
        Actions    actions = new Actions(driver);
        WebElement myMaus  = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/nav/ul/li[3]/div[1]/span"));
        actions.moveToElement(myMaus).perform();
        String currenturlOne = driver.getCurrentUrl();
        System.out.println("\nurl mouse hover at the button is " + currenturlOne);
        // Click on link "Automation"
        driver.findElementByXPath("//*[@id=\"header\"]/div[1]/nav/ul/li[3]/div[2]/ul/li[7]/a").click();
        String currenturlTwo = driver.getCurrentUrl();
        System.out.println("\nThe url after clicking on Automation is " + currenturlTwo);

        // mouse hover back to service button
        Actions    actionsnew = new Actions(driver);
        WebElement myMausNew  = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/nav/ul/li[3]/div[1]/span"));
        actionsnew.moveToElement(myMausNew).perform();
        String currenturlEnd = driver.getCurrentUrl();
        System.out.println("\nurl mouse hover at the button is " + currenturlEnd);
        System.out.println("\n********* END OF TEST RUN *********");
    }

}
