package com.qa.hs.keyword.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init_driver(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers_Selenium\\chromedriver\\chromedriver.exe");
			
			if(prop.getProperty("headless").equals("yes"))
			{
				//headles mode
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				driver = new ChromeDriver(options);
			}
			else {
				
				driver  = new ChromeDriver();
			}
		}
		return driver;
	}
	
	public  Properties init_properties() throws Exception
	{
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\ny_al\\eclipse-workspace1\\KeywordDriven1\\src\\main\\java\\com\\qa\\hs\\keyword\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return prop;
	}

}
