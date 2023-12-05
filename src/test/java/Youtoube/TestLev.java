package Youtoube;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLev {
    public static WebDriver driver;


    public static void openUrl(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static void quite() {
        driver.quit();
    }

    public static boolean isSityPresent(String sity) {
        openUrl("https://uk.wikipedia.org/wiki/%D0%9C%D1%96%D1%81%D1%82%D0%B0_%D0%A3%D0%BA%D1%80%D0%B0%D1%97%D0%BD%D0%B8_(%D1%81%D0%BF%D0%B8%D1%81%D0%BE%D0%BA)");
        WebElement foundElement = driver.findElement(By.xpath("//a[contains (@title,'" + sity + "')]"));
        if (foundElement.getText().equals(sity)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(isSityPresent("Адіївка"));
        quite();
    }
}


