/**
 * Description : LinkedinTest.java is test file which is having test cases for linkedin..
 * Author      : Tushar Chawat
 * Date        : 02/06/2021
 */

package com.bridgelabz.selenium.Pages;

import com.bridgelabz.selenium.Base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Linkedin extends Base {
    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id='organic-div']/form/div[3]/button")
    WebElement clickSignin;

    public Login_Linkedin(WebDriver driver) { PageFactory.initElements(Base.driver, this);
    }

    public Login_Linkedin() {
    }

    public Post_Linkedin loggedin(){
        username.sendKeys("tushar1chawat@gmail.com");
        password.sendKeys("Wardha123");
        clickSignin.click();
        return new Post_Linkedin();
    }
}
