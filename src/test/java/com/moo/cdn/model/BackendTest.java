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

public class BackendTest {

    private JsonObject backendDataObject;
    private Backend backend;

    @Before
    public void setUp() throws FileNotFoundException {
        JsonParser parser = new JsonParser();
        URL url = getClass().getResource("Backend.json");
        FileReader data = new FileReader(url.getPath());
        backendDataObject = parser.parse(data).getAsJsonObject();
        String backendDataString = backendDataObject.toString();

        Gson gson = new GsonBuilder().create();

        backend = gson.fromJson(backendDataString, Backend.class);
    }

    @Test
    public void testBasicProperties() {
        assertThat(backend.getAddress(), is(backendDataObject.get("address").getAsString()));
        assertThat(backend.getName(), is(backendDataObject.get("name").getAsString()));
        assertThat(backend.getPort(), is(backendDataObject.get("port").getAsInt()));
        assertThat(backend.getVersion(), is(backendDataObject.get("version").getAsInt()));
    }

}
