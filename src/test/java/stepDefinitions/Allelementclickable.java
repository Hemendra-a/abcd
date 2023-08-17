package stepDefinitions;

import io.cucumber.java.en.When;
import pageObjects.Allelementclickable_object;
import utils.Testcontextsetup;

public class Allelementclickable {
	Testcontextsetup Testcontextsetup;
	Allelementclickable_object Allelementclickable_object ;
	public Allelementclickable (Testcontextsetup Testcontextsetup) {
        this.Testcontextsetup=Testcontextsetup;
		this.Allelementclickable_object =Testcontextsetup.PageObjectManager.GetAllelementclickable_object();
	}
	@When("Verify All element should be clickable")
	public void verify_all_element_should_be_clickable() {
		Allelementclickable_object.Allelementclickable();
	}
}
