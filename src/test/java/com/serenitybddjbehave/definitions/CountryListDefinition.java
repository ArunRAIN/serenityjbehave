package com.serenitybddjbehave.definitions;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.serenitybddjbehave.steps.CountryListStepss;

import net.thucydides.core.annotations.Steps;

public class CountryListDefinition
{
	    @Steps
	    CountryListStepss Cuser;

	    @Given("I provide a nationality of '$option'")
		public void givenIProvideANationalityOfJapan(String option)
		{
	    	Cuser.start();
	    	Cuser.choose_Nationality(option);
		
		}
	    
	    
	    @When("I select the reason '$option'")
	    public void whenISelectTheReasonStudy(String option)
	    {
	   
            Cuser.select_the_reasons(option);
	    }
	    
	    @When("I select the reason as '$option'")
	    public void whenISelectTheReasonAsTourism(String option)
	    {
	    	Cuser.select_the_reasons_As(option);
	    }
	    
	    @When("I state I am intending to stay for more than '$option")
	    public void whenIStateIAmIntendingToStayForMoreThan6Months(String option)
	    {
	    	Cuser.state_of_intending_to_stay(option);
	    
	    }
	    @When("I state I am not travelling or visiting a partner or family")
	    public void whenIStateIAmNotTravellingOrVisitingAPartnerOrFamily() 
	    {
	    	Cuser.state_that_familymemeber_or_partner();
	    }
	    
	    @When("I submit the form")
	    public void whenISubmitTheForm()
	    {
	    	Cuser.submit_form();
	    
	    }
	    
	    @Then("I will be informed I '$option' in the UK")
	    public void thenIWillBeInformedInotNeedAVisaInTheUK(String option)
	    {
	    	Cuser.check_the_notification(option);
	    }
	    
	    
	    

}
