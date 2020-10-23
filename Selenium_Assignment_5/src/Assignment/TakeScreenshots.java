package Assignment;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshots {
	
	WebDriver d;
	String url="https://api.jquery.com/dblclick/";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
		d=new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		d.quit();
	}

	@Test
	public void test() {
//		taking screenshots
	try {
		File screenshot = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File demo = new File("E:\\Reskill\\SELENIUM\\Picture\\Pic.jpg");
		Files.copy(screenshot,demo);
	}catch (IOException e) {
		System.out.println("Message : "+e.getMessage());
	}
	}
}
		 

