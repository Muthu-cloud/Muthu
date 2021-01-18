package selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Muthu\\Desktop\\selenium\\selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);


		
		

		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//day9:  6
//WebElement countries = driver.findElement(By.xpath("//select[@name='country']"));
//Select s=new Select(countries);
//List<WebElement> options = s.getOptions();
//for (int i = 0; i < options.size(); i++) {
//	WebElement allopt = options.get(i);
//	System.out.println(allopt.getText());
	
//}
	
	
	
	
	
	
//	day 9:  5

//  WebElement btn = driver.findElement(By.xpath("//a[@id='u_0_2']"));
//  btn.click();
//  Thread.sleep(3000);
//	WebElement date = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
//	Select s=new Select(date);
//	List<WebElement> opt = s.getOptions();
//	for (int i = 0; i < opt.size(); i++) {
//		
//		if (i%2==0) {
//		WebElement allopt = opt.get(i);
//		System.out.println(allopt.getAttribute("value"));
//
//}
//
//}
//		



//day9: 4
//WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
//Select s = new Select(month);
//List<WebElement> allopt = s.getOptions();
//for (int i = 0; i < allopt.size(); i++) {
//	WebElement options = allopt.get(i);
//	System.out.println(options.getText());








// day 9:3
// WebElement btn = driver.findElement(By.xpath("//a[@id='u_0_2']"));
// btn.click();
// Thread.sleep(3000);
//
// WebElement yrs = driver.findElement(By.xpath("//select[@id='year']"));
// Select s=new Select(yrs);
// List<WebElement> allopt = s.getOptions();
// for (int i = 0; i < allopt.size(); i++) {
// WebElement options = allopt.get(i);
// System.out.println(options.getText());

// day8: 7
// driver.switchTo().frame("login_page");
// WebElement user =
// driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
// user.sendKeys("muthu123");
//
// WebElement btn = driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
// btn.click();
//
// Thread.sleep(3000);
//
// WebElement pass=
// driver.findElement(By.xpath("(//input[@class='input_password'])[2]"));
// pass.sendKeys("123456789");
//

// day:8 :6
// WebElement btn =
// driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
// btn.click();
//
// Thread.sleep(3000);
//
// WebElement login = driver.findElement(By.xpath("//input[@id='Button2']"));
// login.click();
//

// day 8:4
// WebDriver frame = driver.switchTo().frame("login_page");
// WebElement btn =
// driver.findElement(By.xpath("//img[@src='/gif/continue_new1.gif?v=1']"));
// btn.click();
//
// Alert alert = driver.switchTo().alert();
// alert.accept();

// day 11:

// WebElement table = driver.findElement(By.tagName("table"));
// List<WebElement> allrow = driver.findElements(By.tagName("tr"));
//
// for (int i = 0; i <allrow.size(); i++) {
// WebElement eachrow = allrow.get(i);
//
// List<WebElement> alldata = driver.findElements(By.tagName("td"));
// for (int j = 0; j <alldata.size(); j++) {
// WebElement eachdata = alldata.get(j);
// System.out.println(eachdata.getText());
//

// day12:4
// WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
// JavascriptExecutor js=(JavascriptExecutor)driver;
// js.executeScript("arguments[0].setAttribute('value','selenium')",user );
//
// WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
// js.executeScript("arguments[0].setAttribute('value','123456789')", pass);
//
// WebElement btn = driver.findElement(By.xpath("//button[@id='u_0_b']"));
// btn.click();
//

// day12:3
// WebElement scrdown =
// driver.findElement(By.xpath("(//h2[@class='mb-0'])[6]"));
// JavascriptExecutor js=(JavascriptExecutor)driver;
// js.executeScript("arguments[0].scrollIntoView(true)",scrdown);
//

// day12 :1

// WebElement add =
// driver.findElement(By.xpath("(//span[@class='red_text'])[5]"));
//
// JavascriptExecutor js=(JavascriptExecutor)driver;
// js.executeScript("arguments[0].scrollIntoView(true)",add );
//
// WebElement fulladd =
// driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
// System.out.println(fulladd.getText());
//

// day 8: 4
// driver.manage().window().maximize();
// driver.switchTo().frame("login_page");
//
// WebElement user =
// driver.findElement(By.xpath("//img[@style='margin-right:18px;']"));
// user.click();
// Alert btn = driver.switchTo().alert();
// btn.accept();

// day 8 :6
// WebElement btn =
// driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
// btn.click();
// Thread.sleep(3000);
//
// WebElement btn1 = driver.findElement(By.xpath("//input[@id='Button2']"));
// btn1.click();
// Thread.sleep(3000);
//
// Alert a=driver.switchTo().alert();
// a.accept();
//

// day 7
// WebElement btn = driver.findElement(By.xpath("//button[@class='_2KpZ6l
// _2doB4z']"));
// btn.click();
//
// WebElement mo =
// driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[5]"));
// Actions a=new Actions(driver);
// a.moveToElement(mo).perform();
//
//
// TakesScreenshot tk=(TakesScreenshot)driver;
// File src = tk.getScreenshotAs(OutputType.FILE);
// File des=new
// File("C:\\Users\\Muthu\\Desktop\\selenium\\selenium\\Pic\\klokm.png");
//
// FileUtils.copyFile(src, des);

// day 7
// WebElement btn = driver.findElement(By.xpath("//button[@class='_2KpZ6l
// _2doB4z']"));
// btn.click();
//
// driver.manage().window().maximize();
//
// Thread.sleep(5000);
// WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
// search.sendKeys("iphone");
//
// WebElement btn1 = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
// btn1.click();
// Thread.sleep(3000);
//
// TakesScreenshot tk=(TakesScreenshot)driver;
// File src = tk.getScreenshotAs(OutputType.FILE);
// File des=new
// File("C:\\Users\\Muthu\\Desktop\\selenium\\selenium\\Pic\\klm.png");
//
// FileUtils.copyFile(src, des);
//

// TakesScreenshot tk=(TakesScreenshot)driver;
// File src = tk.getScreenshotAs(OutputType.FILE);
// File des=new
// File("C:\\Users\\Muthu\\Desktop\\selenium\\selenium\\Pic\\face.png");
//
// FileUtils.copyFile(src, des);
//

// WebElement down = driver.findElement(By.xpath("(//h2[@class='mb-0'])[1]"));
// Thread.sleep(3000);
//
// JavascriptExecutor js=(JavascriptExecutor)driver;
// js.executeScript("arguments[0].scrollIntoView(true)", down);
//
// Thread.sleep(3000);
//
// TakesScreenshot tk=(TakesScreenshot)driver;
// File src = tk.getScreenshotAs(OutputType.FILE);
// File des=new
// File("C:\\Users\\Muthu\\Desktop\\selenium\\selenium\\Pic\\gr.png");
//
// FileUtils.copyFile(src, des);
// Thread.sleep(3000);
//
// WebElement up=driver.findElement(By.xpath("//h3[text()='Online
// Classroom']"));
// js.executeScript("arguments[0].scrollIntoView(false)",up );
//
//
//

// Thread.sleep(3000);
// String text = down.getText();
// System.out.println(text);
//
