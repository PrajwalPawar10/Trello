package Trello.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Trello.BaseClass.BaseClass;

public class Trello_LoginPage extends BaseClass{

	
  //1.
  public Trello_LoginPage() {
	  
	  PageFactory.initElements(driver,this);
  }
  
  //2.
  @FindBy(xpath = "//input[@id=\"user\"]")
  public WebElement Username;
  
  @FindBy(xpath = "//input[@id=\"login\"]")
  public WebElement ConBtn;
  
  @FindBy(xpath = "//input[@id=\"password\"]")
  public WebElement Password;
  
  @FindBy(xpath = "//span[text()=\"Log in\"]")
  public WebElement LoginBtn;
  
  
  //3.
  public void Setusername(String Uname) {
	  Username.sendKeys(Uname);
  }
  
  public void ClickConbtn() {
	  ConBtn.click();
	  
  }
  
  public void SetPassword(String Pwd) {
	  
	  Password.sendKeys(Pwd);
  }
  
  
  public void Clickbtn() {
	  LoginBtn.click();
	  
  }
  
}
