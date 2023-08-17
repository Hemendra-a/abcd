package pageObjects;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

import utils.TestBase;
   
    public  class LoginObject extends TestBase {
	public WebDriver driver;

	public LoginObject(WebDriver driver) {
    		this.driver=driver;
    
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='BtnLinkLoginHome']")
	private WebElement login;

	@FindBy(xpath="//*[@id=\'LoginPhoneNumber\']")
	private WebElement phonenumber;
	
	@FindBy(xpath="//*[@id='form-submit']")
	private WebElement submitbutton;
	
	@FindBy (xpath="//*[@id='btnverifyOTP']")
	private WebElement verifyOTP;
	
	
	public void Clickonsigninbutton(){
		login.isDisplayed();
		ReadGetDataFromJson(null, null, 0);
		waitForElementToBeClickable(login, 20).click();
		
	}
   public void Entermobilenumber(String mobileno) {
		phonenumber.sendKeys(mobileno);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	

	public void Clickonsubmitbutton() {
		submitbutton.isDisplayed(); 
		waitForElementToBeClickable(submitbutton, 10).click();
	   }
	public void Clickonverifyotp() throws InterruptedException {
		executionDelay(25);
		waitForElementToBeClickable(verifyOTP, 10).click();
      }
	public void VerifyuserLogined() {
		executionDelay(15);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("kundli"));
	   }
	

	}