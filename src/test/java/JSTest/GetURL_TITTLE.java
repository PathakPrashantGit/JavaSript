package JSTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetURL_TITTLE {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tutorialsninja.com/demo/");
		
	JavascriptExecutor js =	(JavascriptExecutor)driver;
	
	// get Tittle of page
	System.out.println(js.executeScript("return document.title"));
	
	//get Url of page
	
	System.out.println(js.executeScript("return document.URL"));
		
	}

}
