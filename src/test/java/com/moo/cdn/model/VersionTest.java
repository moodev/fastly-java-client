package com.moo.cdn.model;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.text.ParseException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class VersionTest extends AbstractModelTest {

    private Version version;

    @Before
    public void setUp() throws FileNotFoundException {
        super.setUp();
        version = gson.fromJson(dataObject.toString(), Version.class);
    }

    protected String getTestDataFile() {
        return "Version.json";
    }

    protected Class getTestClass() {
        return Version.class;
    }

    @Test
    public void testBasicProperties() throws ParseException {
        assertThat(version.getActive(), is(dataObject.get("active").getAsBoolean()));
        assertThat(version.getComment(), is(dataObject.get("comment").getAsString()));
        assertThat(version.getCreatedAt(), is(dateFormat.parse(dataObject.get("created_at").getAsString())));
        assertThat(version.getDeletedAt(), is(dateFormat.parse(dataObject.get("deleted_at").getAsString())));
        assertThat(version.getDeployed(), is(dataObject.get("deployed").getAsBoolean()));
        assertThat(version.getLocked(), is(dataObject.get("locked").getAsBoolean()));
        assertThat(version.getNumber(), is(dataObject.get("number").getAsInt()));
        assertThat(version.getServiceId(), is(dataObject.get("service_id").getAsString()));
        assertThat(version.getStaging(), is(dataObject.get("staging").getAsBoolean()));
        assertThat(version.getStaging(), is(dataObject.get("staging").getAsBoolean()));
        assertThat(version.getUpdatedAt(), is(dateFormat.parse(dataObject.get("updated_at").getAsString())));
    }

}
