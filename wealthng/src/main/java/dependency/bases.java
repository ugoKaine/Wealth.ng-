package dependency;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class bases {
	
	public WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public WebDriver initialize () throws IOException
	{
	
		ChromeOptions options = new ChromeOptions();
		
		Map<String, Object> prefs = new HashMap<String,  Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		
		options.setExperimentalOption("prefs", prefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		//"/Users/ugo.kaine/git/repository/wealthng/src/main/java/dependency/data.properties"
				
				Properties prop = new Properties ();
				FileInputStream fis = new FileInputStream ("//Users//ugo.kaine//git//repository//wealthng//src//main//java//dependency//data.properties");
				prop.load(fis);
				
				String browserName = prop.getProperty("browser");
				
				if (browserName.equals("chrome")) 
				{
					
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/driver/chromedriver") ;

					driver = new ChromeDriver(cap);
					
				}
				
				else if (browserName.equals("firefox")) 
				{
					
					//add browserv=firefox to data.properties file and download gecko driver and copy to the driver folder on the project here
					//write the commands to initialise firefox driver
					//add firefox maven driver dependency to pom.xml
				}
				
				else if (browserName.equals("internet explorer"))
				{
					
					//add browser=internet explorer to data.properties file and download ie driver and copy to the driver folder on the project here
					//write the commands to initialize internet explorer driver browser
					//add internet explorer maven driver dependency to pom.xml
						
					
				}
				
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				return driver;
				
			}

		
		
		
	}


