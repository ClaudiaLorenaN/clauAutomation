package com.test.clau.common.manager;

import com.test.clau.common.dataProvider.ConfigFileReader;
import com.test.clau.common.dataProvider.JsonReader;

public class ReaderManager {

    private static ReaderManager readerManager = new ReaderManager();
    private static ConfigFileReader configFileReader;
    private static JsonReader jsonReader;

    private ReaderManager() {
    }

    public static ReaderManager getInstance( ) {
        return readerManager;
    }

    public ConfigFileReader getConfigReader() {
        return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
    }

    public JsonReader getJsonReader(){
        return (jsonReader == null) ? new JsonReader() : jsonReader;
    }
}
