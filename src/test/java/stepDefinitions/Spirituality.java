package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.Spirituality_object;
import utils.Testcontextsetup;

public class Spirituality {
	Testcontextsetup Testcontextsetup;
	Spirituality_object Spirituality_object ;
	public Spirituality(Testcontextsetup Testcontextsetup) {
        this.Testcontextsetup=Testcontextsetup;
		this.Spirituality_object =Testcontextsetup.PageObjectManager.GetSpirituality_object();
	}
	@Given("Verify user click on spirituality")
	public void verify_user_click_on_spirituality() {
		Spirituality_object.ClickonSprituality();
	}

	@When("Verify all module,submodule of spirituality and their child url")
	public void verify_all_module_submodule_of_spirituality_and_their_child_url() {
		Spirituality_object.Sprituality_module();
	}

}
