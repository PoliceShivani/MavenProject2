package TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
import Page.LoginPage;
 

public class Login_Testcase {


		@Test
		public static void main(String[] args) {
			WebDriver driver =new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			LoginPage lg = new LoginPage(driver);
			lg.enterUsername("vasuvespag");
			LoginPage pass = new LoginPage(driver);
		    pass.enterpassword("vasu1234");
		    LoginPage login = new LoginPage(driver);
		    login.clicklogin();
		    LoginPage loc = new LoginPage(driver);
		    login.location();
	}

	}


