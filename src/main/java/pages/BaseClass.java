package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public Properties prop;
	
	
	
@BeforeMethod
	public void ReadPrope() {
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\Deep\\eclipse-workspace\\qa\\src\\main\\java\\utilities\\prop.configuration");
			prop = new Properties ();
			prop.load(file);
			
		String s =	prop.getProperty("Browser");
		
		System.out.println(s);
			
		} 
	
		
		
		
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

				@Test

				public void OpenBrowser() {

					WebDriverManager.chromedriver().setup();
					
					WebDriver driver = new ChromeDriver ();
					
					driver.get(prop.getProperty("url"));
		}
}
