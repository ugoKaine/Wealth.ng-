package wealthng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import dependency.authUser;

public class investmentRealestate extends authUser {
	
	@Test
	
	public void validateInvestmentRealestate () throws IOException, InterruptedException
	{
		driver = authenticate ();
		
		driver.findElement(By.id("marketplace_link")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"tab_RE\"]/a")).click();
		System.out.println("No realestate investment yet");
		
		
	}
	
	@AfterTest
	
	public void teardown()
	{
		driver.close();
		
	}

}
