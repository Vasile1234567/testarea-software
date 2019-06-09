package Lab_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main (String [] args) throws Exception
    {
        System.setProperty("webdriver.opera.driver", "C:\\Users\\rayca\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
        WebDriver driver = new OperaDriver();
        driver.get("file:///D:/University/University/Anul%20III/II_Half-Year/TestareaSoftware/Lab_1/login.html");
        driver.manage().window().maximize();
        String logIn = "mr.struik";
        String passIn = "root";

        // enter a valid email address
        driver.findElement(By.id("login")).sendKeys(logIn);

        // enter a valid password
        driver.findElement(By.id("pas")).sendKeys(passIn);
        Thread.sleep(2000);
        // click button
        driver.findElement(By.id("Submit")).click();
        Thread.sleep(2000);

        driver.close();
        driver.quit();
    }
}