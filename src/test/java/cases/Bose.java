package cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Bose {

	WebDriver driver;
	@Test
	public void methodOneBose() {
		System.out.print("Inside  methodOneBose "+Thread.currentThread().getId()+ "---");
		TLclass1.setNum(0);	
		System.out.print("Value has been set and currently it is "+TLclass1.getNum());
		System.out.println("");
	}
	
	
	@Test
	public void methodTwoBose() {	
		System.out.print("Inside  methodTwoBose "+Thread.currentThread().getId()+ "---");
		TLclass1.setNum(99);	
		System.out.print("Value has been set and currently it is "+TLclass1.getNum());
		System.out.println("");
	}
	
	
	@Test
	public void methodOneBoseWebdriver() throws InterruptedException {
		
		System.out.print("Inside  methodOneBoseWebdriver "+Thread.currentThread().getId()+ "---");
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium_Server\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		
		  TLclass1.setDr(driver); TLclass1.getDr().get("http://www.google.com");
		  TLclass1.getDr().findElement(By.name("q")).sendKeys("Bose 100");
		  Thread.sleep(2000); TLclass1.getDr().quit();
		 
		
//		
//		driver.get("http://www.google.com");
//		driver.findElement(By.name("q")).sendKeys("Bose 100");
//		Thread.sleep(2000);
//		driver.quit();
	}
	
	
	@Test
	public void methodTwoBoseWebdriver() throws InterruptedException {	
		System.out.print("Inside  methodTwoBoseWebdriver "+Thread.currentThread().getId()+ "---");
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium_Server\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		  TLclass1.setDr(driver); TLclass1.getDr().get("http://www.google.com");
		  TLclass1.getDr().findElement(By.name("q")).sendKeys("Bose 200");
		  Thread.sleep(2000); TLclass1.getDr().quit();
		 
		
		
			/*
			 * driver.get("http://www.google.com");
			 * driver.findElement(By.name("q")).sendKeys("Bose 200"); Thread.sleep(2000);
			 * driver.quit();
			 */
		
		
		
		
	}
	
	
	
	
	}
	
	
	

