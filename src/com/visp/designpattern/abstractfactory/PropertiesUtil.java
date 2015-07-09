package com.visp.designpattern.abstractfactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	private static PropertiesUtil instance;

	private PropertiesUtil() {
		super();
	}

	public static PropertiesUtil getInstance() {
		if (instance == null) {
			instance = new PropertiesUtil();
		}

		return instance;
	}

	public Properties getProperties(String fileName) {
		InputStream inputStream = getClass().getClassLoader()
				.getResourceAsStream(fileName);
		
		Properties properties = new Properties();

		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
					inputStream = null;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return properties;
	}

	public String getProperty(String fileName, String key) {
		return getProperties(fileName).getProperty(key);
	}
}
