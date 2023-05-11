package testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reports.ExtentManager;

public class StartReports {
    ExtentTest test;
    ExtentReports report;

    @BeforeMethod
    public void init(){
        report = ExtentManager.getReport();
        test = report.createTest("Validate Testing");
    }

    @AfterMethod
    public void quit() {
        report.flush();
    }

    @Test
    public void doReports(){
        test.log(Status.INFO, "Second Test Case");
        test.log(Status.PASS, "Test Passed");
    }
}
