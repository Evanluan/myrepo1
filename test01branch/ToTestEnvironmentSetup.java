package TestProject1_Selenium;
//必要的前置工作, 下载安装浏览器然后安装对应版本的浏览器驱动。
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTestEnvironmentSetup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\AboutTest\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.baidu.com");
		driver.manage().window().maximize();
	}

}
