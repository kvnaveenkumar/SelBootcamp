package testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	public boolean retry(ITestResult result) {
		int retryCount=3;
		int startCount=0;
		
		if(!result.isSuccess() && startCount<=retryCount){
			startCount++;
			return true;
		}
		
	
		return false;
	}
	

}
