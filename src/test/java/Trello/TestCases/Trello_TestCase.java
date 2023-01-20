package Trello.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Trello.BaseClass.BaseClass;
import Trello.Pageobject.Trello_AddCard;
import Trello.Pageobject.Trello_LoginPage;
import Trello.Pageobject.Trello_Logout;
import Trello.Pageobject.Trello_Task_DragDrop;

public class Trello_TestCase extends BaseClass {

	
	@Test(priority = 1)
	public void LoginTest() throws IOException, InterruptedException{
		//initialization();
		
	    logger.info("URL is open");
	    Trello_LoginPage LP = new Trello_LoginPage();

		LP.Setusername(username);
		logger.info("Enter username");

		LP.ClickConbtn();

		Thread.sleep(10000);
		
		LP.SetPassword(password);
		logger.info("Enter Password");

		LP.Clickbtn();
	}
		
	@Test(priority = 2)
	public void Trello_Board() throws IOException, InterruptedException{
		
		Trello.Pageobject.Trello_Board tb = new Trello.Pageobject.Trello_Board();
		
		tb.Creat();
		tb.NewCreat();
		tb.NameBoard("Trello");
		tb.CreatClick();
		tb.AddList();
		tb.ListA("ListA");
		tb.ClickListA();
		tb.ListB("ListB");
		tb.ClickListB();
		tb.ExitList();
				
	}
	
	@Test (priority = 3)
	public void AddCard() throws IOException, InterruptedException{
		Trello_AddCard ta = new Trello_AddCard();
		
		ta.AddClick();
		ta.AddName("Task_DD");
		ta.AddCardTaskDD();
		ta.ExitCard();
		
	}
	
	@Test(priority = 4)
	public void TrelloDragDrop() throws IOException, InterruptedException{
		Trello_Task_DragDrop dd = new Trello_Task_DragDrop();
		
		Actions action= new Actions(driver);
		Thread.sleep(10000);
		action.dragAndDrop(dd.LocListA,dd.LocListB).build().perform();
		
		 Point point = dd.XYCor.getLocation();
	        int xcord = point.getX();
	        System.out.println("x Co-ordinate : "+xcord);
	        int ycord = point.getY();
	        System.out.println("y Co-ordinate : "+ycord);
	}        
	 @Test(priority = 5)
	 public void TrelloLogout() throws IOException, InterruptedException{
		 Trello_Logout lg = new Trello_Logout();
		 lg.LogProfileClick();
		 lg.Logout();
	}
}
