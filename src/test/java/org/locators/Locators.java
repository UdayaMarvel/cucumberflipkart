package org.locators;

import java.util.List;

import org.commons.CommonActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Locators extends CommonActions{

	public Locators() {
		PageFactory.initElements(CommonActions.w, this);
	}
	
	public WebElement getUsern() {
		return usern;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getCloselog() {
		return closelog;
	}
	public WebElement getElec() {
		return elec;
	}
	public WebElement getElect() {
		return elect;
	}
	public WebElement getRealme() {
		return realme;
	}
	public WebElement getHometheatres() {
		return hometheatres;
	}
	

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement usern;
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submit;
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closelog;
	@FindBy(xpath="(//div[@class='xtXmba'])[3]")
	private WebElement elec;
	@FindBy(xpath="//span[text()='Electronics']")
	private WebElement elect;
	@FindBy(xpath="//a[text()='Realme']")
	private WebElement realme;
	@FindBy(xpath="//a[text()='Home Theatres']")
	private WebElement hometheatres;
	@FindBy(xpath="//a[@class='s1Q9rs']")
	private  List<WebElement> hometheatres1;
	public List<WebElement> getHometheatres1() {
		return hometheatres1;
	}
	
	
	

}
