
package stepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.Validatealldate_in_hindi_object;
import utils.Testcontextsetup;

public class Validatealldate_in_hindi {
	Testcontextsetup Testcontextsetup;
	Validatealldate_in_hindi_object Validatealldate_in_hindi_object ;
	public Validatealldate_in_hindi(Testcontextsetup Testcontextsetup) {
        this.Testcontextsetup=Testcontextsetup;
		this.Validatealldate_in_hindi_object =Testcontextsetup.PageObjectManager.GetValidatealldate_in_hindi_object();
	}
	@Given("Verify user click on Hindi")
	public void verify_user_click_on_hindi() {
		Validatealldate_in_hindi_object.ClickOnHindi();
//		Validatealldate_in_hindi_object.Clickonnothank();
	}

	@Given("Verify user click on Rashifal")
	public void verify_user_click_on_rashifal() {
		Validatealldate_in_hindi_object.ClickOnRashifal();
	}

	@When("Verify user validate all the content should be in hindi")
	public void verify_user_validate_all_the_content_should_be_in_hindi() {
		Validatealldate_in_hindi_object.ValidateAllcontentinhindi();
	}

}	
