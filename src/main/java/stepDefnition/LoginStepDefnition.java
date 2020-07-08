package stepDefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefnition {
	
	WebDriver driver;

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
	   
		System.setProperty("webdriver.chrome.driver", "C:/Users/ENTERPRISE TOUCH/workspace/ot-web-automation/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@When("^title of login page is Facebook$")
	public void title_of_login_page_is_Facebook() throws InterruptedException{
		String title = driver.getTitle();
		
		System.out.println(title);
		//Assert.assertEquals("Facebook – log in or sign up", title);
		
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.cssSelector("input#email")).sendKeys("ramki001@gmail.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("ramki$123");
	}

	@Then("^user enters login button$")
	public void user_enters_login_button() throws InterruptedException {    
		Thread.sleep(2000);
		WebElement loginBtn = driver.findElement(By.cssSelector("input#u_0_b"));
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", loginBtn);
	}

	@And("^user is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		
		System.out.println(title);
		//Assert.assertEquals("Facebook", title);		
		driver.close();
	}
}
