package Trello.Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Trello.BaseClass.BaseClass;

public class Trello_AddCard extends BaseClass {
	
	//1.
	  public Trello_AddCard() {
		  
		  PageFactory.initElements(driver,this);
	  }
	
	  //2.
	  
	  @FindBy(xpath = "(//span[@class=\"js-add-a-card\"])[4]")
		WebElement AddCard;
		
	  @FindBy(xpath = "//textarea[@class=\"list-card-composer-textarea js-card-title\"]")
		WebElement AddName ;

	  @FindBy(xpath = "//input[@class=\"nch-button nch-button--primary confirm mod-compact js-add-card\"]")
		WebElement AddCardTaskDD ;

	  @FindBy(xpath = "//a[@class=\"icon-lg icon-close dark-hover js-cancel\"]")
		WebElement ExitCard ;
	  
	  
	//2.  Create the Board
		
		public void AddClick() {
			AddCard.click();
		}
		
		
		public void AddName(String Task_DD) {
			AddName.sendKeys(Task_DD);
		}
		
		public void AddCardTaskDD() {
			AddCardTaskDD.click();
		}

		public void ExitCard() {
			ExitCard.click();
		}
}
