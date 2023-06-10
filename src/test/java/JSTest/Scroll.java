package JSTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
	JavascriptExecutor js =	(JavascriptExecutor)driver;
	
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	Thread.sleep(4000);
	js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
	}

}
