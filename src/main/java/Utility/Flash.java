package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flash {
	
	public static void flashEle(WebDriver driver, WebElement element)
	{
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i=0; i<500; i++)
		{
			changeColor("#000000", element,driver);
			changeColor(bgcolor,element,driver);
		}
		
	}

	private static void changeColor(String color, WebElement element, WebDriver driver) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("argument[0].style.backgroundColor = '" + color +"'", element);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			
		}
		
	}

}
