package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;

public class Validatealldate_in_hindi_object extends TestBase {
	public WebDriver driver;

	public Validatealldate_in_hindi_object(WebDriver driver) {
    		this.driver=driver;
    PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='dropbtn']")
	private WebElement ClickOnHover;
	@FindBy(xpath="//*[text()='हिंदी' or text()='Hin']")
	private WebElement ClickOnHindi;
	@FindBy(xpath="//*[@title='राशिफल' or @title='Horoscope']")
	private WebElement ClickOnRashifal;
	@FindBy(xpath="//*[text()='No thanks']")
	private WebElement ClickonNothanks;
	@FindBy(xpath="//*[@class='thumbnail_three_box position_relative']")
	private List<WebElement> ValidateAllcontentinhindi;
	@FindBy(xpath="//*[@class='thumbnail_three_box position_relative horoscope_395']")
	private List<WebElement> ValidateAllcontentinhindi2;
	public void ClickOnHindi() {
		waitForElementToBeVisible(ClickOnHover, 10);
		mousehower(ClickOnHover);
		waitForElementToBeClickable(ClickOnHindi, 10).click();
	}
//	public void Clickonnothank() {
//		if(!ClickonNothanks.isDisplayed()) {
//			
//		}
//		else {
//			waitForElementToBeClickable(ClickonNothanks, 10).click();
//		}
//		
//	}
	public void ClickOnRashifal() {
		waitForElementToBeClickable(ClickOnRashifal, 10).click();
	}
	public void ValidateAllcontentinhindi() {
		String text1 = null;
		String text2=null;
		String ch2=null;
		String ch3=null;
		for(int i=0;i<ValidateAllcontentinhindi.size();i++) {
			text1=text2=ValidateAllcontentinhindi.get(i).getText();
			System.out.println(ValidateAllcontentinhindi.get(i).getText());
		}
	    for(int i=0;i<ValidateAllcontentinhindi2.size();i++) {
	    	ValidateAllcontentinhindi2.get(i).getText();
			System.out.println(ValidateAllcontentinhindi2.get(i).getText());
	    }
		for (int i=97,j=65;i<=122 &&j<=90 ;i++,j++) {
		    char ch=(char) i;
		    char ch1=(char) j;
		     ch2=String.valueOf(ch);
		    ch3=String.valueOf(ch1);

		}
		if(text1.contains(ch2) && text1.contains(text2)&&text2.contains(ch3) &&text2.contains(ch3)) {
			System.out.println("not in hindi");
		}
		else{
			System.out.println("all the data in hindi");
		}
	}
	
	
}
