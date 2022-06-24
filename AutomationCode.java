package bd.com.web_automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AutomationCode extends DriverSetup {
	
	public static String baseUrl= "https://www.daraz.com.bd/";
	
	@Test
	public static void Daraz() throws InterruptedException { 

		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(3000); 
		
		String actualTitle ="Online Shopping in Bangladesh: Order Now from Daraz.com.bd";
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		
		if (getTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("Title Match");
			
		                          //do Login
		
		driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Please enter your Phone Number or Email']")).sendKeys("01676572264");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kamrul2264");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Sell on Daraz')]")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//span[contains(text(),'CUSTOMER CARE')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@id='myAccountTrigger']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class='account-icon test logout']")).click();
		Thread.sleep(5000);				
		
		  } 
		else {
				System.out.println("Title is not Match");
				driver.close();
			}
			
			
		}
			
		
	}
	
