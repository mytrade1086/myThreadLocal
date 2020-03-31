package cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Absa {

	WebDriver driver;

	@Test
	public void methodOneAbsa() {
		System.out.print("Inside  methodOneAbsa " + Thread.currentThread().getId() + "---");
		TLclass1.setNum(4);
		System.out.print("Value has been set and currently it is " + TLclass1.getNum());
		System.out.println("");

	}

	@Test
	public void methodTwoAbsa() {
		System.out.print("Inside  methodTwoAbsa " + Thread.currentThread().getId() + "---");
		System.out.print("Value has not been set and currently it is " + TLclass1.getNum());
		System.out.println("");

	}

	@Test
	public void methodOneAbsaWebdriver() throws InterruptedException {
		System.out.print("Inside  methodOneAbsaWebdriver " + Thread.currentThread().getId() + "---");
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium_Server\\chromedriver.exe");

		driver = new ChromeDriver();

		TLclass1.setDr(driver);
		TLclass1.getDr().get("http://www.google.com");
		TLclass1.getDr().findElement(By.name("q")).sendKeys("Absa one");
		Thread.sleep(2000);
		TLclass1.getDr().quit();

		/*// if we use below driver, test would fail as driver is not thread safe
		 * driver.get("http://www.google.com");
		 * driver.findElement(By.name("q")).sendKeys("Absa one"); Thread.sleep(2000);
		 * driver.quit();
		 */
//		

	}

	@Test
	public void methodTwoAbsaWebdriver() throws InterruptedException {

		System.out.print("Inside  methodTwoAbsaWebdriver " + Thread.currentThread().getId() + "---");
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium_Server\\chromedriver.exe");
		driver = new ChromeDriver();

		TLclass1.setDr(driver);

		TLclass1.getDr().get("http://www.google.com");
		TLclass1.getDr().findElement(By.name("q")).sendKeys("Abse two");
		Thread.sleep(2000);

		TLclass1.getDr().quit();

		/*
		 * driver.get("http://www.google.com");
		 * driver.findElement(By.name("q")).sendKeys("Absa two"); Thread.sleep(2000);
		 * driver.quit();
		 */

	}

	@Test
	public void methodTwoAbsaWebdriver3() throws InterruptedException {

		System.out.print("Inside  methodTwoAbsaWebdriver " + Thread.currentThread().getId() + "---");
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium_Server\\chromedriver.exe");
		driver = new ChromeDriver();

		TLclass1.setDr(driver);

		TLclass1.getDr().get("http://www.google.com");
		TLclass1.getDr().findElement(By.name("q")).sendKeys("Abse 3");
		Thread.sleep(2000);

		TLclass1.getDr().quit();

	}

	@Test
	public void methodTwoAbsaWebdriver4() throws InterruptedException {

		System.out.print("Inside  methodTwoAbsaWebdriver " + Thread.currentThread().getId() + "---");
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium_Server\\chromedriver.exe");
		driver = new ChromeDriver();

		TLclass1.setDr(driver);

		TLclass1.getDr().get("http://www.google.com");
		TLclass1.getDr().findElement(By.name("q")).sendKeys("Abse 4");
		Thread.sleep(2000);

		TLclass1.getDr().quit();

	}
}