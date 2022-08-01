package org.commons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonActions {
public static WebDriver w;
public static ChromeOptions o;
public static JavascriptExecutor js;
public static Actions a;
public static WebDriverWait ww;
public static File f;
public static FileOutputStream f1;
public static FileInputStream f2;
public static WebElement invalue;

public void launched() throws IOException {
	WebDriverManager.chromedriver().setup();
	w= new ChromeDriver();
	o= new ChromeOptions();
	js=(JavascriptExecutor)w;
	a= new Actions(w);
	ww= new WebDriverWait(w,20);
	f= new File(".\\src\\test\\resources\\hometheatre.xls");
	f1 = new FileOutputStream(f);
	f2= new FileInputStream(f);
	o.addArguments("start-maximized");
	w.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
}
public void closed() {
	w.close();
}
public void insertText(WebElement e, String text) {
	e.sendKeys(text);	
}
public void touch(WebElement e) {
	e.click();
}
public void movetoElement(WebElement e) {
	a.moveToElement(e).build().perform();
}
public void aTouch(WebElement e) {
	a.click(e).build().perform();
}
}
