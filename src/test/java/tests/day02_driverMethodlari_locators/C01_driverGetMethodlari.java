package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverGetMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        System.out.println("Title "+ driver.getTitle());
        System.out.println("Url : " + driver.getCurrentUrl());
        System.out.println("=================");
        System.out.println(driver.getPageSource());


        System.out.println("window handle degeri : " + driver.getWindowHandle());
        //  99126B3E964314CFD71AE84F128D19E5

        System.out.println("window handle degerleri sati . " + driver.getWindowHandles());
        // [99126B3E964314CFD71AE84F128D19E5]

          /*
            Webdriver her pencereye unique bir window handle degeri atamasi yapar

            Bir test class'i calismaya basladiktan sonra
            birden fazla pencere de acabilir

            bu durumda tek bir window handle degeri degil
            acilan sayfa adedince window handle degerlerimiz olur
            Birden fazla element olunca Selenium onlari set'e koymayi uygun gormus
         */



        driver.close();

    }
}