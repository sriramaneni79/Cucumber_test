package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	 WebDriver driver;
	
	
	@Given("^user is already on Login Page$")
	
 public void user_already_on_login_page() {
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://def-t.sgsprofield.com/");
		
		}
	
	@When("^title is login page of DEF$")
	
	public void title_of_login_page_is_DEF() {
		String tiltle = driver.getTitle();
		System.out.println(tiltle);
        Assert.assertEquals("ProField System Login", tiltle);
		
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password()  {
	   driver.findElement(By.name("loginEmail")).sendKeys("rgandhi@aclara.com");
	   driver.findElement(By.name("loginPassword")).sendKeys("1234");
	    
	}
	

@Then("^user clicks on login button$")
public void user_clicks_on_login_button()  {
	WebElement loginButton= driver.findElement(By.xpath("//*[@id=\"loginButton\"]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("//*[@id=\"loginButton\"]", loginButton);
	
}
	@Then("^user is on home page$")
	
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println("Home is title ::" + title);
		Assert.assertEquals("ProField Home Page", title);
	
		
	    
	}

}
    
	
	
	
	
	
	
	
	
	
	
	
	


