/**
 * Description : LinkedinTest.java is test file which is having test cases for linkedin using Keyword Driven Framework.
 * Author      : Tushar Chawat
 * Date        : 02/06/2021
 */

package com.bridgelabz.selenium.engine;

import com.bridgelabz.selenium.util.TestUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadExcelSheet {

    public ReadExcelSheet(String filePath) {

    }

    public ArrayList readExcelData(int colNo) throws IOException
    {
        String filePath = TestUtil.filePath;
        File file = new File(filePath);
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Login");

        Iterator row = sheet.rowIterator();
        row.next();
        ArrayList<String> a = new ArrayList();
        while(row.hasNext())
        {
            a.add(((Row) row.next()).getCell(colNo).getStringCellValue());
        }
        System.out.println("List: " +a);
        return a;
    }
}
