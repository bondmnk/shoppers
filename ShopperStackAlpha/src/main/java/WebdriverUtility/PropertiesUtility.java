package WebdriverUtility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility {

	public String propertiesFile(String key) throws Throwable
	{
		File file =new File("./src/main/resources/TestData/testdatalogin.properties");
		FileInputStream fis =new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fis);
		String value = properties.getProperty(key);
		return value;
		}
}
