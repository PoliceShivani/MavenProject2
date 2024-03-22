package Page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	WebDriver  driver;
    By Uname=By.id("username");
    By Upassword=By.id("password");
    By Ulogin = By.id("login");


 
public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
public void enterUsername(String username) {
	driver.findElement(Uname).sendKeys(username);
}
public void enterpassword(String pass) {
	driver.findElement(Upassword).sendKeys(pass);
}
public void clicklogin() {
	driver.findElement(Ulogin).click();
	
 
}
public void location() {
	WebElement location_dropdown = driver.findElement(By.id("location"));
	Select loc_dropdown = new Select(location_dropdown);
	loc_dropdown.selectByVisibleText("Sydney");
	
}
System.out.println("Thank You");

}
