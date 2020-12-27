package wealthng;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import dependency.bases;

public class login extends bases {
	
	@Test
	
	public void validateLogin() throws IOException, InterruptedException
	
	{
		driver = initialize();
		
		driver.get("https://.staging.wealth.ng");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn btn-outline']")).click();
		driver.findElement(By.name("username")).sendKeys("chibugo@sankore.com");
		driver.findElement(By.name("password")).sendKeys("Drogba7$");
		driver.findElement(By.id("kc-login")).click();
		Thread.sleep(3000);
		String a = driver.findElement(By.xpath("//a[@class='user-opener']")).getText();
		Assert.assertEquals(a, "CHIBUGO");
		
		
	}
	
	@AfterTest
	
	
	public void close()
	{
		
		driver.close();
		
		
	}

}
