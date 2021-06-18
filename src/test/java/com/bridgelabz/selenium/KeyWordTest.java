/**
 * Description : LinkedinTest.java is test file which is having test cases for linkedin using Keyword Driven Framework.
 * Author      : Tushar Chawat
 * Date        : 02/06/2021
 */

package com.bridgelabz.selenium;

import com.bridgelabz.selenium.engine.ReadExcelSheet;
import com.bridgelabz.selenium.engine.KeywordEngine;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static com.bridgelabz.selenium.util.TestUtil.filePath;


public class KeyWordTest {
        public static void main (String[]args) throws IOException, InterruptedException {
            ReadExcelSheet rs = new ReadExcelSheet(filePath);
            rs.readExcelData(4);
            KeywordEngine k = new KeywordEngine();
            WebDriver newdriver = k.openBrowser();
            k.navigate(newdriver);
            k.enterEmail(newdriver);
            k.enterPassword(newdriver);
            k.clickSignIn(newdriver);
            k.closeBrowser(newdriver);
            System.out.println("Test executed successfully");
        }
}

