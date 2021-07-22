package selenium_basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class check_demotuors {
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\selenium\\geckodriver.exe");
	      WebDriver w1= new FirefoxDriver();
	      w1.get("https://www.google.com/");
	      w1.navigate().to("http://demo.guru99.com/test/newtours/index.php");
	      
     // all links
	      w1.findElement(By.linkText("SIGN-ON")).click();
	      w1.navigate().back();
	      w1.findElement(By.linkText("REGISTER")).click();
	      w1.navigate().back();
	      w1.findElement(By.linkText("SUPPORT")).click();
	      w1.navigate().back();
	      w1.findElement(By.linkText("CONTACT")).click();
	      w1.navigate().back();
	      w1.findElement(By.linkText("Home")).click();
	      w1.findElement(By.linkText("Flights")).click();
	      w1.findElement(By.linkText("Hotels")).click();
	      w1.findElement(By.linkText("Car Rentals")).click();
	      w1.findElement(By.linkText("Cruises")).click();
	      w1.findElement(By.linkText("Destinations")).click();
	      w1.findElement(By.linkText("Vacations")).click();
	      w1.navigate().back(); 
	      System.out.println("links work successfuly");
	     
	   //title of page
	      System.out.println("title of page is: "+w1.getTitle());
	      
	  //current url of page
			System.out.println("curent URL is: "+w1.getCurrentUrl());
			
		// login
			  w1.findElement(By.name("userName")).sendKeys("test");
		      w1.findElement(By.name("password")).sendKeys("test");
		      w1.findElement(By.name("submit")).click();
		      System.out.println("login successfuly done");
		      w1.navigate().back();
		      Thread.sleep(2000);
		      
			// register form
			     w1.findElement(By.linkText("REGISTER")).click();
		         w1.findElement(By.name("firstName")).sendKeys("Mohini");
			     w1.findElement(By.name("lastName")).sendKeys("raut");
			     w1.findElement(By.name("phone")).sendKeys("9172584770");
			     w1.findElement(By.name("userName")).sendKeys("mohiniraut87@gmail.com");
			     w1.findElement(By.name("address1")).sendKeys("akola");
			     w1.findElement(By.name("city")).sendKeys("akola");
			     w1.findElement(By.name("state")).sendKeys("maharastra");
			     w1.findElement(By.name("postalCode")).sendKeys("55302");
			     Select s=new Select(w1.findElement(By.name("country")));
			     s.selectByVisibleText("AUSTRIA");
			     w1.findElement(By.name("email")).sendKeys("mohiniraut87@gmail.com");
			     w1.findElement(By.name("password")).sendKeys("123456");
			     w1.findElement(By.name("confirmPassword")).sendKeys("123456");
			     w1.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")).click();
		         Thread.sleep(2000);
		         System.out.println("Register form successfuly done");
		         
	    //selenium
		     w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		     Thread.sleep(1000);
		     w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[1]/a")).click(); //flash move demo
		     w1.navigate().back();
		     Thread.sleep(1000);
		      w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();  //radio button
		     Thread.sleep(1000);
		     w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[2]/a")).click();
		     w1.findElement(By.id("vfb-7-2")).click();
		     Thread.sleep(1000);
		     w1.findElement(By.id("vfb-6-0")).click(); //checkbox
		     w1.findElement(By.id("vfb-6-2")).click();
		     w1.navigate().back();
		     w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		     w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[3]/a")).click(); //tabel
		     w1.navigate().back();
		     Thread.sleep(1000);
		     w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		     w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[4]/a")).click(); //access link
		     w1.findElement(By.linkText("click here")).click();
		     w1.navigate().back();
		     w1.navigate().back();
		     Thread.sleep(1000);
		     w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		     w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[5]/a")).click(); //ajax
		     w1.findElement(By.xpath("//*[@id=\"yes\"]")).click();
		     w1.findElement(By.xpath("//*[@id=\"buttoncheck\"]")).click();   
		     w1.navigate().back();
		     Thread.sleep(1000);
		     w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		     w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[19]/a")).click();
		     
		     //for drag and drop
		    WebElement bank = w1.findElement(By.partialLinkText("BANK"));
			WebElement drop1 = w1.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
			Actions a = new Actions(w1);
			a.dragAndDrop(bank, drop1).build().perform();

			WebElement amt = w1.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
			WebElement drop2 = w1.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
			a.dragAndDrop(amt, drop2).build().perform();

			WebElement sales = w1.findElement(By.partialLinkText("SALES"));
			WebElement drop3 = w1.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/ol[1]/li[1]"));
			a.dragAndDrop(sales, drop3).build().perform();

			WebElement amt2 = w1.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
			WebElement drop4 = w1.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
			a.dragAndDrop(amt2, drop4).build().perform();
			w1.navigate().back(); 
			Thread.sleep(2000);
			System.out.println("drag and drop successfuly done");
			
			   //scroll
			w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[16]/a")).click();
			 
			w1.manage().window().maximize();      
			WebElement Element=w1.findElement(By.xpath("//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div/div[6]/div/div/div/div/div[1]/div/div"));
			JavascriptExecutor js =(JavascriptExecutor) w1; // JavascriptExecutor is a variable
			js.executeScript("arguments[0].scrollIntoView();", Element);
		    
			w1.navigate().back(); 
			Thread.sleep(2000);
			 w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			 w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[20]/a")).click();
			 w1.findElement(By.xpath("/html/body/form/input[1]")).click();
			 w1.navigate().back(); 
			 System.out.println("scrollbar done");
						     
					   
		     //inshurance
		     w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[3]/a")).click();
		     w1.findElement(By.xpath("/html/body/div[3]/a")).click();
		     
		     Select s1=new Select(w1.findElement(By.name("title")));
		      s1.selectByVisibleText("Miss");
		      
		      w1.findElement(By.name("firstname")).sendKeys("Mohini");
		      w1.findElement(By.name("lastname")).sendKeys("Raut");
		      w1.findElement(By.name("phone")).sendKeys("9172584770");
		      Select s2=new Select(w1.findElement(By.name("year")));
		      s2.selectByVisibleText("1995");
		      Select s3=new Select(w1.findElement(By.name("date")));
		      s3.selectByVisibleText("4");
		      w1.findElement(By.xpath("//*[@id=\"new_user\"]/div[2]/div[4]/label[2]")).click();
		      Select s4=new Select(w1.findElement(By.name("licenceperiod")));
		      s4.selectByVisibleText("4");      
		      w1.findElement(By.name("street")).sendKeys("Akola");
		      w1.findElement(By.name("city")).sendKeys("Akola");
		      w1.findElement(By.name("county")).sendKeys("India");
		      w1.findElement(By.name("post_code")).sendKeys("444501");
		      w1.findElement(By.name("email")).sendKeys("mohiniraut87@gmail.com");
		      w1.findElement(By.name("password")).sendKeys("123456");
		      w1.findElement(By.name("c_password")).sendKeys("123456");
		      w1.findElement(By.name("submit")).click();
		      
		      Thread.sleep(2000);
		      
		      w1.findElement(By.name("email")).sendKeys("mohiniraut87@gmail.com");
		      w1.findElement(By.name("password")).sendKeys("123456");
		      w1.findElement(By.name("submit")).click();
		      w1.findElement(By.xpath("/html/body/div[3]/form/input")).click();
		    w1.navigate().back();
		    w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[10]/a")).click();//new tour
		    
		    w1.findElement(By.linkText("Agile Project")).click();//agile project
		    w1.navigate().back();
		 
		    w1.findElement(By.linkText("Bank Project")).click();//bank project
		    w1.navigate().back();
		    
		    w1.findElement(By.linkText("Security Project")).click();//security project
		    w1.navigate().back();
		    
	       //Telecom project
		    w1.findElement(By.linkText("Telecom Project")).click();
		    
		    w1.findElement(By.linkText("Add Customer")).click();//add cutomer
		    w1.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
		    w1.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("Mohini");  
		    w1.findElement(By.id("lname")).sendKeys("raut");  
		    w1.findElement(By.id("email")).sendKeys("mohiniraut87@gmail.com"); 
		    w1.findElement(By.tagName("textarea")).sendKeys("Akola"); 
		    w1.findElement(By.xpath("//*[@id=\"telephoneno\"]")).sendKeys("9172584770"); 
		    w1.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[9]/ul/li[1]/input")).click();//submit
		    Thread.sleep(3000);
		    w1.findElement(By.xpath("//*[@id=\"main\"]/div/div/ul/li/a")).click();//homepage
		   
		    w1.findElement(By.linkText("Add Tariff Plan to Customer")).click(); // Add Tariff Plan to Customer
		    w1.findElement(By.xpath("//*[@id=\"customer_id\"]")).sendKeys("641120"); 
		    w1.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[6]/input")).click();
		    w1.findElement(By.xpath("//*[@id=\"main\"]/div/form/div[2]/input")).click();
		    w1.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/a")).click();
		    Thread.sleep(3000);
		    
		    w1.findElement(By.linkText("Add Tariff Plan")).click(); // Add Tariff Plan 
		    w1.findElement(By.xpath("//*[@id=\"rental1\"]")).sendKeys("5000"); 
		    w1.findElement(By.xpath("//*[@id=\"local_minutes\"]")).sendKeys("5000"); 
		    w1.findElement(By.xpath("//*[@id=\"inter_minutes\"]")).sendKeys("5000"); 
		    w1.findElement(By.xpath("//*[@id=\"sms_pack\"]")).sendKeys("5000"); 
		    w1.findElement(By.xpath("//*[@id=\"minutes_charges\"]")).sendKeys("5000"); 
		    w1.findElement(By.xpath("//*[@id=\"inter_charges\"]")).sendKeys("5000"); 
		    w1.findElement(By.xpath("//*[@id=\"sms_charges\"]")).sendKeys("5000"); 
		    w1.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[36]/ul/li[1]/input")).click();
		    w1.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li/a")).click();
		    Thread.sleep(3000);
		    
		    w1.findElement(By.linkText("Pay Billing")).click(); 
		    w1.findElement(By.xpath("//*[@id=\"customer_id\"]")).sendKeys("641120"); 
		    w1.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[6]/input")).click();
		    w1.navigate().back();
		    w1.navigate().back();
		    Thread.sleep(3000);
		    System.out.println("Telecom project done");
		  //payment gateway
		      
		      w1.findElement(By.linkText("Payment Gateway Project")).click();
		      w1.findElement(By.xpath("//*[@id=\"three\"]/div/form/div/div[4]/select")).click();
		      w1.findElement(By.xpath("//*[@id=\"three\"]/div/form/div/div[8]/ul/li/input")).click();
		      
		      w1.findElement(By.tagName( "img")).click();
		      w1.findElement(By.xpath("//*[@id=\"card_nmuber\"] ")).sendKeys("1010203569874231");
		      Select s6=new Select(w1.findElement(By.name("month")));
		      s6.selectByVisibleText("05");
		      Select s7=new Select(w1.findElement(By.name("year")));
		      s7.selectByVisibleText("2025");
		      w1.findElement(By.xpath("//*[@id=\"cvv_code\"]")).sendKeys("699");
		      w1.findElement(By.xpath("//*[@id=\"three\"]/div/form/div[2]/div/ul/li/input")).click();
		      System.out.println("payment gateway done");
		      
		      
		      //next page
		      
		      w1.findElement(By.xpath("//*[@id=\"three\"]/div/div/ul/li/a")).click();
		    
		  //seo
		    w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
		    Thread.sleep(1000);
		    w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/ul/li[1]/a")).click(); //page1
		    w1.navigate().back();
		    w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
		    Thread.sleep(1000);
		    w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/ul/li[2]/a")).click();//page2
		    w1.navigate().back();
		    w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
		    Thread.sleep(1000);
		    w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/ul/li[3]/a")).click();//page3
		    w1.navigate().back();
		    w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
		    Thread.sleep(1000);
		    w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/ul/li[4]/a")).click();//page4
		    w1.navigate().back();
		    w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
		    Thread.sleep(1000);
		    w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/ul/li[5]/a")).click();//page5
		    w1.navigate().back();
		    w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
		    Thread.sleep(1000);
		    w1.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/ul/li[6]/a")).click();//page6
		    w1.navigate().back();
		    System.out.println("Website is successfuly done");
	}

}

