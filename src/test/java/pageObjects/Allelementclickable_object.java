package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;

public class Allelementclickable_object extends TestBase {
	public WebDriver driver;

	public Allelementclickable_object(WebDriver driver) {
    	this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()='और पढ़ें']")
	private List<WebElement> Allelementclickable;
	
	public void Allelementclickable() {
		System.out.println(Allelementclickable.size());

		for(int i=0;i<=Allelementclickable.size()-1;i++) {
			waitForElementToBeVisible1(Allelementclickable, driver, 10);
			System.out.println(Allelementclickable.get(i).getText());
			Allelementclickable.get(i).click();
			System.out.println(driver.getCurrentUrl());
			executionDelay(2);
			driver.navigate().back();
			
		}
	}
}
