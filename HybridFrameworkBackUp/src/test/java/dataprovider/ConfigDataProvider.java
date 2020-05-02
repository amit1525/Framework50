package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties prop;
	
	public ConfigDataProvider()
	{	
		String projectPath = System.getProperty("user.dir")+"/Config/myconfig.properties";
		File src = new File(projectPath);
		
		try 
		{
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("<<  File not present  >>"+e.getMessage());
		} catch (IOException e) {
			System.out.println("<<  Unable to read the file  >>"+e.getMessage());
		}
		
	}
	
	
	public String getValue(String key)
	{
		return prop.getProperty(key);
	}
	
	
	public String getBrowser()
	{
		return prop.getProperty("browser");
	}
	
	public String getUrl()
	{
		return prop.getProperty("url");
	}
	
	
	
	
	
	
	
	
	
	

}
