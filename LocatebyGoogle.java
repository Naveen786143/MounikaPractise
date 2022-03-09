package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatebyGoogle {

	public static void main(String[] args) {
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver","C:\\seleniumChromedriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			List<WebElement> childLinks = driver.findElements(By.xpath("//div[@class=\"cell topicons\"]/child::a"));
			for(WebElement W : childLinks);
				System.out.println(W.getText());
		

	}

}
