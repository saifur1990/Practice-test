package QA_classProject;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/kolyaktar/Downloads/geckodriver");
		// 2. Initialize Webdriver object through ChromeDriver class. 
		 FirefoxDriver  browserObject = new FirefoxDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
	        browserObject.get("http://www.google.com/");
	}

}
