package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

	private static ExtentReports extent;
	private static ExtentSparkReporter spark;

	public static ExtentReports getInstance() {
		if (extent == null) {
			extent = new ExtentReports();
			spark = new ExtentSparkReporter("test-output/extent-report.html");
			extent.attachReporter(spark);
		}
		return extent;
	}
}
