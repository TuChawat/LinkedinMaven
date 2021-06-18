/**
 * Description : LinkedinTest.java is test file which is having test cases for linkedin..
 * Author      : Tushar Chawat
 * Date        : 05/06/2021
 */

package com.bridgelabz.selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class Upload_Image {
    @FindBy(xpath = "//span[text() = 'Home']")
    WebElement Home;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[2]/span[1]/button[1]/span[1]")
    WebElement Photo;

    @FindBy(xpath = "//span[text() = 'Done']")
    WebElement Done;

    @FindBy(xpath = "//button[starts-with(@class, 'share-action')]")
    WebElement Post;

    public Upload_Image(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void Photo() throws InterruptedException, IOException {
        Home.click();
        Photo.click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("D:\\AutoIT\\Upload.exe");
        Thread.sleep(2000);
        Done.click();
        Thread.sleep(2000);
        Post.click();
    }
}
