package com.visp.designpattern.abstractfactory;

public class Factory {
	private static final String PACKAGE_NAME = "com.visp.designpattern.abstractfactory";
	private static final String CONFIG_NAME = "db.properties";
	// private static final String DB_NAME = "SqlServer";

	public static IUser createUser() {
		String className = PACKAGE_NAME
				+ "."
				+ PropertiesUtil.getInstance().getProperty(CONFIG_NAME,
						"DBName") + "User";

		try {
			return (IUser) Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static IDepartment createDepartment() {
		String className = PACKAGE_NAME
				+ "."
				+ PropertiesUtil.getInstance().getProperty(CONFIG_NAME,
						"DBName") + "Department";

		try {
			return (IDepartment) Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}
}
