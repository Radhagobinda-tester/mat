package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkOut {

	@FindBy(xpath="//div[contains(text(),'Mini Biomat')]")
	 public WebElement text;



	public checkOut (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getText() {
		return text;
	}
	public WebElement getText1() {
		// TODO Auto-generated method stub
		return null;
	}
}
