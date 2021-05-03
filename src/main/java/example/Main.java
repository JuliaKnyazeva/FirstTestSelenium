package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/User/Desktop/chrome/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        Thread.sleep(5000);

        driver.quit();




    }





}
