package com.myproject.utilities;

import java.util.Properties;

@SuppressWarnings("serial")
public class ConfigProperties extends Properties {

    private final String BASE_URL = "baseUrl";
    private final String SERVER_URL = "serverUrl";
    private final String CHROME_PATH = "chromepath";
	private final String FIREFOX_PATH = "firefoxpath";
	private final String SAFARI_PATH = "safaripath";
	
    public String getConfigValue(String key) {
        String property = this.getProperty(key);
        if (property == null) {
            System.out.println("Sorry, unable to find " + key);
        }
        return property;
    }

    public String getBaseUrl() {
        return getConfigValue(BASE_URL);
    }
    
    public String getServerUrl() {
    	return getConfigValue(SERVER_URL);
    }
    
    public String getChromeDriverPath() {
    	return getConfigValue(CHROME_PATH);
    }
    
    public String getFirefoxDriverPath() {
    	return getConfigValue(FIREFOX_PATH);
    }
    
    public String getSafariDriverPath() {
    	return getConfigValue(SAFARI_PATH);
    }
}
