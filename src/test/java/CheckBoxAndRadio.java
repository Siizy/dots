import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxAndRadio {
	
	@Test
	public void radioButtonClick() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement femaleCheckBox = driver.findElement(By.xpath("//label[.='Female']"));
				
		Thread.sleep(3000);
		femaleCheckBox.click();
		boolean isSelected = femaleCheckBox.isSelected();
		
		Assert.assertEquals(isSelected, true);		
	}
	
	//https://the-internet.herokuapp.com/checkboxes
	
	@Test
	public void checkBox1Click() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");		
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));		
		checkBox1.click();
		boolean isSelected = checkBox1.isSelected();		
		Assert.assertEquals(isSelected, true);	
		
	}
	
	@Test
	public void checkBox2Click() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");	
		WebElement checkBox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
		checkBox2.click();
		boolean isSelected = checkBox2.isSelected();
		
		Assert.assertEquals(isSelected, false);		
	}
		
}
