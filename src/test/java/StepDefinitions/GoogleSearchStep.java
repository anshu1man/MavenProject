package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class GoogleSearchStep {

	WebDriver driver = null;

	
	@Given("Browser is open")
	public void browser_is_open() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();  
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	}

	@And("Open a Google Search Engine")
	public void open_a_Google_Search_Engine() {
		driver.get("https://www.google.com/");
		
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
		driver.quit();
		
	}

}
