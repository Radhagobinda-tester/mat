package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class bioacoustic_mat {

    @FindBy(id="pa_bioacoustic-mat")
    public WebElement dd1;

    @FindBy(xpath="(//option[contains(text(),'Choose an option')])[2]")
    public WebElement dd2;

    @FindBy(xpath="//option[contains(text(),'$1850 BioAcoustic Mat (massage table size)')]")
    public WebElement option1;

    @FindBy(xpath="//option[contains(text(),'Yes')]")
    public WebElement yes;

    @FindBy(xpath="//span[contains(text(),'Drag or click here to add a file')]")
    public WebElement upload;

    public bioacoustic_mat(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getDd2() {
        return dd2;
    }
    public void yesBtn() {
    	yes.click();
    }

    public void selectProduct1() {
        Select dropdown = new Select(dd1);
        dropdown.selectByVisibleText("$1850 BioAcoustic Mat (massage table size)");
    }

    public void uploadBtn()  {
        upload.click();
       
    }
    
   
}

