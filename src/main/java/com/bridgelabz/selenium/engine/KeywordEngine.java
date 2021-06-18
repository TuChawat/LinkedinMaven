/**
 * Description : LinkedinTest.java is test file which is having test cases for linkedin using Keyword Driven Framework.
 * Author      : Tushar Chawat
 * Date        : 02/06/2021
 */

package com.bridgelabz.selenium.engine;

import com.bridgelabz.selenium.util.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordEngine  {
        public static WebDriver driver;
        public WebDriver openBrowser()
        {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        }
        public void navigate(WebDriver newdriver)
        {
            newdriver.get(TestUtil.URL);
        }
        public void enterEmail(WebDriver newdriver)
        {
            newdriver.findElement(By.id("username")).sendKeys(TestUtil.username);
        }
        public void enterPassword(WebDriver newdriver)
        {
            newdriver.findElement(By.id("password")).sendKeys(TestUtil.password);
        }
        public void clickSignIn(WebDriver newdriver) throws InterruptedException {
            newdriver.findElement(By.xpath("//*[@id='organic-div']/form/div[3]/button")).click();
            Thread.sleep(5000);
        }

        public void closeBrowser(WebDriver newdriver)
        {
            newdriver.quit();
        }
}


