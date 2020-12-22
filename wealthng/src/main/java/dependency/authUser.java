package dependency;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class authUser extends bases{
	
public WebDriver authenticate() throws IOException, InterruptedException
	
	{
		driver = initialize();
		
		driver.get("https://.staging.wealth.ng");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='btn btn-outline']")).click();
		driver.findElement(By.name("username")).sendKeys("chibugo@sankore.com");
		driver.findElement(By.name("password")).sendKeys("Drogba7$");
		driver.findElement(By.id("kc-login")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver;
		
		
	}

}
