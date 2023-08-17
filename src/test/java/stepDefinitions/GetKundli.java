package stepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.KundliObject;
import utils.Testcontextsetup;

public class GetKundli {
	Testcontextsetup Testcontextsetup;
	KundliObject KundliObject ;
	public GetKundli (Testcontextsetup Testcontextsetup) {
        this.Testcontextsetup=Testcontextsetup;
		this.KundliObject =Testcontextsetup.PageObjectManager.GetKundliObject();
	}
	@Given("Verify user on Kundli Page")
	public void verify_user_on_kundli_page() {
		KundliObject.VerifyuseronKundlipage();
	}


    @Given("Verify user add name {int}")
    public void verify_user_add_name(Integer int1) {
    	KundliObject.Addname(int1);
    }

	@When("Verify user select Gender")
	public void verify_user_select_gender() {
		KundliObject.Selectgender();
	}

	@When("Verify user select Date of birth")
	public void verify_user_select_date_of_birth() {
		KundliObject.SelectDOB();
	}

	@Then("Verify user select birth time")
	public void verify_user_select_birth_time() {
		KundliObject.SelectBirthtime();
	}

	@Given("Verify user birth place {int}")
	public void verify_user_birth_place(Integer int1) {
		KundliObject.Selectbirthplace(int1);
	}

	@Then("Verify user click on Get your Kundli")
	public void verify_user_click_on_get_your_kundli() {
		KundliObject.GetyourKundli();
	}
	@Given("verify user get error message")
	public void verify_user_get_error_message() {
		KundliObject.GetErrormessage();
	}
}
