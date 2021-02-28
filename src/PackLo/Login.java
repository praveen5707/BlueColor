package PackLo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main (String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkumar32\\eclipse-workspace\\BlueColor\\Resources\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://thedemosite.co.uk/login.php");
		
		driver.findElement(By.name("username")).sendKeys("abc");
		
		
		driver.close();
	

}
}

