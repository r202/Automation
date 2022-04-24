package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property {
	
	
	Properties prop=new Properties();
	public String propertyfile(String propertykey) throws IOException
	{
	FileInputStream fis=new FileInputStream("C:\\Users\\Nothing\\eclipse-workspace\\appium\\config.properties");
	prop.load(fis);
	String enhance= prop.getProperty(propertykey);
	return enhance;
	
	}

}
