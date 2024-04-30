package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class MyTestListener implements ITestListener {
	private ExtentReports extent = ExtentReportManager.getInstance();
	private ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.pass("Test passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail("Test failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.skip("Test skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
