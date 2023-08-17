package stepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.LoginObject;
import utils.Testcontextsetup;

public class Loginpage  {
	Testcontextsetup Testcontextsetup;
    LoginObject LoginObject ;
	public Loginpage(Testcontextsetup Testcontextsetup) {
        this.Testcontextsetup=Testcontextsetup;
		this.LoginObject =Testcontextsetup.PageObjectManager.getLoginpage();
	}
	
	    @Given("verify user enters on sign in button")
	    public void verify_user_enter_on_sign_in_button() {
		    LoginObject.Clickonsigninbutton();
	     }
		@When("mobile number is enters {string}")
		public void mobile_number_is_entered(String string) {
			LoginObject.Entermobilenumber(string);
		}

		@When("clicks on submit button")
		public void click_on_submit_button() {
			LoginObject.Clickonsubmitbutton();
		}

		@Then("clicks on verify OTP button")
		public void clicks_on_verify_otp_button() throws InterruptedException {
			LoginObject.Clickonverifyotp();
		}
		@Then("Verify user Logined Successfully")
		public void Verify_user_Logined_Successfully() {
			LoginObject.VerifyuserLogined ();
		}

}