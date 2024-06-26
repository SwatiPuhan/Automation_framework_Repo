package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility {
public void doubleclick(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.doubleClick(element).perform();
	}

public void clickandhold(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.clickAndHold(element).perform();
	}


public void draganddrop(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.dragAndDrop(element,element).perform();
	}






public WebDriver switchToframe(WebDriver driver,int index) {
	return driver.switchTo().frame(index);
	}

public WebDriver switchToframe(WebDriver driver,String nameorId) {
	return driver.switchTo().frame(nameorId);
	}	
	
}

