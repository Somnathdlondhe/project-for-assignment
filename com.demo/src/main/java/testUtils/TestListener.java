package testUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseTest;


public class TestListener extends BaseTest implements ITestListener {
	
	  
	  // Capture screenshot on test failure
	  @Override
	    public void onTestFailure(ITestResult result) {
	      TakesScreenshot ts=  (TakesScreenshot)driver; 
	      File source =ts.getScreenshotAs(OutputType.FILE);
	      File destination=new File("C:\\Users\\w135220\\eclipse-workspace\\com.demo\\test-output\\snaps" + result.getName() + ".png");
	      try {
	            Files.copy(source.toPath(), destination.toPath());
	            System.out.println("Screenshot taken: " + destination.getAbsolutePath());
	        } catch (IOException e) {
	            System.out.println("Failed to save screenshot: " + e.getMessage());
	        }
		  
	       

}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	  


}