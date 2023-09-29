package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IklOtomasyonTesti {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. yeni bir class olusturalim : C03_GetMethods
        //3. amazon sayfasina gidelim. https://www.amazon.com
        driver.get("https://www.amazon.com/");

        //4. sayfa basligini(title) yazdirin
        System.out.println("sayfanin basligi :"+driver.getTitle());

        //5. sayfa basligini "amazon" icerdigini test edin
        String expectedIcerik = "Amazon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title testi FAILED");
            System.out.println("sayfadaki actual title :"+actualTitle);
        }

        //6. sayfa adresini (Url) yazdirin
        System.out.println("actual sayfa Url'li ."+driver.getCurrentUrl());

        //7. sayfa Utl' nin "amazon" icerdigini test edin

        String expectedUrlIcerik = "amazon";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("Url testi FAILED");
        }


        //8. sayfa handle degerini yazdirin
        System.out.println("sayfanin handle degeri : "+driver.getWindowHandle());
        //9. sayfa HTML kodlarini "alisveris" kelimesi gectigini test edin
        String expectedSayfaIcerigi = "alisveris";
        String actualSayfaKaynakKodlari = driver.getPageSource();

        if (actualSayfaKaynakKodlari.contains(expectedSayfaIcerigi)){
            System.out.println("sayfa kaynagi testi PASSED");
        }else {
            System.out.println("sayfa kaynagi testi FAILED");
            System.out.println("sayfa kaynak kodlari :'"+expectedSayfaIcerigi +"'kelimesi icermiyor");
        }
        //10. sayfayi kapatin.


        driver.close();


    }
}
