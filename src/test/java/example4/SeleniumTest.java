package example4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void firstTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/chrome/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0" +
                "%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");

        WebElement firstSearch = driver.findElement(By.xpath("//input[@id='searchInput']"));
                firstSearch.sendKeys("Latvia");

        WebElement clickButton = driver.findElement(
                By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/div[1]/form[1]/div[1]/input[4]"));
                clickButton.click();

        Assert.assertEquals("https://ru.wikipedia.org/wiki/Latvia",
                "https://ru.wikipedia.org/wiki/Latvia");


        Thread.sleep(3000);
        driver.quit();

        /* 1. Заходим на сайт вики;
        2.  Ищем поле для поиска;
        3.  Вводим искомое значение;
        4. Что-нибудь распечатываем в консоль.
         */




    }


}
