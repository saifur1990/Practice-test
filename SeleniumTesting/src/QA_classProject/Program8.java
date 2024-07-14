package QA_classProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/kolyaktar/Downloads/geckodriver");
		
		 FirefoxDriver  browserObject = new FirefoxDriver();
		 browserObject.get("https://admin-demo.nopcommerce.com/login");
	       
			// 4. Get reference of Email input box by locate the id method.
		        WebElement email=browserObject.findElement(By.id("Email"));
			// 5. Clear the Email input box.
		        email.clear();
			// 6. Get reference of Password input box by locate the id method.
		        WebElement password=browserObject.findElement(By.id("Password"));
			// 7. Clear the Password input box.
		        password.clear();
			// 8. Provide/Enter the correct email to email input box through reference.
		        email.sendKeys("admin@yourstore.com");
			// 9. Provide/Enter the correct password to password input box through reference.
		        password.sendKeys("admin");
			// 10. Get reference of login button by locate the classname method.
		        WebElement button=browserObject.findElement(By.className("button-1"));
			// 11. Submit the button.
		        button.submit();
			// 12. Close the web browser.
		        browserObject.close();
	}

}
