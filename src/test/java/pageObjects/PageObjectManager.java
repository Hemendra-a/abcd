package pageObjects;

import org.openqa.selenium.WebDriver;


public class PageObjectManager {
	public LoginObject LoginObject;
    public KundliObject KundliObject;
    public Validatealldate_in_hindi_object Validatealldate_in_hindi_object;
	public Allelementclickable_object Allelementclickable_object;
	public panchang_object panchang_object;
	public Spirituality_object Spirituality_object;
	public WebDriver driver;
	public PageObjectManager (WebDriver driver) {
		this.driver=driver;
	}

	public LoginObject getLoginpage() {
		LoginObject =new LoginObject(driver);
		return LoginObject;
	}
	public KundliObject GetKundliObject() {
		KundliObject=new KundliObject(driver);
		return KundliObject;
	}
	public Validatealldate_in_hindi_object GetValidatealldate_in_hindi_object() {
		Validatealldate_in_hindi_object=new Validatealldate_in_hindi_object(driver) ;
			return Validatealldate_in_hindi_object;
		}
	public  Allelementclickable_object GetAllelementclickable_object() {
		Allelementclickable_object=new Allelementclickable_object(driver);
		return Allelementclickable_object;
	}
	public panchang_object Getpanchang_object() {
		panchang_object=new panchang_object(driver);
		return panchang_object;
	}
	public Spirituality_object GetSpirituality_object() {
		Spirituality_object=new Spirituality_object(driver);
		return Spirituality_object;
	}
	
}
