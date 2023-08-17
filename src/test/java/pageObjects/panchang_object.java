package pageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.TestBase;

public class panchang_object extends TestBase{
	public WebDriver driver;
	public panchang_object(WebDriver driver) {
    	this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()='पंचांग']")
	private WebElement ClickonPanchang;
	@FindBy(xpath="//*[@title='व्रत व् त्यौहार ']")
	private WebElement ClickonFestival;
	@FindBy(xpath="//*[@class='articleTile panchang_three_tile_img ']")
	private WebElement Clickaaj_ka_panchang;
	@FindBy(xpath="//*[@id='cityName']")
	private WebElement ClickOnCity;
	@FindBy(id ="YearModel")
	private WebElement Selectyear;
	@FindBy(id ="MonthModel")
	private WebElement SelectMonth;
	@FindBy(id ="DateModel")
	private WebElement Selectdate;
	@FindBy(id ="PanchangPlaceModel")
	private WebElement Selectlocation;
	@FindBy(xpath ="//*[@class='ui-menu-item-wrapper']")
	private WebElement Clicklocation;
	@FindBy(xpath ="//*[@id='PanchangPlaceModel']/following::div/button")
	private WebElement Clickonsubmit;
	
	@FindBy(id ="tithipan")
	private WebElement ClickonTithi;
	@FindBy(xpath="//*[@class='cls-moola-nakshatra-bottom-tile']")
	private List<WebElement> ClickonTithiSubmodule;
	@FindBy(id ="nakshatrapan")
	private WebElement ClickonNakshatra;
	@FindBy(xpath ="//*[@class='horoscope_light_btn']")
	private List<WebElement> Clickon_27_Nakshatra;
	@FindBy(id ="vaarpan")
	private WebElement Clickonvaarpan;
	@FindBy(xpath ="/html/body/div[7]/div[1]/div[4]/div[1]/div[3]/table[2]/tbody/tr[4]/td[2]/a/u")
	private WebElement Clickonrashi;
	@FindBy(xpath ="//*[@class='horoscope_zodiac_sing text-center']")
	private  List<WebElement> Clickonrashilist;
	@FindBy(xpath ="//*[@class='horoscope_light_btn']")
	private  List<WebElement> Clickonrashirelated;
	
	
	@FindBy(xpath="//*[@class='linktile explore_height240 pre-scrollable scrollable_2']/li")
	private List<WebElement> ClickonFeast_and_Festival;
	@FindBy(xpath="//*[@class='linktile explore_height240  pre-scrollable scrollable_2']/ul/li")
	private List<WebElement> ClickonAllPanchang;
	@FindBy(xpath="//*[text()=' और पढ़ें']")
	private List<WebElement> ClickonViewmore;
	
	public void ClickonPanchang() {
		waitForElementToBeClickable(ClickonPanchang, 10).click();
	}
	public void Clickon_aaj_ka_panchang() {
		waitForElementToBeClickable(Clickaaj_ka_panchang, 10).click();
		System.out.println(driver.getCurrentUrl());
		waitForElementToBeClickable(ClickOnCity, 10).click();
		SelectByvalue(Selectyear, "2023");
		SelectByIndex(SelectMonth, 5);
		SelectByIndex(Selectdate, 5);
		Selectlocation.clear();
		waitForElementToBeVisible(Selectlocation, 10).sendKeys("delhi,");
		executionDelay(5);
		Selectlocation.sendKeys(Keys.BACK_SPACE);
		waitForElementToBeClickable(Clicklocation, 10).click();
		waitForElementToBeClickable(Clickonsubmit, 10).click();
		executionDelay(2);
//		waitForElementToBeClickable(ClickonTithi, 10).click();
		executionDelay(3);
//		if(driver.getCurrentUrl().contains("tithi")) {
//		for(int i=0;i<ClickonTithiSubmodule.size();i++) {
//			ClickonTithiSubmodule.get(i).click();
//			System.out.println(driver.getCurrentUrl());
//			executionDelay(2);
//			driver.navigate().back();
//		}}


	}
	public void ClickonNakshatra() {
		waitForElementToBeClickable(ClickonNakshatra, 10).click();
	 if(driver.getCurrentUrl().contains("nakshatra")) {
		executionDelay(3);
		for(int i=0;i<Clickon_27_Nakshatra.size();i++) {
			Clickon_27_Nakshatra.get(i).click();
			System.out.println(driver.getCurrentUrl());
			executionDelay(2);
			driver.navigate().back();
		}
		
		for(int i=0;i<ClickonTithiSubmodule.size();i++) {
			ClickonTithiSubmodule.get(i).click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
		}
		driver.navigate().back();
		}
	}
	public void Clickonvaarpan() {
	     executionDelay(5);
		 waitForElementToBeClickable(Clickonvaarpan, 10).click();
		 if(driver.getCurrentUrl().contains("article")) {
				executionDelay(3);
				driver.navigate().back();//a lot of module take time	
		 }

	}
	public void ClickOnrashi() {
	     executionDelay(5);
		 waitForElementToBeClickable(Clickonrashi, 10);
		 Clickonrashi.click();
		 if(driver.getCurrentUrl().contains("rashi")) {
				executionDelay(3);
				for(int i=0;i<Clickonrashilist.size();i++) {
					Clickonrashilist.get(i).click();
					System.out.println(driver.getCurrentUrl());
					executionDelay(2);
					for(int j=0;j<Clickonrashirelated.size();j++) {
						Clickonrashirelated.get(j).click();
						System.out.println(driver.getCurrentUrl());
						executionDelay(2);
						driver.navigate().back();
					} 

				}

		 } 
	}
	public void ClickonFestival() {
		waitForElementToBeClickable(ClickonFestival, 10).click();
		System.out.println(driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().contains("festival"));
	}
	public void ClickonFeast_and_Festival() {
		System.out.println(ClickonFeast_and_Festival.size());
        try {
    		for(int i=0;i<=ClickonFeast_and_Festival.size()-1;i++) {
    			waitForElementToBeVisible1(ClickonFeast_and_Festival, driver, 10);
    			System.out.println(ClickonFeast_and_Festival.get(i).getText());
    			ClickonFeast_and_Festival.get(i).click();
    			System.out.println(driver.getCurrentUrl());
    			executionDelay(2);
    			driver.navigate().back();
    			
    		}
		} catch (Exception e) {
			
		}
	}
    public void ClickonAllPanchang() {
		System.out.println(ClickonAllPanchang.size());
        try {
    		for(int i=0;i<=ClickonAllPanchang.size()-1;i++) {
    			waitForElementToBeVisible1(ClickonAllPanchang, driver, 10);
    			System.out.println(ClickonAllPanchang.get(i).getText());
    			ClickonAllPanchang.get(i).click();
    			System.out.println(driver.getCurrentUrl());
    			executionDelay(2);
    			driver.navigate().back();
    			
    		}
		} catch (Exception e) {
			
		}
    }
    public void ClickonViewmore() {
		System.out.println(ClickonViewmore.size());
        try {
    		for(int i=0;i<=ClickonViewmore.size()-1;i++) {
    			waitForElementToBeVisible1(ClickonViewmore, driver, 10);
    			System.out.println(ClickonViewmore.get(i).getText());
    			ClickonViewmore.get(i).click();
    			System.out.println(driver.getCurrentUrl());
    			executionDelay(2);
    			driver.navigate().back();
    			
    		}
		} catch (Exception e) {
			
		}
    }
    }
