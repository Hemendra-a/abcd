package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;

public class Spirituality_object extends TestBase {
	public WebDriver driver;

	public Spirituality_object(WebDriver driver) {
    		this.driver=driver;
    
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@title='आध्यात्मिकता']")
	private WebElement ClickonSprituality;
	@FindBy(xpath="//*[@class='ReadingTile']")
	private List<WebElement> Sprituality_module;
	@FindBy(xpath="//*[@class='thumbnail_3box']")
	private List<WebElement> Sprituality_Submodule1;
	@FindBy(xpath="//*[@id='Article_Read_More']")
	private List<WebElement> Sprituality_Submodule2;
	@FindBy(xpath="//*[@class='display-3 font18 font_400 article']/../ul/li")
	private List<WebElement> Sprituality_Submodule3;
	public void ClickonSprituality() {
		waitForElementToBeClickable(ClickonSprituality, 10).click();
	}
	public void Sprituality_module() {
		try {
			executionDelay(3);
			waitForElementToBeVisible1(Sprituality_module, driver, 20);
			for(int i=3;i<Sprituality_module.size();i++) {
				executionDelay(2);
				Sprituality_module.get(i).click();
				System.out.println(driver.getCurrentUrl());
				System.out.println("testtesttesttest");
				
				if(driver.getCurrentUrl().contains("katha")) {
					System.out.println("size"+Sprituality_Submodule2.size());
					for(int j=0;j<Sprituality_Submodule2.size();j++) {
//						Sprituality_Submodule3.get(j).click();
//						driver.navigate().back();
						Sprituality_Submodule2.get(j).click();
						System.out.println(driver.getCurrentUrl());
						driver.navigate().back();
					}
					driver.navigate().back();
				}
				else  {
					System.out.println(Sprituality_Submodule1.size());
					for(int j=0;j<Sprituality_Submodule1.size();j++) {
						executionDelay(2);
						Sprituality_Submodule1.get(j).click();
						System.out.println(driver.getCurrentUrl());
						driver.navigate().back();
					}
					driver.navigate().back();
				}

			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
