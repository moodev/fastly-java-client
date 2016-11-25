package com.moo.cdn.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.moo.cdn.FastlyApiBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

abstract class AbstractModelTest {

    protected JsonObject dataObject;
    protected Gson gson;
    protected DateFormat dateFormat;

    @Before
    public void setUp() throws FileNotFoundException {
        JsonParser parser = new JsonParser();
        URL url = getClass().getResource(getTestDataFile());
        FileReader data = new FileReader(url.getPath());
        dataObject = parser.parse(data).getAsJsonObject();
        gson = new GsonBuilder().setDateFormat(FastlyApiBuilder.GMT_DATE_FORMAT).create();
        dateFormat = new SimpleDateFormat(FastlyApiBuilder.GMT_DATE_FORMAT);
    }

    @Test
    public void testCorrectNumberOfGettersAndSetters() {
        assertThat(getTestClass().getDeclaredMethods().length, is(dataObject.getAsJsonObject().entrySet().size() * 2));
    }

    protected abstract String getTestDataFile();

    protected abstract Class getTestClass();

}
