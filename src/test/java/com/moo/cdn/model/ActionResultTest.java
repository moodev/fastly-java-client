package com.moo.cdn.model;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ActionResultTest extends AbstractModelTest {

    private ActionResult actionResult;

    @Before
    public void setUp() throws FileNotFoundException {
        super.setUp();
        actionResult =  gson.fromJson(dataObject.toString(), ActionResult.class);
    }

    @Override
    protected String getTestDataFile() {
        return "ActionResult.json";
    }

    @Override
    protected Class getTestClass() {
        return ActionResult.class;
    }

    @Test
    public void testBasicProperties() {
        assertThat(actionResult.getStatus(), is(Status.valueOf(dataObject.get("status").getAsString())));
    }
}
