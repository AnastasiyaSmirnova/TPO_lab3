// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class GetCoffeeMakerProfileTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = Config.driverConfig();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void getCoffeeMakerProfile() {
    // Test name: getCoffeeMakerProfile
    // Step # | name | target | value | comment
    // 1 | open | / |  | 
    driver.get("https://ulmarts.ru//");
    // 2 | click | xpath=//div[3]/div/div/a |  | 
    driver.findElement(By.xpath("//div[3]/div/div/a")).click();
    // 3 | click | xpath=//div[4]/ul/li[2]/a |  | 
    driver.findElement(By.xpath("//div[4]/ul/li[2]/a")).click();
    // 4 | runScript | window.scrollTo(0,376) |  | 
    js.executeScript("window.scrollTo(0,376)");
    // 5 | click | xpath=//div[4]/div/div/a |  | 
    driver.findElement(By.xpath("//div[4]/div/div/a")).click();
  }
}
