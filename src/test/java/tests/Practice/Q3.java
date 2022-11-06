package tests.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Q3 extends TestBase {
    /*
- go to url : https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/
- Task 1 - Find Dropdown on Multi Selection
- Task 2 - Find all Dropdown Elements
- Task 3 - Printout Dropdown Elements' number
- Task 4 - Choose all Dropdown elements and printout Dropdown elements' name on Multi Selection
- Task 5 - Check until choice 6
 */

    @Test
    public void test01(){

        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

        WebElement drop= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        Select select=new Select(drop);
        System.out.println();

    }
}
