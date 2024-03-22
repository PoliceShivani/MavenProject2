package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class SearchHotel {
	WebDriver  driver;
	By hloc = By.id("location");
	public SearchHotel(WebDriver driver) {
		this.driver = driver;
		}
	public void location() {
		WebElement location_dropdown = driver.findElement(hloc);
		Select loc_dropdown = new Select(location_dropdown);
		loc_dropdown.selectByVisibleText("London");
		}
	}
