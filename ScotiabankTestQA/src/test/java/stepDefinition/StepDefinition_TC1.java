package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_TC1 {
	WebDriver driver = new ChromeDriver();

	@Given("I access to SauceDemo page")
	public void i_access_to_sauce_demo_page() {
		
        driver.get("https://www.saucedemo.com");
        
//	   throw new io.cucumber.java.PendingException();
	}

	@When("I login with standard_user user")
	public void login_standard_user() {
	    if(driver.findElement(By.id("user-name")).isDisplayed()) {
	    	System.out.println("Username field found");
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
	        driver.findElement(By.id("login-button")).click();
	    }
	    
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("the page shown is inventory.html")
	public void page_shown_inventory() {
	    if(driver.getCurrentUrl().toString() == "https://www.saucedemo.com/inventory.html")
	    	System.out.println("Right landing page");
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("standard_user can select a product detail")
	public void select_product() {
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
        driver.findElement(By.id("add-to-cart")).click();
//	    throw new io.cucumber.java.PendingException();
	}


	@Then("standard_user can click on Cart button")
	public void standard_user_can_click_on_cart_button() {
		driver.findElement(By.className("shopping_cart_link")).click();
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("standard_user can click on Checkout button")
	public void standard_user_can_click_on_checkout_button() {
	    driver.findElement(By.id("checkout")).click();
//	    throw new io.cucumber.java.PendingException();
	}
	

	@Then("standard_user can fill First Name, Last Name and Zip\\/Postal code fields correctly")
	public void standard_user_can_fill_first_name_last_name_and_zip_postal_code_fields_correctly() {
	    driver.findElement(By.id("first-name")).sendKeys("John");
	    driver.findElement(By.id("last-name")).sendKeys("TEST"); 
	    driver.findElement(By.id("postal-code")).sendKeys("TEST"); 
	    driver.findElement(By.id("continue")).click();
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("standard_user can click on Finish button")
	public void standard_user_can_click_on_finish_button() {
	    driver.findElement(By.id("finish")).click();
//	    throw new io.cucumber.java.PendingException();
	}

	@Then("the page shows order confirmation page for the product selected")
	public void the_page_shows_order_confirmation_page_for_the_product_selected() {
		String message = driver.findElement(By.className("complete-header")).getText();
		System.out.println(message);
//		throw new io.cucumber.java.PendingException();
	}
}
