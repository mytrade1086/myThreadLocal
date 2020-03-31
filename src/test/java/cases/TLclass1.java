package cases;

import org.openqa.selenium.WebDriver;

public class TLclass1 {

	private static ThreadLocal<Integer> num = new ThreadLocal<Integer>();

	public static Integer getNum() {
		return num.get();
	}

	public static void setNum(Integer number) {
		num.set(number);

	}

	public static void setNum(ThreadLocal<Integer> num) {
		TLclass1.num = num;
	}

	private static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();

	public static WebDriver getDr() {
		return dr.get();
	}

	public static void setDr(WebDriver driver) {
		dr.set(driver);
	}

}
