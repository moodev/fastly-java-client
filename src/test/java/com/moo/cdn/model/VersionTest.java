package com.moo.cdn.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class VersionTest {

    private JsonObject versionDataObject;
    private Version version;

    @Before
    public void setUp() throws FileNotFoundException {
        JsonParser parser = new JsonParser();
        URL url = getClass().getResource("Version.json");
        FileReader data = new FileReader(url.getPath());
        versionDataObject = parser.parse(data).getAsJsonObject();
        String versionDataString = versionDataObject.toString();

        Gson gson = new GsonBuilder().create();

        version = gson.fromJson(versionDataString, Version.class);
    }

    @Test
    public void testBasicProperties() {
        assertThat(version.getActive(), is(versionDataObject.get("active").getAsBoolean()));
        //assertThat(version.getDeployed(), is(versionDataObject.get("deployed").getAsBoolean()));
        //assertThat(version.getLocked(), is(versionDataObject.get("locked").getAsBoolean()));
        assertThat(version.getNumber(), is(versionDataObject.get("number").getAsInt()));
        assertThat(version.getServiceId(), is(versionDataObject.get("service_id").getAsString()));
    }

}
