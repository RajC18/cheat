package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\raj\\eclipse-workspace\\chromedriver\\chromedriver-win64\\chromedriver-win64\\chromedrive.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		

		By Username = By.id("ap_email");
		
		By Passward = By.id("ap_password");
		
		By Button = By.id("signInSubmit");
		
		Driver.findElement(Username).sendKeys("+918329847812");
		
		Driver.findElement(Passward).sendKeys("Raj@1807");
		
		Driver.findElement(Button).sendKeys(Keys.RETURN);
		
		By Logo = By.id("nav-logo-sprites");
		Driver.findElement(Logo).sendKeys(Keys.RETURN);
		
		
		By SearchBar = By.id("twotabsearchtextbox");
		
		Driver.findElement(SearchBar).sendKeys("samsung s23");
		Driver.findElement(SearchBar).sendKeys(Keys.RETURN);
		
		
		
		Driver.findElement(By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2'] span[class='a-size-medium a-color-base a-text-normal']")).click();
		//Driver.findElement(select).sendKeys(Keys.RETURN);
		Thread.sleep(10000);
		Driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		
		
		
		
//		Driver.get("https://www.amazon.in/Samsung-Galaxy-Fold5-Cream-Storage/dp/B0CB68L19S/ref=sr_1_2_sspa?crid=1RF0SP788BK1&keywords=samsung%2Bs23&qid=1702794271&sprefix=%2Caps%2C178&sr=8-2-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1#");
		
//		Driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[5]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[36]/div[1]/span[1]/span[1]/span[1]/input[1]")).click();
		//Driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		
		//Driver.findElement(By.cssSelector("#add-to-cart-button")).click();
		
		//Driver.findElement(By.name("submit.buy-now")).click();
		
}
}