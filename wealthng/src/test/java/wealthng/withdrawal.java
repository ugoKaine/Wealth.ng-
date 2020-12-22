package wealthng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

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
		
		AssertJUnit.assertEquals(e, "OTP Verification");
		
		
		driver.navigate().back();
		
		driver.close();
		
		
	}

}
