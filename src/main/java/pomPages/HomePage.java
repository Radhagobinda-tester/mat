package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="(//img[@name='cp_close_image-1'])[1]")
	 public WebElement close;


	@FindBy(xpath="//a[normalize-space(text())='Shop Products']")
	 public WebElement shop;

	@FindBy(xpath="(//a[@class='mega-menu-link'][normalize-space()='Mini Biomat'])[1]")
	 public WebElement minibio;

	@FindBy(xpath="(//a[contains(text(),'BioAcoustic Mat')])[3]")
	 public WebElement BioAcoustic ;


	public HomePage (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

	public void closeBtn() {

		close.click();
	}

	 public WebElement getShop() {
		return shop;
	}



	public void minibiomat() {

			minibio.click();
		}

	public void BioAcousticmat() {

		BioAcoustic.click();
	}
}
