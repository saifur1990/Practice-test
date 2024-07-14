package QA_classProject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/kolyaktar/Downloads/geckodriver");
		
		 FirefoxDriver  browserObject = new FirefoxDriver();
		 browserObject.get("https://www.google.com/");
		    
		    browserObject.findElement(By.name("q")).sendKeys("Selenium Python");
		    
		    browserObject.findElement(By.name("btnK")).submit();
	}

}
