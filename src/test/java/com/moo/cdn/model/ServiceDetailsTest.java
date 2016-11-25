//package com.moo.cdn.model;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.FileNotFoundException;
//
//public class ServiceDetailsTest extends AbstractModelTest {
//
//    private ServiceDetails serviceDetails;
//
//    @Before
//    public void setUp() throws FileNotFoundException {
//        super.setUp();
//        serviceDetails = gson.fromJson(dataObject.toString(), ServiceDetails.class);
//    }
//
//    @Override
//    protected String getTestDataFile() {
//        return "ServiceDetails.json";
//    }
//
//    @Override
//    protected Class getTestClass() {
//        return ServiceDetails.class;
//    }
//
//    @Test
//    public void testBasicProperties() {
//        //assertThat(serviceDetails.getStaging(), is(serviceDataObject.get("staging").getAsBoolean()));
//        //assertThat(serviceDetails.getTesting(), is(serviceDataObject.get("testing").getAsBoolean()));
//    }
//}
