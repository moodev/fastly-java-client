package com.moo.cdn.model;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class VCLTest extends AbstractModelTest {

    private VCL vcl;

    @Before
    public void setUp() throws FileNotFoundException {
        super.setUp();
        vcl = gson.fromJson(dataObject.toString(), VCL.class);
    }

    @Override
    protected String getTestDataFile() {
        return "VCL.json";
    }

    @Override
    protected Class getTestClass() {
        return VCL.class;
    }

    @Test
    public void testBasicProperties() {
        assertThat(vcl.getContent(), is(dataObject.get("content").getAsString()));
        assertThat(vcl.getMain(), is(dataObject.get("main").getAsBoolean()));
        assertThat(vcl.getName(), is(dataObject.get("name").getAsString()));
        assertThat(vcl.getServiceId(), is(dataObject.get("service_id").getAsString()));
        assertThat(vcl.getVersion(), is(dataObject.get("version").getAsInt()));
    }
}
