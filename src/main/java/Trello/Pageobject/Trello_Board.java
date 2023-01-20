package Trello.Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Trello.BaseClass.BaseClass;

public class Trello_Board  extends BaseClass{

	//1
	public Trello_Board() {
		PageFactory.initElements(driver, this);
	}
	
	//2.  Create the Board
	
	@FindBy(xpath = "//p[@class=\"uJFM1WfH-EGEiT\"]")
	WebElement Create;
	
	@FindBy(xpath = "(//button[@class=\"R2Zt2qKgQJtkYY\"])[1]")
	WebElement NewCreate;
	
	@FindBy(xpath = "//input[@class=\"nch-textfield__input Hj0IB7nx8rs7UO Hj0IB7nx8rs7UO ysTE7s-UXRkpYP\"]")
	WebElement Name;
	
	@FindBy(xpath = "//button[@class=\"G2lWjDVJsvar3H Ts+YceGnvTbKoG HPCwi137Em5EYI JIXQq8gDYY04N6\"]")
	WebElement CreateClick;
	
	// Creation of List A
	
	@FindBy(xpath = "//span[@class=\"placeholder\"]")
	WebElement AddList ;
	
	@FindBy(xpath = "//input[@class=\"list-name-input\"]")
	WebElement ListA ;
	
	@FindBy(xpath = "//input[@class=\"nch-button nch-button--primary mod-list-add-button js-save-edit\"]")
	WebElement CreateListA;
	
	
	// Creation of List B
	
	@FindBy(xpath = "//input[@class=\"list-name-input\"]")
	WebElement ListB ;
	
	@FindBy(xpath = "//input[@class=\"nch-button nch-button--primary mod-list-add-button js-save-edit\"]")
	WebElement CreateListB;
	
	// exit list 
	@FindBy(xpath = "//a[@class=\"icon-lg icon-close dark-hover js-cancel-edit\"]" )
	WebElement ExitList ;
	
	
	
	//2.  Create the Board
	
	public void Creat() {
		Create.click();
	}
	
	public void NewCreat() {
		NewCreate.click();
	}
	
	public void NameBoard(String Trello) {
		Name.sendKeys(Trello);
	}
	
	public void CreatClick() {
		CreateClick.click();
	}
	
	// Creation of List A method
	
	public void AddList() {
		AddList.click();
	}
	
	public void ListA(String listA) {
		ListA.sendKeys(listA);
	}
	
	public void ClickListA() {
		CreateListA.click();
	}
	
	// Creation of List B method
	
	public void ListB (String listB) {
		ListB.sendKeys(listB);
	}
	
	public void ClickListB() {
		CreateListB.click();
	}
		
	// Exit list Method
	
	public void ExitList() {
		ExitList.click();
}
}