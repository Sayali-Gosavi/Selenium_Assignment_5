package Assignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertions_validate {
	
	WebDriver d;
	String url="http://openclinic.sourceforge.net/openclinic/home/index.php";


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
		//assert the title of webpage
		String expectedTitle="Welcome to OpenClinic";
		String actualResult = d.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();
		
		assertEquals(expectedTitle,actualResult);
	}

}
