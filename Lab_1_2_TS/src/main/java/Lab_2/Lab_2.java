package Lab_2;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lab_2 {
    public static void main(String[] args) throws  Exception{
        System.setProperty("webdriver.opera.driver", "C:\\Users\\rayca\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
        WebDriver driver = new OperaDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.navigate().to("http://ecco-shoes.md/ru/");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/a")));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div[2]/div[2]/a")).click(); // Man

        driver.findElement(By.xpath("//*[@id=\"filters_list\"]/div[4]/div/div[2]")).click(); // 39
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"items\"]/form/div[3]/a")).click(); // Change Default
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[15]/div/ul/li[3]")).click(); // Sort Low -> Big
        Thread.sleep(2000);

        List<String> currentOptions = new Vector<String>();
        // Pull out the options as web elements
        List<WebElement> matches = driver.findElements(By.className("container"));

        // Traverse the web elements to extract the text. Text gets added to the 'currentOptions' List
        //for ( : ) - for each
        for(WebElement match : matches) {
            currentOptions.add(match.getText());
//            System.out.println(currentOptions);
        }
        //Size of arrayList
        System.out.println("Size of ArrayList at creation: " + currentOptions.size());
        System.out.println(((Vector<String>) currentOptions).firstElement());
    }
}