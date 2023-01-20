package Trello.Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Trello.BaseClass.BaseClass;

public class Trello_Logout extends BaseClass{

	public Trello_Logout() {
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath = "//span[@class=\"p6oJr7SHjK+vLr aqePx81u4BGHTH Glb3QqRGpd64YB\"]")
		WebElement LogProfile;

    @FindBy(xpath = "//span[text()=\"Log out\"]")
		WebElement Logout;
  
    
	public void LogProfileClick() {
		LogProfile.click();
	}
	
	public void Logout() {
		Logout.click();
	}

}
