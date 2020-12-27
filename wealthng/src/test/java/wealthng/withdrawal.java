package wealthng;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import dependency.authUser;

public class withdrawal extends authUser{
	
	@Test
	public void validateWithdrawal () throws IOException, InterruptedException
	{
		
		driver = authenticate ();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn-sky']")).click();
		
		driver.findElement(By.id("withdrawalAmt")).sendKeys("5000");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"withdrawModalContainer\"]/div/div[3]/button")).click();
		Thread.sleep(3000);
		
		String e =driver.findElement(By.xpath("//*[@id=\"withdrawalOTPModal\"]/div[2]/strong")).getText();
		
		Assert.assertEquals(e, "OTP Verification");
		
		
		driver.navigate().back();
		
		
	}
	
	@AfterTest
	
	public void teardown()
	{
		driver.close();
		
	}

}
