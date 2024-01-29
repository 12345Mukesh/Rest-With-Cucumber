package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.List;

public class SeleniumScript
{
 public static void main(String args[]) throws InterruptedException {
     WebDriverManager.chromedriver().setup();
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();

     driver.get("http://autopract.com/selenium/dropdown4/");
     Thread.sleep(5);


     driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-default']")).click();

     List<WebElement> list= driver.findElements(By.xpath("//ul[@class='dropdown-menu inner']"));
     HashSet<String> hs= new HashSet<>();

     for(int i=0;i<list.size();i++)
     {
         String s=list.get(i).getText();
         hs.add(s);
     }

     System.out.println(hs);








 }


}
