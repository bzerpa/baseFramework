package com.myproject.utilities;

import java.io.FileInputStream;
import java.io.IOException;

public class ConfigDictionary {
//
//    public final String FILE_SEPARATOR_PROPERTY = "file.separator";
//    public final String USER_PROPERTY = "users";
//    public final String CONFIG_PROPERTY = "config";
//    private UsersProperties usersProperties;
//    private ConfigProperties configProperties;
//
//    // Singleton Instance
//    private static ConfigDictionary instance = null;
//
//    public static synchronized ConfigDictionary getInstance() {
//        if (instance == null) {
//            instance = new ConfigDictionary();
//        }
//        return instance;
//    }
//
//    private ConfigDictionary() {
//        try {
//            // Initialize Properties
//            usersProperties = new UsersProperties();
//            configProperties = new ConfigProperties();
//
//            String user = System.getProperty(USER_PROPERTY);
//            String config = System.getProperty(CONFIG_PROPERTY);
//
//            // Load Properties from files
//            String fileUsersName = user + "-config.properties";
//            String fileApiName = config + "-config.properties";
//
//            // Open the File and parse all the config values from project dir
//            String fileSeparator = System.getProperty(FILE_SEPARATOR_PROPERTY);
//            String absUserpath = "resources" + fileSeparator + "users";
//            String absConfigpath = "resources" + fileSeparator + "config";
//            FileInputStream in;
//
//            in = new FileInputStream(absUserpath + fileSeparator + fileUsersName);
//            usersProperties.load(in);
//            in.close();
//            in = new FileInputStream(absConfigpath + fileSeparator + fileApiName);
//            configProperties.load(in);
//            in.close();
//        } catch (IOException e) {
//
//            e.printStackTrace();
//        }
//
//    }
//
//    public UsersProperties getUsersProperties() {
//        return usersProperties;
//    }
//
//    public ConfigProperties getConfigProperties() {
//        return configProperties;
//    }

}
