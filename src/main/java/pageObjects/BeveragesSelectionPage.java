package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//This Class handles BeveragesSelectionPage in our Application, so we will have in this class "the webelements on that page we are going to 
//work with and their methods"
public class BeveragesSelectionPage {
	public WebDriver driver;
	public BeveragesSelectionPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//img[@class='img-responsive blur-up lazyautosizes lazyloaded']")
	WebElement productOne;
	@FindBy(xpath = "//h1[@class='GrE04']")
	WebElement productOneDescription;
	@FindBy(xpath = "//a[@class='_2zLWN _3bj9B rippleEffect']")
	WebElement productOneBrand;
	@FindBy(xpath = "//h1[@class='GrE04']")
	WebElement productTwoDescription;
	@FindBy(xpath = "//a[@class='_2zLWN _3bj9B rippleEffect']")
	WebElement productTwoBrand;
	
	public WebElement productOne() {
		return productOne;	
    }
	public WebElement productOneDescription() {
		return productOneDescription;	
    }
	public WebElement productOneBrand() {
		return productOneBrand;	
    }
	public WebElement productTwoDescription() {
		return productTwoDescription;	
    }
	public WebElement productTwoBrand() {
		return productTwoBrand;	
    }
}
