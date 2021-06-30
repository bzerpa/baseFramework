package config;

public class ConfigDictionary {

	private static ConfigDictionary instance = null;

	public static synchronized ConfigDictionary getInstance() {
	    if (instance == null) {
	        instance = new ConfigDictionary();
	    }
	    return instance;
	}
	
}
