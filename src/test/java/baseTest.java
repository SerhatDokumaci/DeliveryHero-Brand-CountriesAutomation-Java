import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class baseTest {
    WebDriver driver;

    @BeforeAll
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.deliveryhero.com/brands-countries/");
        driver.manage().window().maximize();
    }

    @AfterAll
    public void teardown(){
        driver.quit();
    }
}
