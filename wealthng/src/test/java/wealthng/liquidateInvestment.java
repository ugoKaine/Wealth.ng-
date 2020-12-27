package wealthng;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import dependency.authUser;

public class liquidateInvestment extends authUser {
	
	
	@Test
	public void validateLiquidateInvestment () throws IOException, InterruptedException
	{
		driver = authenticate ();
		
		driver.findElement(By.id("marketplace_link")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"tab_FI\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"slick-slide00\"]/div/div[2]/div[2]/a[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("amount-to-buy")).sendKeys("5000");
		driver.findElement(By.xpath("//*[@id=\"buy-re-body\"]/div/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("cart_pointer")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"paymentMethod-form\"]/div[2]/div/ul/li[4]/label/span[2]")).click();
		driver.findElement(By.id("make-payment")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.id("marketplace_link")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"my-wealth_link\"]")).click();
		
		   JavascriptExecutor jsed = (JavascriptExecutor)driver;
		   
			jsed.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
			Thread.sleep(3000);
			
			
			driver.findElement(By.xpath("//*[@id=\"inv_tab\"]/div[2]/div[1]/div[2]/div[2]/ul/li[2]/ul/li[7]/a[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='swal2-confirm btn sweet_button']")).click();
			Thread.sleep(2000);
			//String g =driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText();
			String g=driver.findElement(By.id("swal2-title")).getText();
			
			Assert.assertEquals(g, "Success");
			
	}
	
	@AfterTest
	
	public void teardown()
	{
		driver.close();
		
	}

}
