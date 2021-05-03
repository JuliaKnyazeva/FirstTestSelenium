package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/chrome/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        WebElement input = driver.findElement(By.className("gLFyf"));
        input.sendKeys("123\n");

        Thread.sleep(5000);

        WebElement result = driver.findElement(By.xpath("//h3[contains(text(),'Sofia Reyes - 1, 2, 3 (feat. Jason Derulo & De La ')]"));
        //result.click();

        Assert.assertEquals(result.getText(), "Sofia Reyes - 1, 2, 3 (feat. Jason Derulo & De La '");



        Thread.sleep(5000);

        driver.quit();




    }





}
