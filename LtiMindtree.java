package InterviewsPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LtiMindtree {

	public static void main(String[] args) throws Exception {
		System.setProperty("wedriver.chrome.driver", "C:/Program Files/Java/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.google.com/");
		
		//implicity wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("Wait is over");
        //To save the current webpage
        Actions savepage=new Actions(driver); 
        Actions actionProvider = new Actions(driver);
        actionProvider.keyDown(Keys.CONTROL).sendKeys("s").keyUp(Keys.CONTROL).perform();

        Thread.sleep(5000);
	}

}
