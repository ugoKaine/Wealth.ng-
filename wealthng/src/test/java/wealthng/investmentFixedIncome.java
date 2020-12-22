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

public class investmentFixedIncome extends authUser{
	
	@Test
	public void validateInvestmentFixedIncome () throws IOException, InterruptedException
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
		Thread.sleep(3000);
		String f =driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText();
		AssertJUnit.assertEquals(f, "Success");
		
        driver.navigate().back();
		
		driver.close();
		
		
	}

}
