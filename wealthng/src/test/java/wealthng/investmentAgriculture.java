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

public class investmentAgriculture  extends authUser{
	
	@Test
	
	public void validateInvestmentAgriculture() throws IOException, InterruptedException
	
	{
		driver = authenticate ();
		
		driver.findElement(By.id("marketplace_link")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"tab_AG\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"AG\"]/li[2]/div/div[3]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("stock_purchase_operation_units")).sendKeys("1");
		driver.findElement(By.xpath("//*[@id=\"buy-stocks-body\"]/div/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("cart_pointer")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[3]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"paymentMethod-form\"]/div[2]/div/ul/li[4]/label/span[2]")).click();
		driver.findElement(By.id("make-payment")).click();
		Thread.sleep(3000);
		String h =driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText();
		AssertJUnit.assertEquals(h, "Success");
		
		driver.navigate().back();
			
		driver.close();
		
		
		
	}

}
