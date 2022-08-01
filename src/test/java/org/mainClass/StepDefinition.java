package org.mainClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.commons.CommonActions;
import org.locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends CommonActions{
	CommonActions c = new CommonActions();
	Locators l = new Locators();
	@Given("Launch browser")
	public  void launch_browser() throws IOException {
		System.out.println("launched");
	}

	@Given("goto url {string}")
	public void goto_url(String url) {
		w.get(url);
	}

	@Then("enter username {string}")
	public void enter_username(String userid) {
		c.insertText(l.getUsern(), userid);
	}

	@Then("enter password {string}")
	public void enter_password(String passwrd) {
		c.insertText(l.getPass(), passwrd);
	}

	@When("click login button")
	public void click_login_button() {
		c.touch(l.getSubmit());
	}

	@When("close the login")
	public void close_the_login() throws InterruptedException {
		Thread.sleep(1000);
		c.touch(l.getCloselog());
	}

	@Then("move to electronics section")
	public void move_to_electronics_section() {
		c.aTouch(l.getElec());
	}

	@Then("click electronics")
	public void click_electronics() throws InterruptedException {
		Thread.sleep(2000);
		c.movetoElement(l.getElect());
	}

	@Then("use cursor to the one webelement")
	public void use_cursor_to_the_one_webelement() throws InterruptedException {
		Thread.sleep(2000);
		c.movetoElement(l.getRealme());
	}

	@When("click the webelement")
	public void click_the_webelement() throws InterruptedException {
		Thread.sleep(1000);
		c.touch(l.getHometheatres());
	}

	@When("take text of all clicked elements")
	public void take_text_of_all_clicked_elements() throws InterruptedException, IOException {
		Thread.sleep(2000);
		HSSFWorkbook h = new HSSFWorkbook();
		HSSFSheet wsh = h.createSheet("hometheatres");
		List<WebElement> hometheatres1 = l.getHometheatres1();
		for (int j = 0; j < hometheatres1.size(); j++) {
			HSSFRow wrow = wsh.createRow(j);
			HSSFCell wcell = wrow.createCell(0);
			WebElement hometheatre = hometheatres1.get(j);
			String names = hometheatre.getText();
			wcell.setCellValue(names);
			
		}
		h.write(CommonActions.f1);
		h.close();
		Thread.sleep(2000);
		@SuppressWarnings("resource")
		HSSFWorkbook h1 = new HSSFWorkbook(c.f2);
		HSSFSheet rsh = h1.getSheet("hometheatres");
		for (int i = 0; i <hometheatres1.size(); i++) {
			HSSFRow rrow = rsh.getRow(i);
			HSSFCell rcell = rrow.getCell(0);
			String values = rcell.getStringCellValue();
			System.out.println(values);	
		}	
	}
}
