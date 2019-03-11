package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverProvider {

    /* Це - єдиний екземпляр драйвера (він же - вікно браузера).
    Тому що нам не потрібно робити кожну дію чи відкривати кожну сторінку в новому вікні.
    Цей єдиний екземпляр і використовують всі сторінки проекту */
    public static WebDriver driver = driver();

    /* Цей метод створює екземпляр ВебДрайвера, тобто по суті відкриває нове вікно браузера. */
    private static WebDriver driver(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        return new ChromeDriver();
    }

    /* метод, який чекає певну к-сть секунд */
    public static void waitFor(long seconds){
        System.out.println("Adding product to cart");
        try { Thread.sleep(seconds*1000); }
        catch (InterruptedException e) {}
    }
}
