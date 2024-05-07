package TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import PageObjectModel.LandingPage;


public class BaseTest {
	public WebDriver driver;
	public LandingPage landingpage;

	public WebDriver initializeDriver() throws IOException
	{
		
		Properties prop=new Properties();
		String path=System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\GlobalData.properties";
		
		FileInputStream fis=new FileInputStream(path);
		prop.load(fis);
		String browserName=prop.getProperty("browser");

		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();

		}
		return driver;
	}
	@BeforeMethod
	public void lanchApplication() throws IOException
	{
		//System.out.println("sdfs");
		driver=initializeDriver();
	    landingpage=new LandingPage(driver);
		landingpage.goTo();
		//return landingpage;
		

		
	}
	/*@AfterMethod
	public void tearDown() {
		driver.close();
	}*/


}
