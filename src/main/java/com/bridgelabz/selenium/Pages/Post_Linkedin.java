/**
 * Description : LinkedinTest.java is test file which is having test cases for linkedin..
 * Author      : Tushar Chawat
 * Date        : 02/06/2021
 */

package com.bridgelabz.selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Post_Linkedin extends Login_Linkedin {
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div/div[1]/button")
    WebElement postButton;

    @FindBy(xpath = "//div[@class = 'ql-editor ql-blank']")
    WebElement Enter;

    @FindBy(xpath = "//button[starts-with(@class, 'share-action')]")
    WebElement Post;


    public Post_Linkedin(WebDriver driver) { PageFactory.initElements(driver, this);
    }

    public Post_Linkedin() {

    }

    public My_Items uploaded() throws InterruptedException {
        postButton.click();
        Enter.sendKeys("https://en.wikipedia.org/30");
        Thread.sleep(2000);
        Post.click();
        return new My_Items();
    }
}
