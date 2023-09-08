package WebdriverUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITest;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersImplementation extends BaseClass implements ITestListener{
//right click-source- override implements methods=select on failure
	@Override
	public void onTestFailure(ITestResult result) {
		String FailedMethod=result.getMethod().getMethodName().toString();
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		String timestamp = "Screenshot"+FailedMethod;
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		File PermanentFile = new File("./Screenshot/"+timestamp+timeStamp+".png");
		try {
			FileHandler.copy(tempFile, PermanentFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
