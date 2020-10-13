package com.serenitybddjbehave.steps;



import com.serenitybddjbehave.pageobjects.CountryListPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CountryListStepss extends ScenarioSteps
{

	CountryListPage CLPage;
	
	
	@Step
	public void start() 
	{
	    CLPage.open();
	    getDriver().manage().window().maximize();
	}
	
	@Step
	public void click_to_start_button() 
	{
    	CLPage.click_to_start();
	}
	
    @Step
	public void choose_Nationality(String option) 
	{
    	CLPage.choose_nationality(option);
    	
	}
    
    @Step
	public void select_the_reasons(String option) 
	{
    	CLPage.select_the_reason(option);
	}
    
    @Step
	public void select_the_reasons_As(String option) 
	{
    	CLPage.select_the_reason_as(option);
	}
    
    @Step
	public void state_that_familymemeber_or_partner() 
	{
    	CLPage.state_that_family_or_partner();
	}
    
    
    @Step
   	public void state_of_intending_to_stay(String option) 
   	{
       	CLPage.state_of_intending(option);
   	}
    
    @Step
   	public void submit_form() 
   	{
       	CLPage.submit();
   	}
    
    
    @Step
   	public void check_the_notification(String option) 
   	{
       	CLPage.check_the_notification_msg(option);
   	}
    
    
    
    
}
