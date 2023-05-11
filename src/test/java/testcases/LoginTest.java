package testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reports.ExtentManager;


public class LoginTest {
    private ExtentTest test;
    private ExtentReports report;

    @BeforeMethod
    public void init(){
        report = ExtentManager.getReport();
        test = report.createTest("Login Testing");
    }

    @Test
    public void login(){
        test.log(Status.INFO, "First Test Case");
        test.log(Status.PASS, "Test Passed");
        //test.addScreenCaptureFromPath("","");
    }
}
