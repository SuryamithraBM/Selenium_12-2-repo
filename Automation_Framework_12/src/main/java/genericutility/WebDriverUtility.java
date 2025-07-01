package genericutility;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v129.performance.Performance;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
/**
 * @author dell
 */
public class WebDriverUtility {
	/**
	 * This method is used to maximize the window
	 * @param driver
	 */
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	private void mouseHover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * 
	 * @param driver
	 * @param source
	 * @param target
	 */
	private void dragAnddrop(WebDriver driver, WebElement source, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source,target).perform();
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	private void clickAndhold(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).perform();;
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	private void rightClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();;
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	private void doubleClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element);
	}
	/**
	 * 
	 * @param element
	 * @param index
	 */
	private void selectByIndex(WebElement element, int index) {
		Select ref = new Select(element);
		ref.selectByIndex(index);
	}
	/**
	 * 
	 * @param element
	 * @param value
	 */
	private void selectByValue(WebElement element, String value) {
		Select ref = new Select(element);
		ref.selectByValue(value);
	}
	/**
	 * 
	 * @param element
	 * @param text
	 */
	private void selectByVisibleText(WebElement element, String text) {
		Select ref = new Select(element);
		ref.selectByVisibleText(text);
	}
	/**
	 * 
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * 
	 * @param driver
	 * @param nameOrId
	 */
	public void SwitchToFrame(WebDriver driver,String nameOrId)
	{
		driver.switchTo().frame(nameOrId);
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	/**
	 * 
	 * @param driver
	 */
	public void switchBackToMainPa(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	/**
	 * 
	 * @param driver
	 * @return
	 */
	public Alert switchToAlert(WebDriver driver)
	{
		return driver.switchTo().alert();
	}
	/**
	 * 
	 * @param driver
	 * @param expUrl
	 */
	public void switchToWindow(WebDriver driver, String expUrl) {
		
		Set<String> allWindows = driver.getWindowHandles();
		for(String id : allWindows)
		{
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if(actUrl.contains(expUrl))
			{
				break;
			}
		}
	}
	/**
	 * 
	 * @param driver
	 * @throws IOException
	 */
	public void getPhoto(WebDriver driver) throws IOException {
		JavaUtility jUtil = new JavaUtility();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/" + jUtil.getSystemTime() + ".png");
		FileHandler.copy(temp, dest);
	}
	/**
	 * 
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void jsScroll(WebDriver driver, int x, int y)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(" + x + "," + y + ")");
	}
	private void jsScrollToElement(WebDriver driver, WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	}
}
