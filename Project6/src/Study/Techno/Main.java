package Study.Techno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Main {

    public static void main(String[] args) {


	// write your code here
        System.setProperty( "webdriver.chrome.driver", "/Users/mohannaelhetawy/Desktop/Chromedriver/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.techlistic.com/p/selenium-practice-form.html" );
        WebElement we =driver.findElement(By.name("firstname"));
        we.sendKeys("hend");
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Fathalla");
        List<WebElement> gender = driver.findElements(By.name("sex"));
        WebElement secondElementOfGender = gender.get(1);
        secondElementOfGender.click();
        List<WebElement> experience = driver.findElements(By.name("exp"));
        experience.get(1).click();
        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("12.16.2019");
        WebElement checkbox = driver.findElement(By.id("profession-1"));
        checkbox.click();
        WebElement tools = driver.findElement(By.id("tool-2"));
        tools.click();
        WebElement continent = driver.findElement(By.name("continents"));
        Select dropdown = new Select(continent);
        dropdown.selectByIndex(5);
        List<WebElement> command = driver.findElements(By.tagName("selenim_commands"));
        for (WebElement e: command) {
            e.click();
            Select select = new Select(driver.findElement(By.id("selenium_commands")));

            List<WebElement> select31Options = select.getOptions();
            for (WebElement option : select31Options) {
                select.selectByVisibleText(option.getText());
               select.selectByVisibleText("Browser Commands");
              select.selectByVisibleText("Navigation Commands");
              select.selectByVisibleText("Switch Commands");
               select.selectByVisibleText("Wait Commands");
              select.selectByVisibleText("WebElement Commands");
            }
        }
    }
}
