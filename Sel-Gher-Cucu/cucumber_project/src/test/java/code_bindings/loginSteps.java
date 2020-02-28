package code_bindings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When;

public class loginSteps {
	WebDriver driver = new ChromeDriver();
	
	@Given("^I have open the browser$")
    public void I_have_open_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rLizardo\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.facebook.com");
		String baseUrl = "https://www.openair.com/index.pl";
		driver.get(baseUrl); 
		Thread.sleep(3000);
		System.out.println("Testing :"+ baseUrl);

    }

	@Then("^Insert \\$(\\d+) , \\$(\\d+) and \\$(\\d+)$")
    public void Insert(int arg1,int arg2, int arg3) throws Throwable {
	
		WebElement company = driver.findElement(By.xpath("//input[@id='input_company']"));
	    //HighlightElement(driver, company);
		company.sendKeys("email@address.com");
		Thread.sleep(3000);  
		System.out.println("Mail Address :"+ company);
	    
	    WebElement userId = driver.findElement(By.xpath("//input[@id='input_user']"));
	   // HighlightElement(driver, userId);
	    userId.sendKeys("Idonnot_anything");  
	    System.out.println("User ID :"+ userId);
	    Thread.sleep(3000);
	}
	
	@And("^Click in login button$")
	public void Click_in_login(int arg1) throws Throwable{
		WebElement btn = driver.findElement(By.xpath("//button[@id='oa_comp_login_submit']"));
		btn.click();
	}
	
	@Then("^Close browser$")
	public void close_browser(int arg1) {
		 Thread.sleep(3000);
		    
			driver.quit();
			
	}
	
	
	
	
	
}
