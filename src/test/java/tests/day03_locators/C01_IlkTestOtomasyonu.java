package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_IlkTestOtomasyonu {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // arama kutusuna "Nutella" yazdirip aratin
        // once arama kutusunu findElement() ve Locator ile driver a tanitip
        // o webelementi bu class da kullanabilecegim sekilde
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("Nutella");

        // arama sonuclarini "Nutella" icerdigini test edin

    }
}
