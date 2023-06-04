import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class LivemasterTest {
  private WebDriver driver;

    @BeforeAll
    static void installDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void livemasterTest() {
        driver.get("https://www.livemaster.ru");
        driver.findElement(By.name("q")).sendKeys("платье в горошек");
        driver.findElement(By.className("btnK")).click();
        System.out.println(driver.findElements(By.tagName("h3")).size());
    }
    @AfterEach
    public void closeBrowser() {
        driver.close();
    }
}
