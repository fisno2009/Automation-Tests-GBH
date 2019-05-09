package gbhAutomationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccessGBH {

	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;

	public void invoqueBrowser(String url) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDemo\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void accessMainMenus() {
		try {
			invoqueBrowser("https://gbh.com.do/");
			Thread.sleep(5000);

			driver.navigate().refresh();

			Thread.sleep(5000);

			driver.findElement(By.xpath("/html/body/header/div[1]/nav/ul[2]/li[3]/a")).click();
			driver.findElement(By.xpath("/html/body/header/div[1]/nav/ul[2]/li[4]/a")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/header/div[1]/nav/ul[2]/li[5]/a")).click();
			driver.navigate().refresh();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/header/div[1]/nav/ul[2]/li[1]/a")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		AccessGBH myobj = new AccessGBH();
		myobj.accessMainMenus();
	}

}

// //*[@id='gbhsubscribe']/div/div/div[1]/button
