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

public class Create_Event {
    @FindBy(xpath = "//span[text() = 'Home']")
    WebElement Home;

    @FindBy(xpath = "//span[text() = 'Events']")
    WebElement Event;

    @FindBy(xpath = "//span[text() = 'Create']")
    WebElement Create;

    @FindBy(id = "events-shared-creation-form__name")
    WebElement Name;

    @FindBy(id = "events-shared-details-section__description")
    WebElement Description;

    @FindBy(xpath = "//input[@id = 'date-time-picker__start-date']")
    WebElement StateDate;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[1]/form/section[1]/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/section/div/ul/li[3]/ul/li[6]/button")
    WebElement SelectDate;

    @FindBy(xpath = "//*[@id=\"date-time-picker__start-time\"]")
    WebElement SelectTime;

    @FindBy(xpath = "//input[@id = 'date-time-picker__end-date']")
    WebElement EndDate;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[1]/form/section[1]/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/section/div/ul/li[3]/ul/li[6]/button")
    WebElement DateSelect;

    @FindBy(xpath = "//*[@id=\"date-time-picker__end-time\"]")
    WebElement EndTime;

    @FindBy(xpath = "//button[@class = 'flex-shrink-zero full-height artdeco-button artdeco-button--2 artdeco-button--primary ember-view']")
    WebElement Button;

    @FindBy(xpath = "//span[text() = 'Post']")
    WebElement Post;

    public Create_Event(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public Create_Event() {
    }

    public void Create() throws InterruptedException {
        Home.click();
        Thread.sleep(5000);
        Event.click();
        Thread.sleep(5000);
        Create.click();
        Thread.sleep(5000);
        Name.sendKeys("Main");
        Thread.sleep(2000);
//        StateDate.click();
//        Thread.sleep(2000);
//        SelectDate.click();
//        Thread.sleep(2000);
//        SelectTime.clear();
//        Thread.sleep(2000);
//        SelectTime.sendKeys("0230AM");
//        Thread.sleep(2000);
//        EndDate.click();
//        Thread.sleep(2000);
//        DateSelect.click();
//        Thread.sleep(2000);
//        EndTime.clear();
//        Thread.sleep(2000);
//        EndTime.sendKeys("0300PM");
        Thread.sleep(2000);
        Description.sendKeys("Main");
        Thread.sleep(5000);
        Button.click();
        Thread.sleep(5000);
        Post.click();
        Thread.sleep(5000);
    }
}
