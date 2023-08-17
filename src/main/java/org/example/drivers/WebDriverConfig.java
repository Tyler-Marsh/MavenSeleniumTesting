package org.example.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.io.File;

@Configuration
public class WebDriverConfig {
    private static final String CHROMEDRIVER_PATH = System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver";
    @Bean("chromedriver")
    public WebDriver webDriver() {
        System.setProperty("webdriver.chrome.logfile", "chromedriver.log");
        System.setProperty("webdriver.chrome.verboseLogging", "true");

        System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
        ChromeDriver driver = new ChromeDriver();
        return driver;
    }
}