import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class map {

    public static void main(String[] args){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.ebay.com/itm/182905307044?_trkparms=pageci%3A5aabfb94-bff0-11ed-8ab2-d22180c4a0ea%7Cparentrq%3Ad0085fc11860acf0fa5ebff2ffff721c%7Ciid%3A1");
        List<WebElement> stars=   driver.findElements(By.xpath("//span[contains(@class,\"rs rs-fr\")]/i"));
        System.out.println("Total star="+stars.size());
    int k = 0;
        for(int i= 0; i<stars.size();i++)
        {
            if(!stars.get(i).getCssValue("background-position").contains("-56px -122px")) {
                k++;
            }
        }
        System.out.println("Full star available =" +k);

    }
}
