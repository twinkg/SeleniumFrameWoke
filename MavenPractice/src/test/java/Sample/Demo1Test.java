package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Demo1Test {
	
	
	WebDriver driver=null;


	                 @Test
                     public void Test1()
                    {
	                  System.out.println("hi");
	                  System.out.println("selenium");
	               //WebDriver driver=new ChromeDriver();
	              //driver.get("https://www.flipkart.com/");
              /* 	String BROWSER = System.getProperty("browser");
	            String URL = System.getProperty("url");
	            String USERNAME = System.getProperty("username");
	            String PASSWORD = System.getProperty("password");
	            
	            
	            
	            if(BROWSER.equalsIgnoreCase("chrome"))
	           {
		        WebDriverManager.chromedriver().setup();
	            driver=new ChromeDriver();
	           }
	            else if(BROWSER.equalsIgnoreCase("firefox"))
	          {
	        	WebDriverManager.firefoxdriver().setup();
		        driver=new FirefoxDriver();
		      }
	           else if(BROWSER.equalsIgnoreCase("edge"))
	         {
	         	WebDriverManager.edgedriver().setup();
	            driver=new EdgeDriver();
	         }
	          else
	         {
		      driver=new ChromeDriver();
	         }
	           driver.get(URL);
	           driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	           driver.findElement(By.name("user_password")).sendKeys(PASSWORD);*/
     }
	                 

}


//pull back

