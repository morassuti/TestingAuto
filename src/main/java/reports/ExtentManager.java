package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.util.Date;

public class ExtentManager {

    static ExtentReports report;

    public static ExtentReports getReport() {
        if (report == null){
            report = new ExtentReports();

            // create folders with date format for the reports
            Date d = new Date();
            System.out.println(d.toString().replaceAll(":","-"));
            String repoFolder = d.toString().replaceAll(":","-") + "/screenshots";

            String reportFolderPath = System.getProperty("user.dir")+"//reports//" + d.toString().replaceAll(":","-");
            String screenshotspath = System.getProperty("user.dir")+"//reports//" + repoFolder;
            System.out.println(screenshotspath);
            File f = new File(screenshotspath);
            // create dinamic report folder and screenshots
            f.mkdirs();

        // ExtentSparkReporter to send logs and status to the HTML Report
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportFolderPath);
        sparkReporter.config().setReportName("Regression Testing");
        sparkReporter.config().setDocumentTitle("Test Cases");
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setEncoding("utf-8");

        report.attachReporter(sparkReporter);
    }
    return report;

    }

}
