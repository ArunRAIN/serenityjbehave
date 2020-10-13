package com.serenitybddjbehave.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.gov.uk/check-uk-visa/y")
public class CountryListPage extends PageObject
{
	@FindBy(xpath="//a[contains(text(),'Start now')]")
    private WebElementFacade startNow_link;

	@FindBy(id="response")
    private WebElementFacade nationality_dropdown;

	
	@FindBy(xpath="//button[contains(text(),'Next step')]")
    private WebElementFacade nextstep_button;

	
	public void click_to_start()
	{
		try
		{
			waitABit(4000);
			startNow_link.click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void choose_nationality(String option)
	{
		try
		{
			int count=getDriver().findElements(By.xpath("//select[@id='response']/option")).size();
			for(int i=0;i<count;i++)
			{
				String option2=getDriver().findElements(By.xpath("//select[@id='response']/option")).get(i).getText();
				
				if(option.equals(option2))
				{
					Select s =new Select(nationality_dropdown);
					s.selectByVisibleText(option2);
					waitABit(2000);
					nextstep_button.click();
					break;
				}
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void select_the_reason(String option)
	{
			try
			{
				waitABit(3000);
				getDriver().findElement(By.xpath("//label[contains(text(),'"+option+"')]/../input")).click();
				
				waitABit(3000);
				nextstep_button.click();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
    }
	
	public void select_the_reason_as(String option)
	{
			try
			{
				waitABit(3000);
				getDriver().findElement(By.xpath("//label[contains(text(),'"+option+"')]/../input")).click();

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
    }
	
	public void state_that_family_or_partner()
	{
		try
		{
			waitABit(3000);
			getDriver().findElement(By.xpath("//label[contains(text(),'No')]/../input")).click();

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public void state_of_intending(String option)
	{
			try
			{
				waitABit(3000);
				getDriver().findElement(By.xpath("//label[contains(text(),'longer than 6 months')]/../input")).click();
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
    }

	public void submit()
	{
		try
		{
			waitABit(3000);
			nextstep_button.click();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void check_the_notification_msg(String actualText)
	{
		try
		{
			String text = getDriver().findElement(By.xpath("//h2[contains(text(),'"+actualText+"')]")).getText();
			if(text.contains(actualText))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void check_the_notification_msg2(String actualText)
	{
		try
		{
			String text = getDriver().findElement(By.xpath("//h2[contains(text(),'"+actualText+"')]")).getText();
			if(text.contains(actualText))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
