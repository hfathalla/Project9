package Study.Techno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here;

            System.setProperty("webdriver.chrome.driver", "/Users/mohannaelhetawy/Desktop/Chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.phptravels.net/en");


    }
}

