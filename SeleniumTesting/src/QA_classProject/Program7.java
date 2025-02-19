package QA_classProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/kolyaktar/Downloads/geckodriver");
		
		 FirefoxDriver  browserObject = new FirefoxDriver();
		// 3. Open the web page https://www.google.com/
	        browserObject.get("https://www.google.com/");
		// 4. The value of text link is stored in bloglink reference . Here TextLink is a locator that checks wether a text is link or not.		  
	        WebElement blogLink = browserObject.findElement(By.linkText("Gmail"));
				  
				 
		// 5. If the text is form of link then its displayed or else will not display
	        if (blogLink.isDisplayed()) {
	            System.out.println("Gmail link is diplayed usingLinkText");
	        } else {
	            System.out.println("Unable to find Gmail");
	        }
	     // 6. Close the browser
	        browserObject.close();
	}

}
