package PackLo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyTitle {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkumar32\\eclipse-workspace\\BlueColor\\Resources\\chromedriver_win32\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		
		String url = "http://softwaretestingmaterial.com";
		String actualtitle = "Software Testing Material - Free Software Testing Tutorials & Videos";
		String expectedtitle;
		
		cdriver.get(url);
		
		expectedtitle = cdriver.getTitle();
		
		if(actualtitle.contentEquals(expectedtitle))
		{
			System.out.println("Expected Title is" +expectedtitle);
			System.out.println("Expected Title is" +actualtitle);
			System.out.println("PASS");
		}
		else
		{
			System.out.println("Expected Title is" +expectedtitle);
			System.out.println("Expected Title is" +actualtitle);
			System.out.println("FAIL");
		}
		
		cdriver.close();
		
	}
}
