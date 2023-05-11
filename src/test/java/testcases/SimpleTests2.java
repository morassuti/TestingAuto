package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SimpleTests2 {

    @Test
    public void validate() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Test2", "Test1");
        softAssert.assertEquals("Test1", "Test1");
        softAssert.assertTrue(5 > 11, "Error Message");
        softAssert.assertAll();
    }
}
