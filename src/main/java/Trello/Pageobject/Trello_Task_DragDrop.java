package Trello.Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Trello.BaseClass.BaseClass;

public class Trello_Task_DragDrop extends BaseClass{

	public Trello_Task_DragDrop() {
		PageFactory.initElements(driver,this);
	}
	  //2.
	  
	  @FindBy(xpath ="//span[@class=\"list-card-title js-card-name\"]")
	  public WebElement LocListA;
	
	  @FindBy(xpath = "(//div[@class=\"list-header-target js-editing-target\"])[5]")
	  public WebElement LocListB;
	  
	  @FindBy(xpath= "//span[text()=\"Task_DD\"]")
	  public WebElement XYCor;
	
}
