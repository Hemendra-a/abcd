package stepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.panchang_object;
import utils.Testcontextsetup;

public class panchang {
	Testcontextsetup Testcontextsetup;
	panchang_object panchang_object ;
	public panchang(Testcontextsetup Testcontextsetup) {
        this.Testcontextsetup=Testcontextsetup;
		this.panchang_object =Testcontextsetup.PageObjectManager.Getpanchang_object();
	}
	@Given("Verify user click on Panchang")
	public void verify_user_click_on_panchang() {
		panchang_object.ClickonPanchang();
	}
	@When("Verify user click on Ajj ka Panchang")
	public void verify_user_click_on_ajj_ka_panchang() {
		panchang_object.Clickon_aaj_ka_panchang();
//		panchang_object.ClickonNakshatra();
//		panchang_object.Clickonvaarpan();
		panchang_object.ClickOnrashi();
	}
	@And("Verify user click on Festival_image")
	public void verify_user_click_on_festival_image() {
		panchang_object.ClickonFeast_and_Festival();
	}
	@When("Verify user click on Allpanchang")
	public void verify_user_click_on_Allpanchang() {
		panchang_object.ClickonAllPanchang();
	}
	@When("Verify Viewmore all button should be clickable")
	public void verify_viewmore_all_button_should_be_clickable() {
		panchang_object.ClickonViewmore();
	}
}
