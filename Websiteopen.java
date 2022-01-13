package project.automotion_1st;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Websiteopen extends Driversetup  {
	
	public static String baseUrL="https://www.daraz.com.bd/";

	@Test
	public static void Daraz() throws InterruptedException  {
		
		driver.get(baseUrL);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		String actualTitle ="Online Shopping in Bangladesh: Order Now from Daraz.com.bd";
		
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		
		driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Please enter your Phone Number or Email']")).sendKeys("01676572264");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kamrul2264");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@id='myAccountTrigger']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("account-icon test logout")).clear();
		Thread.sleep(5000);
		
	}
}
