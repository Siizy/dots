import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownValue {
	
	@Test
	public void selectValuefromDD() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");		
		WebElement dd =driver.findElement(By.name("country"));
		
		Select country = new Select(dd);
		country.selectByIndex(1);
		country.selectByValue("ANTARCTICA");
		country.selectByVisibleText("AUSTRIA");		
	}

}
