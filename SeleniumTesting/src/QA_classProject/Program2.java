package QA_classProject;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Program2 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.gecko.driver", "/Users/kolyaktar/Downloads/geckodriver");
			
			 FirefoxDriver  browserObject = new FirefoxDriver();
			
		        browserObject.get("http://www.amazon.com/");
	}

}
