package StepDefinitions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class GoogleSearchStep {

	WebDriver driver = null;
	
	@Before
	public void Browser_Initialization_Block() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();  
		driver.manage().window().maximize();
		System.out.println("Browser is initialised");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	}
	
	@BeforeStep
	public void BefoteStep() {
		
		System.out.println("This is before step");
	
		
		
	}

	
	@Given("Browser is open")
	public void browser_is_open() {
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	}

	@And("Open a Google Search Engine")
	public void open_a_Google_Search_Engine() throws InterruptedException {
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
	}

	@When("^User enters the (.*) to be Searched$")
	public void user_enters_the_Text_to_be_Searched(String strtext) throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(strtext);
		Thread.sleep(5000);
		
	}

	@And("User clicks on Search button")
	public void user_clicks_on_Search_button() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
	}

	@Then("^User Successfully navigate to(.*)$")
	public void user_Successfully_navigate_to(String strtext) {
		String tigerSearchText = driver.findElement(By.xpath("//*[@id='rso']//a/h3[contains(text(),'"+strtext+"')]")).getText();
		if(tigerSearchText.contains(strtext))
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		
		
	}
	
	@After
	public void Browser_Quit_Block() {
		
		driver.quit();
		System.out.println("Browser is closed");
		
		
	}
	@AfterStep
	public void Afterstep() {
		
		
		System.out.println("This is after step");
		
		
	}

}
