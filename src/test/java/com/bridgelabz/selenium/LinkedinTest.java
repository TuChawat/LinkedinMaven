/**
 * Description : LinkedinTest.java is test file which is having test cases for linkedin..
 * Author      : Tushar Chawat
 * Date        : 02/06/2021
 */

package com.bridgelabz.selenium;

import com.bridgelabz.selenium.Base.Base;
import com.bridgelabz.selenium.Pages.*;
import com.bridgelabz.selenium.driver.TestNGListner;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

import static com.bridgelabz.selenium.utilities.Screenshot.capture;

@Listeners(TestNGListner.class)
public class LinkedinTest extends Base {
    public Login_Linkedin login;
    public Post_Linkedin post;
    public My_Items Items;
    public Create_Event Event;
    public Upload_Image Upload;

    @Test(priority = 0)
    public void login_Linkedin() throws IOException {
        login = new Login_Linkedin(driver);
        login.loggedin();
        System.out.println(driver.getTitle());
        String Account = driver.getTitle();
        Assert.assertEquals(driver.getTitle(),"Feed | LinkedIn");
        if (Account.equals("Feed | LinkedIn")){
            test.log(LogStatus.PASS, "Navigated to My account");
            test.log(LogStatus.PASS, test.addScreenCapture(capture(driver))+ "Login Test Passed");
        }else {
            test.log(LogStatus.FAIL, "Test Failed");
            test.log(LogStatus.PASS, test.addScreenCapture(capture(driver))+ "Login Test Failed");
        }
    }

    @Test(priority = 1)
    public void post_Linkedin() throws InterruptedException, IOException {
        post = new Post_Linkedin(driver);
        post.uploaded();
        System.out.println(driver.getTitle());
        String Post = driver.getTitle();
        Assert.assertEquals(driver.getTitle(),"Feed | LinkedIn");
        Thread.sleep(1000);
        if (Post.equals("Feed | LinkedIn")){
            test.log(LogStatus.PASS, "Navigated to My account");
            test.log(LogStatus.PASS, test.addScreenCapture(capture(driver))+ "Login Test Passed");
        }else {
            test.log(LogStatus.FAIL, "Test Failed");
            test.log(LogStatus.PASS, test.addScreenCapture(capture(driver))+ "Login Test Failed");
        }
    }

    @Test(priority = 2)
    public void My_Items() throws InterruptedException, IOException {
        Items = new My_Items(driver);
        Items.Saved();
        System.out.println(driver.getTitle());
        String Items = driver.getTitle();
        Assert.assertEquals(driver.getTitle(),"My Jobs | LinkedIn");
        Thread.sleep(1000);
        if (Items.equals("My Jobs | LinkedIn")){
            test.log(LogStatus.PASS, "Navigated to My account");
            test.log(LogStatus.PASS, test.addScreenCapture(capture(driver))+ "Login Test Passed");
        }else {
            test.log(LogStatus.FAIL, "Test Failed");
            test.log(LogStatus.PASS, test.addScreenCapture(capture(driver))+ "Login Test Failed");
        }
    }

    @Test(priority = 3)
    public void Create_Event() throws InterruptedException, IOException {
        Event = new Create_Event(driver);
        Event.Create();
        System.out.println(driver.getTitle());
        String Event = driver.getTitle();
        Assert.assertEquals(driver.getTitle(),"My Jobs | LinkedIn");
        Thread.sleep(1000);
        if (Event.equals("My Jobs | LinkedIn")){
            test.log(LogStatus.PASS, "Navigated to My account");
            test.log(LogStatus.PASS, test.addScreenCapture(capture(driver))+ "Login Test Passed");
        }else {
            test.log(LogStatus.FAIL, "Test Failed");
            test.log(LogStatus.PASS, test.addScreenCapture(capture(driver))+ "Login Test Failed");
        }
    }

    @Test(priority = 4)
    public void Upload_Image() throws AWTException, InterruptedException, IOException {
        Upload = new Upload_Image(driver);
        Upload.Photo();
        Thread.sleep(10000);
    }
}
