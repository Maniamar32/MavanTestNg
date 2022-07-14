package ListenersExamples;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("test is Starting:"+result.getName());	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test is Success:"+result.getName());	

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test is Failure:"+result.getName());	

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test is Skipped:"+result.getName());	

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("All Tests are started:"+context.getName());	

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("All Tests are Finished:"+context.getName());	

	}

}
