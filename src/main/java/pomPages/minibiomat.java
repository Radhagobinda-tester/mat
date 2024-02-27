package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class minibiomat {
	@FindBy(id="pa_mini-biomat")
	 public WebElement dd;

	@FindBy(id="plus_qty")
	 public WebElement positive;

	@FindBy(xpath="//option[contains(text(),'$780 Biomat Mini (220 volt) INTERNATIONAL')]")
	 public WebElement product;
	@FindBy(id="minus_qty")
	 public WebElement negative;

	@FindBy(id="quantity_65d71dda0973b")
	 public WebElement qty;
	@FindBy(xpath="(//button[normalize-space(text()='                                 Add to cart')])[2]")
	 public WebElement cart;
	@FindBy(xpath="(//span[contains(text(),'Checkout')])[1]")
	 public WebElement checkout;

	public minibiomat (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getDd() {
		return dd;
	}

	public void selectProduct() {
        Select dropdown = new Select(dd);
        dropdown.selectByVisibleText("$780 Biomat Mini (220 volt) INTERNATIONAL");
    }

	public void positiveBtn() {
		positive.click();
	}
    public void negativeBtn() {
    	negative.click();
	}

    public void qtyField() {
    	qty.clear();
    	qty.sendKeys("2");
	}
    public void addToCartBTN() {

    	cart.click();
    	}
public void checkoutBTN() {

	checkout.click();
    	}
}
