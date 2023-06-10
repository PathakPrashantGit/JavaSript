package JSTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
       public static void main(String[] args) {
		
    	   WebDriverManager.chromedriver().setup();
    	   WebDriver driver = new ChromeDriver();
    	   
    	   driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
    	   
    	   JavascriptExecutor Jas=(JavascriptExecutor)driver;
    	   
    	   Jas.executeScript("document.getElementById('input-email').setAttribute('value','som@gmail.com')");
    	   
    	   Jas.executeScript("document.getElementById('input-password').setAttribute('value','tom123')");
    	   
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    	   Jas.executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@value='Login']")));
    	   
	}
}
