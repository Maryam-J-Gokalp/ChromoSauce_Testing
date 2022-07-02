package demo.sauce.utilities;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    /**
     * This method using for the unconditional waiting situtations
     *
     * @param seconds
     */

    public static void sleep(int seconds){

        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {

        }
    }

    public static List<String> getUserNames(){

        List<String> usernames = new ArrayList<>();

        String SheetName = "credentials";
        String path = "credentials.xlsx";

        try {
            FileInputStream file = new FileInputStream(path);
            XSSFWorkbook workBook = new XSSFWorkbook(file);
            XSSFSheet sheet = workBook.getSheet(SheetName);

            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
                usernames.add(sheet.getRow(i).getCell(0).toString());
            }

        } catch (IOException e) {

            e.printStackTrace();
        }
    return usernames;
    }

    public static List<String> getPasswords(){

        List<String> passwords = new ArrayList<>();

        String SheetName = "credentials";
        String path = "credentials.xlsx";

        try {
            FileInputStream file = new FileInputStream(path);
            XSSFWorkbook workBook = new XSSFWorkbook(file);
            XSSFSheet sheet = workBook.getSheet(SheetName);

            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
                passwords.add(sheet.getRow(i).getCell(1).toString());
            }

        } catch (IOException e) {

            e.printStackTrace();
        }
        return passwords;
    }


    public static boolean compareForEquals(List<WebElement> elements, List<String> stringValues){
        boolean result = false;
        for (int i = 0; i < elements.size(); i++) {

            result = elements.get(i).getText().equals(stringValues.get(i));
            System.out.println(result);
        }

        return result;
    }

}
