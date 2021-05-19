package example6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class TestJava1905 {

        private WebDriver driver;

        @BeforeClass
        public void before() {
            WebDriverManager.chromedriver().setup();
        }

        @BeforeMethod
        public void beforeTest() {
            driver = new ChromeDriver();
        }

        @Test
        public void TestReview() throws InterruptedException {
            driver.get("http://shop.demoqa.com/my-account/");
            Thread.sleep(1000);
            driver.findElement(By.linkText("Lost your password?")).click();
            Thread.sleep(1000);
            driver.navigate().to("http://shop.demoqa.com/my-account/");
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().forward();
            Thread.sleep(1000);
            driver.navigate().refresh();
            Thread.sleep(2000);
        }

    public static void newClick (WebDriver driver, WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }
        @Test
        public void TestReviewSecond() throws InterruptedException {
            driver.get("https://demoqa.com/automation-practice-form");

            driver.findElement(By.id("firstName")).sendKeys("Julia");
            Thread.sleep(1000);
            driver.findElement(By.id("lastName")).sendKeys("Kn...va");
            Thread.sleep(1000);
            driver.findElement(By.id("lastName")).clear();
            driver.findElement(By.id("lastName")).sendKeys("Knyazeva");

            WebElement textEmail = driver.findElement(By.id("userEmail"));
            textEmail.sendKeys("jkn@gmail.com");
            Thread.sleep(1000);

            WebElement radioButtonGender = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
            Thread.sleep(1000);
            radioButtonGender.click();
            Thread.sleep(1000);
            /*second way (69-72)*/
            WebDriverWait wait = new WebDriverWait(driver, 2);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text()," +
                    "'Female')]")));
            ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
            /*Collection with tests*/
            List<WebElement> gender = driver.findElements(By.xpath("//input[@type='radio']"));
            gender.size();
            for (int i = 0; i < gender.size(); i++) {
                String value = gender.get(i).getAttribute("value");
                Thread.sleep(1000);
                if(value.equalsIgnoreCase("male")) {
                    newClick(driver, gender.get(i));
                    break;
                }
                Thread.sleep(1000);
            }
        }

        @AfterMethod
        public void afterTest() {
            driver.quit();
        }
}
