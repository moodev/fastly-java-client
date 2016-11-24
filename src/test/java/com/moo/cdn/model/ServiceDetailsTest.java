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

public class ServiceDetailsTest {

    private JsonObject serviceDataObject;
    private ServiceDetails serviceDetails;

    @Before
    public void setUp() throws FileNotFoundException {
        JsonParser parser = new JsonParser();
        URL url = getClass().getResource("ServiceDetails.json");
        FileReader data = new FileReader(url.getPath());
        serviceDataObject = parser.parse(data).getAsJsonObject();
        String serviceDataString = serviceDataObject.toString();

        Gson gson = new GsonBuilder().create();

        serviceDetails = gson.fromJson(serviceDataString, ServiceDetails.class);
    }

    @Test
    public void testBasicProperties() {
        //assertThat(serviceDetails.getStaging(), is(serviceDataObject.get("staging").getAsBoolean()));
        //assertThat(serviceDetails.getTesting(), is(serviceDataObject.get("testing").getAsBoolean()));
    }
}
