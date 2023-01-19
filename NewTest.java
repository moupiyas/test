package LaunchBrowser;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver Driver = new ChromeDriver();
	
	//System.setProperty("Webdriver.firefox.marionette","C:\\Users\\Moupiya Sinha\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");	
  @Test
  public void f() {
	  System.out.println("sunny");
	  //System.setProperty("Webdriver.firefox.marionette","C:\\Users\\Moupiya Sinha\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moupiya Sinha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  //System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Moupiya Sinha\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
	  Driver.manage().window().maximize();
	  Driver.get("https://www.google.com/");
	  //Driver.close();
	  //Driver.quit();
  }

  @Test
  public void f1() {
	  //System.out.println("sunny");
	  //System.setProperty("Webdriver.firefox.marionette","C:\\Users\\Moupiya Sinha\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moupiya Sinha\\Downloads\\chromedriver_win32\\chromedriver.exe");

	  //System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Moupiya Sinha\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
	  Driver.manage().window().maximize();
	  Driver.get("https://www.facebook.com/");
	  //Driver.close();
  }
  @Test
  public void f2() {
	  //System.out.println("sunny");
	  //System.setProperty("Webdriver.firefox.marionette","C:\\Users\\Moupiya Sinha\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moupiya Sinha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  //System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Moupiya Sinha\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
	  Driver.manage().window().maximize();
	  Driver.get("https://www.amazon.in/");
	  //WebElement m=Driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	  WebElement m=Driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[2]/div[1]/span[1]"));
	  m.click();
	  WebElement m1=Driver.findElement(By.xpath("//input[@id='ap_email']"));
	  m1.sendKeys("sunnyadakece@gmail.com");
	  WebElement m2=Driver.findElement(By.xpath("//input[@id='continue']"));
	  m2.click();
	  WebElement m3=Driver.findElement(By.xpath("//input[@id='ap_password']"));
	  m3.sendKeys("Monomeric@002");
	  WebElement m4=Driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	  m4.click();
	  WebElement m5=Driver.findElement(By.xpath("//span[normalize-space()='Returns']"));
	  m5.click();
	  WebElement m6=Driver.findElement(By.xpath("//a[contains(text(),'Bajaj Blow Hot 2000 Watts Fan Heater – (White/Blac')]"));
	  m6.click();	  
	  WebElement m7=Driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[5]/div[4]/div[4]/div[9]/div[3]/div[1]/span[2]/span[2]/span[2]"));  
	  String Value = m7.getText();
	  System.out.println(Value);
	  String NewValue=Value.replaceAll(",","");
	  int i=Integer.parseInt(NewValue);
	  System.out.println(NewValue);
	  System.out.println(i);
	  Assert.assertEquals(i, 1599);
	  WebElement m8=Driver.findElement(By.xpath("//span[@class='a-size-medium']"));
	  String Ordered = m8.getText();
	  System.out.println(Ordered);
	  //Assert.assertEquals(i, 1599);
	  //Driver.close();
  } 
  
  
  @Test
  public void f3() {
	  //System.out.println("sunny");
	  //System.setProperty("Webdriver.firefox.marionette","C:\\Users\\Moupiya Sinha\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moupiya Sinha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  //System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Moupiya Sinha\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
	  //Driver.manage().window().maximize();
	  //Driver.get("https://www.amazon.in/");
	  //WebElement m=Driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_bestsellers\"]"));
	  //m.click();
	  //Driver.close();
  } 
  
  @AfterClass
  public void end()
  {
	  Driver.close();
  }

  
}
