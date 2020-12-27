package wealthng;

import org.testng.annotations.Test;

import org.testng.annotations.AfterTest;
import org.testng.Assert;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	
	
	
	public class testpayment{
	  private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;

	  public String waitForWindow(int timeout) {
	    try {
	      Thread.sleep(timeout);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	    Set<String> whNow = driver.getWindowHandles();
	    @SuppressWarnings("unchecked")
		Set<String> whThen = (Set<String>) vars.get("window_handles");
	    if (whNow.size() > whThen.size()) {
	      whNow.removeAll(whThen);
	    }
	    return whNow.iterator().next();
	  }
	
	  @Test
	  public void validateAccountFunding() throws InterruptedException {
	
	 
		  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/driver/chromedriver") ;
	WebDriver driver = new ChromeDriver();
	 
	    driver.get("https://staging.wealth.ng/wealth/intro");
	    driver.manage().window().maximize();
	   
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	    driver.findElement(By.linkText("Log in")).click();
	    driver.findElement(By.id("login_username")).sendKeys("chibugo@sankore.com");
	    driver.findElement(By.id("login_password")).click();
	    driver.findElement(By.id("login_password")).sendKeys("Drogba7$"); 
	    Thread.sleep(2000);
	    driver.findElement(By.id("kc-login")).click();
	    Thread.sleep(3000);
	   String b =driver.findElement(By.xpath("//*[@id=\"tab-NGN\"]/div[2]/strong[2]")).getText();
	    b = b.replaceAll("[^0-9.]", "");
		float bb = Float.parseFloat(b);
		float bbb = 50000;
		float sum = bb + bbb;
		
	    //driver.findElement(By.xpath("//*[@id=\"tab-NGN\"]/div[2]/ul/li/a")).click();
	    Thread.sleep(3000);
	    //driver.findElement(By.linkText("Deposit")).click();
	    driver.findElement(By.xpath("//*[@id=\"tab-NGN\"]/div[2]/ul/li[2]/a")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("rel003")).sendKeys("50000");
	    
	    driver.findElement(By.cssSelector("li:nth-child(1) .custom-radio")).click();
	    driver.findElement(By.cssSelector("#depositForm > .withdraw-box .btn")).click();
	    Thread.sleep(4000);
	    driver.switchTo().frame(3);
	    Thread.sleep(8000);
	    driver.findElement(By.id("card-number")).click();
	    driver.findElement(By.id("card-number")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.id("card-number")).sendKeys("4242 4242 4242 4242");
	    driver.findElement(By.id("expiration")).sendKeys("0121");
	    driver.findElement(By.id("cvv")).click();
	    driver.findElement(By.id("cvv")).sendKeys("812");
	    driver.findElement(By.id("remember-card")).click();
	    driver.findElement(By.cssSelector("#paycard-btn > .rave-payment-amount")).click();
	    Thread.sleep(10000);
	   
	    driver.findElement(By.id("avs-vbv-btn")).click();
	 
	    Thread.sleep(4000);
	    String winHandleBefore = driver.getWindowHandle();

	    for(String winHandle : driver.getWindowHandles()){
	        driver.switchTo().window(winHandle);
	    }
	   
	   
	    driver.navigate().refresh();
	    Thread.sleep(4000);
	    driver.findElement(By.id("fake_otp")).click();
	    driver.findElement(By.id("fake_otp")).sendKeys("12345");
	    driver.findElement(By.id("mocksubmit")).click();
	    driver.switchTo().window(winHandleBefore);
	   
	    Thread.sleep(3000);
	    driver.navigate().refresh(); Thread.sleep(3000);
	    String c =driver.findElement(By.xpath("//*[@id=\"tab-NGN\"]/div[2]/strong[2]")).getText();
	    c = c.replaceAll("[^0-9.]", "");
	    float cc = Float.parseFloat(c);
	    
	    Assert.assertEquals(cc, sum);
	    
	    
	    driver.findElement(By.xpath("//a[@class='user-opener']")).click(); Thread.sleep(2000);
	    driver.findElement(By.linkText("Log Out")).click();  Thread.sleep(4000);
	    
	    driver.close();
	   
	  }
	  
		
	}




