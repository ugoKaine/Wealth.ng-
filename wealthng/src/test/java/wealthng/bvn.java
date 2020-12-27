package wealthng;


import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bvn {
	public WebDriver driver;
	
	@Test

	public void validateBVN () throws InterruptedException
	{
		 
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/driver/chromedriver") ;
		driver = new ChromeDriver();
	 
	    driver.get("https://staging.wealth.ng/wealth/intro");
	    driver.manage().window().maximize();
	   
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.findElement(By.linkText("Log in")).click();
	    driver.findElement(By.id("login_username")).sendKeys("peter@sankore.com");
	    driver.findElement(By.id("login_password")).click();
	    driver.findElement(By.id("login_password")).sendKeys("Batsignal30$"); 
	    Thread.sleep(2000);
	    driver.findElement(By.id("kc-login")).click();
	    Thread.sleep(3000);	   
	    
	    driver.findElement(By.xpath("//a[@class='user-opener']")).click(); Thread.sleep(2000);
	    driver.findElement(By.linkText("Profile & Settings")).click();  Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/aside/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"bvn_div\"]/div/input")).sendKeys("22148990173");
	    
	    driver.findElement(By.xpath("//*[@id=\"bvn_verify_button\"]")).click();
	    
	   driver.findElement(By.xpath("//*[@id=\"verifyBvn\"]/strong")).getText();
	   
	   Thread.sleep(3000);
	   
	   driver.close();
		
	}
	
	
	
}
