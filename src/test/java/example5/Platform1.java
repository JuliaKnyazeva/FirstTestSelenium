package example5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Platform1 {
    @BeforeClass// то, что перед тестом выполняется
    public void before() {
        WebDriverManager.chromedriver().setup();
    }

    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver(); //открывает тест7
    }

    @Test
    public  void test() throws InterruptedException {

        try {
            driver.get("https://www.google.com/");

            WebElement input = driver.findElement(By.className("gLFyf"));
            input.sendKeys("123\n");

            Thread.sleep(2000);

            WebElement result = driver.findElement(By.className("DKV0Md"));
            //result.click();

            Assert.assertEquals(result.getText(), "УМОРИТЕЛЬНЫЕ ЛАЙФХАКИ ДЛЯ ЛЕНИВЫХ || Крутые ...");

            Thread.sleep(1000);
        } finally {
            driver.quit();
        }

        //try{} finally{} это показывает нам, что обязательно должно быть выполнено, должно быть тело в трай и выход в файналли
    }

    // @AfterTest
    //public void afterTest(){
    //    driver.quit();
    //}   закрывает тест, но тогда try - finally не используется в конструкции, должно быть что-то одно
}
