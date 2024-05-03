package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import base.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Browser{

	@Before
	public void setup() {
		System.out.println("before prt");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anishbansal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@After
	public void cleanUp() {
		driver.close();
	}
	
	

}
