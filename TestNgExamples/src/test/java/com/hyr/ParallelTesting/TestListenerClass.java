package com.hyr.ParallelTesting;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListenerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test is starting   "+result.getName());
		
			}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test is success   "+result.getName());
		}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test is Failure   "+result.getName());
			}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test is skipped  "+result.getName());
			}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("all tests are  started "+context.getName());
		}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("all tests are finished "+context.getName());

			}

}
