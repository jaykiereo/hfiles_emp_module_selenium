package com.svi.selenium.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public enum Config {
	BROWSER("BROWSER"),
	URL("URL"),
	USERNAME("USERNAME"),
	PASSWORD("PASSWORD"),
	EMAIL("EMAIL"),
	COMPANY("COMPANY"),
	EMP_NUMBER("EMP_NUMBER"),
	LAST_NAME("LAST_NAME"),
	FIRST_NAME("FIRST_NAME"),
	JOB_TITLE("JOB_TITLE"),
	SALARY_LEVEL("SALARY_LEVEL"),
	EMP_STATUS("EMP_STATUS"),
	PRI_COMP_EMAIL_ADDRESS("PRI_COMP_EMAIL_ADDRESS"),
	SEARCH("SEARCH"),
	SEARCH_DEPARTMENT("SEARCH_DEPARTMENT"),
	SEARCH_STATION("SEARCH_STATION"),
	SEARCH_EMP_NUMBER("SEARCH_EMP_NUMBER"),
	SEARCH_FIRST_NAME("SEARCH_FIRST_NAME"),
	SEARCH_LAST_NAME("SEARCH_LAST_NAME"),
	SEARCH_MIDDLE_NAME("SEARCH_MIDDLE_NAME"),
	SEARCH_POSITION("SEARCH_POSITION"),
	SEARCH_SG("SEARCH_SG"),
	SEARCH_EMP_STATUS("SEARCH_EMP_STATUS"),
	TEMPLATE_PATH("TEMPLATE_PATH");

	private String value;
	private static Properties properties;

	private Config(String value) {
		this.value = value;
	}

	
	public String getValue() {
		if (properties.containsKey(value)) {
			return properties.getProperty(value).trim();
		}
		return "";
	}

	public static void readConfig(InputStream inputStream) {
		if (inputStream != null) {
			try {
				properties = new Properties();
				properties.load(inputStream);
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
				try {
					inputStream.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

}