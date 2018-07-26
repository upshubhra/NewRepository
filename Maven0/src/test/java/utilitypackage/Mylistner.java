package utilitypackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Mylistner implements ITestListener {

	
	ExtentReports r;
	ExtentTest t;
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("test onFinish");
		r.endTest(t);
		r.flush();
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		//System.out.println("test onStart");
		r = new ExtentReports("C:\\Users\\pdc4-training.pdc4\\eclipse-workspace\\Maven0\\src\\test\\java\\utilitypackage\\myreport.html");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("test onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		t.log(LogStatus.FAIL,result.getMethod().getMethodName()+"has FAILED");
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("test onTestSkipped");
		
	}

	@Override
	public void onTestStart(ITestResult result) {
	
		t = r.startTest(result.getMethod().getMethodName()+"has started");
		t.log(LogStatus.INFO,result.getMethod().getMethodName()+"has started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		t.log(LogStatus.PASS,result.getMethod().getMethodName()+"has TEST SUCCESS");
		
	}

}
