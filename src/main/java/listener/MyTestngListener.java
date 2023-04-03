package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestngListener implements ITestListener {

    public void onTestFailure(ITestResult result){
        System.out.println("FAILED");
        System.out.println(result.getName());
        System.out.println(result.getStatus());
        System.out.println(result.getThrowable().getMessage());

    }
    public void onTestSuccess(ITestResult result) {
        System.out.println("PASSED  " + result.getName());
    }

}
