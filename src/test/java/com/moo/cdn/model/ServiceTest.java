package com.moo.cdn.model;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.text.ParseException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class ServiceTest extends AbstractModelTest {

    private Service service;

    @Before
    public void setUp() throws FileNotFoundException {
        super.setUp();
        service = gson.fromJson(dataObject.toString(), Service.class);
    }

    @Test
    public void testBasicProperties() throws ParseException {
        assertThat(service.getComment(), is(dataObject.get("comment").getAsString()));
        assertThat(service.getCreatedAt(), is(dateFormat.parse(dataObject.get("created_at").getAsString())));
        assertThat(service.getCustomerId(), is(dataObject.get("customer_id").getAsString()));
        assertThat(service.getDeletedAt(), is(dateFormat.parse(dataObject.get("deleted_at").getAsString())));
        assertThat(service.getId(), is(dataObject.get("id").getAsString()));
        assertThat(service.getName(), is(dataObject.get("name").getAsString()));
        assertThat(service.getPublishKey(), is(dataObject.get("publish_key").getAsString()));
        assertThat(service.getUpdatedAt(), is(dateFormat.parse(dataObject.get("updated_at").getAsString())));
    }

    @Test
    public void  testGetVersions() {
        assertNotNull(service.getVersions());
        String serviceIdFirstVersion = dataObject.get("versions").getAsJsonArray().get(0).getAsJsonObject().get("service_id").getAsString();
        assertThat(service.getVersions().get(0).getServiceId(), is(serviceIdFirstVersion));
    }

    @Override
    protected String getTestDataFile() {
        return "Service.json";
    }

    @Override
    protected Class getTestClass() {
        return Service.class;
    }
}
