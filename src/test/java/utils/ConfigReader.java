package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private static final String FILE_PATH = "config.properties";

	public static Properties loadProperties() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/" + FILE_PATH);
		Properties prop = new Properties();
		prop.load(fis);
		return prop;
	}
}
