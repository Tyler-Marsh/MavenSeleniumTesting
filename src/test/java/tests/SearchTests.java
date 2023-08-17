package tests;
import org.example.drivers.WebDriverConfig;
import org.example.pages.HomePage;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
// ... you can add other assertions as needed

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


@SpringBootTest(classes = WebDriverConfig.class)
public class SearchTests {


    @Autowired
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }



    @Test
    public void testSearchTermReact() {
        driver.get("https://www.code-more.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3)); // 3 seconds timeout
        HomePage homePage = new HomePage(driver);
        homePage.clickSearchButton();
        homePage.enterSearchTerm("react");
        WebElement anchor = homePage.validateSearchLink("/blog/Use-react-to-track-scroll-position");
        assertNotNull(anchor);
    }


    @Test
    public void testBogusSearchTerm() {
        driver.get("https://www.code-more.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3)); // 3 seconds timeout
        HomePage homePage = new HomePage(driver);
        homePage.clickSearchButton();
        homePage.enterSearchTerm("bogus");
        int numberOfResults = homePage.countNumberSearchResults();
        assertEquals(0, numberOfResults);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            try {
                driver.close();  // Close the current browser window
                driver.quit();   // Close all the windows and quit the browser
            } catch (Exception e) {
                System.out.println("Error while trying to close the browser: " + e.getMessage());
            } finally {
                driver = null;
            }
        }
    }
}
