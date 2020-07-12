package com.INDBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		File src= new File("./Configuration/config.properties");
		
		
			try {
				FileInputStream fis= new FileInputStream(src);
				pro= new Properties();
				pro.load(fis);
			
			} catch (Exception e) {
				
				System.out.println("Exception is " + e.getMessage());
			}
		
				
	}
	
	public String getApplicationURL()
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserName()
	{
		String username= pro.getProperty("baseUsername");
		return username;
	}
	
	public String getPassword()
	{
		String Password = pro.getProperty("basePassword");
		return Password;
	}
	
	public String getChromePath()
	{
		String Chromepath = pro.getProperty("chromepath");
		return Chromepath;
	}
	
	public String getFirefoxPath()
	{
		String geFiefoxPath = pro.getProperty("firefox");
		return geFiefoxPath;
	}
}
