package testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void login(){
        ExtentReports report = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports");
        sparkReporter.config().setReportName("Regression Testing");
        sparkReporter.config().setDocumentTitle("Test Cases");
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setEncoding("utf-8");

        report.attachReporter(sparkReporter);

        ExtentTest test = report.createTest("Login Testing");
        test.log(Status.INFO, "First Test Case");
        test.log(Status.PASS, "Test Passed");
        report.flush();




    }
}
