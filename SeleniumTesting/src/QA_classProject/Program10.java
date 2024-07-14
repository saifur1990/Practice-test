package QA_classProject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/kolyaktar/Downloads/geckodriver");
		
		 FirefoxDriver  browserObject = new FirefoxDriver();
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
	        browserObject.findElement(By.xpath("//input[@value ='female']")).click();
	        
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
	        
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        browserObject.findElement(By.xpath("//*[@id=\"other\"]")).click();
	        
	        browserObject.findElement(By.name("submit")).click();
	}

}
