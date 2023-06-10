package JSTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.Flash;
import io.github.bonigarcia.wdm.WebDriverManager;

public class First_1_Flash {
	
	
	@Test
	public void Flashdemo()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		WebElement join = driver.findElement(By.xpath("(//span[text()='Join now for free'])[1]"));
		Flash.flashEle(driver, join);
				
	}

}
