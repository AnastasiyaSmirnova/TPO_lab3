import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Config {
    public static WebDriver driverConfig() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home\\Desktop\\ChromeDriver\\chromedriver.exe");
//        return new ChromeDriver();
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Home\\Desktop\\FirefoxDriver\\geckodriver.exe");
        return new FirefoxDriver();
    }
}
