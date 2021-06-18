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

public class My_Items {
    @FindBy(xpath = "//a[@href = '/my-items/']")
    WebElement Items;

    @FindBy(xpath = "//a[@href = '/my-items/saved-jobs/']")
    WebElement Jobs;

    public My_Items(WebDriver driver) { PageFactory.initElements(driver, this);
    }

    public My_Items() {

    }

    public void Saved() throws InterruptedException {
        Items.click();
        Thread.sleep(5000);
    }
}
