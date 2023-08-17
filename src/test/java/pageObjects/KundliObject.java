package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.TestBase;

public class KundliObject extends TestBase {
	public WebDriver driver;

	public KundliObject(WebDriver driver) {
    	this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='menu']/li[9]/a")
	private WebElement ClickonKundli;
	@FindBy(xpath="//*[@class='kundli_form_input']")
	private WebElement UserAddname;
	@FindBy(id ="UserGender")
	private WebElement SelectGender;
	@FindBy(id="Date")
	private WebElement SelectDate;
	@FindBy(id="Month")
	private WebElement SelectMonth;
	@FindBy(id="Year")
	private WebElement SelectYear;
	@FindBy(id="Kund_F_BirthPlace_Hour")
	private WebElement SelectHour;
	@FindBy(id="Kund_F_BirthPlace_Minute")
	private WebElement SelectMin;
	@FindBy(id="Kund_F_BirthPlace_AM")
	private WebElement SelectAM_Pm;
	@FindBy(id="Kund_BirthPlace")
	private WebElement SelectBirthplace;
	@FindBy(xpath="//*[@class='ui-menu-item-wrapper']")
	private WebElement SelectBirthplace1;
	@FindBy(id="kundli_submit")
	private WebElement ClickonSubmit;
	@FindBy(id="regexerror")
	private WebElement Geterrormessage;

	public void VerifyuseronKundlipage() {
		waitForElementToBeClickable(ClickonKundli, 20).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("kundli"));
	}
	public void Addname(int index) {
		waitForElementToBeVisible(UserAddname, 20).sendKeys(ReadGetDataFromJson("kundli", "name", index));
	}
	public void Selectgender() {
		waitForElementToBeVisible(SelectGender, 10);
		SelectByIndex(SelectGender, 0);
	}
	public void SelectDOB() {
		waitForElementToBeVisible(SelectDate, 10);
		SelectByIndex(SelectDate, 1);
		waitForElementToBeVisible(SelectMonth, 10);
		SelectByIndex(SelectMonth, 10);
		waitForElementToBeVisible(SelectYear, 3);
		SelectByIndex(SelectYear, 20);
	}
	public void SelectBirthtime() {
		waitForElementToBeVisible(SelectHour, 10);
		SelectByIndex(SelectHour, 5);
		waitForElementToBeVisible(SelectMin, 10);
		SelectByIndex(SelectMin, 2);
		waitForElementToBeVisible(SelectAM_Pm, 10);
		SelectByIndex(SelectAM_Pm, 0);
	}
	public void Selectbirthplace(int index) {
	
		waitForElementToBeVisible(SelectBirthplace, 20).sendKeys(ReadGetDataFromJson("kundli", "city", index));
		executionDelay(5);
		SelectBirthplace.sendKeys(Keys.BACK_SPACE);
		executionDelay(5);
		waitForElementToBeClickable(SelectBirthplace1, 20).click();
	}
	public void GetyourKundli() {
			waitForElementToBeClickable(ClickonSubmit, 20).click();
	}
	
	public void GetErrormessage() {
		String text=Geterrormessage.getText();
		try {
			System.out.println(text);
			Assert.assertTrue(text.contains("Name*"));
			System.out.println("We got error message "+text);
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}
}
