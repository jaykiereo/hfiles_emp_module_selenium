package com.svi.selenium.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ConfigInitializer {

	private static final String CONFIG_PATH = "config.ini";

	public static void initializeConfig() {
		InputStream configFile = null;
		try {
			configFile = new FileInputStream(new File(CONFIG_PATH));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Config.readConfig(configFile);
	}

	public static void checkConfigParams() throws NullPointerException {
		for (Config config : Config.values()) {
			if (config.getValue().equals("")) {
				throw new NullPointerException();
			}
		}
	}

}
