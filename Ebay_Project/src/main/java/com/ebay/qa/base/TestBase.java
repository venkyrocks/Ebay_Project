package com.ebay.qa.base;

import java.io.FileInputStream;
import java.util.EventListener;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.ebay.qa.utils.WebEventListener;

public class TestBase 
{
	public static Properties pro;
	public static WebDriver driver;
	
	static EventFiringWebDriver e_driver;
	static WebEventListener eventListener;
	
	public TestBase()
	{
		try {
				pro=new Properties();
				FileInputStream f= new FileInputStream("E:\\eclipse-jee-oxygen-3a-win32-x86_64\\Maven_Project\\Ebay_Project_Hybrid\\src\\main\\java\\com\\ebay\\qa\\config\\config.properties");
				pro.load(f);
			} 
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
	}
	
	public static void initialization()
	{
		String browsername=pro.getProperty("browser");
		
		if(browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver-v0.11.1-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\eclipse-jee-oxygen-3a-win32-x86_64\\soft\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
			e_driver=new EventFiringWebDriver(driver);
			eventListener=new WebEventListener();
			e_driver.register(eventListener);
			driver=e_driver;
			
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get(pro.getProperty("url"));
		
    }
}