/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.controllers;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ytel.api.models.*;
import com.ytel.api.exceptions.*;
import com.ytel.api.APIHelper;
import com.ytel.api.Configuration;
import com.ytel.api.testing.TestHelper;
import com.ytel.api.controllers.DedicatedShortCodeController;
import com.ytel.api.controllers.syncwrapper.APICallBackCatcher;

import com.fasterxml.jackson.core.type.TypeReference;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class DedicatedShortCodeControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static DedicatedShortCodeController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getDedicatedShortCode();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * Retrieve a list of Short Code assignment associated with your Ytel account.
     * @throws Throwable
     */
    @Test
    public void testTestListShortcodes() throws Throwable {
        // Parameters for the API call
        String shortcode = null;
        String page = null;
        String pagesize = null;

        // Set callback and perform API call
        String result = null;
        APICallBackCatcher<String> response = new APICallBackCatcher<String>();
        controller.setHttpCallBack(httpResponse);
        controller.createListShortcodesAsync(shortcode, page, pagesize, response);
        result = response.getResult();

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders(), true));

    }

    /**
     * Retrive a list of inbound Sms Short Code messages associated with your Ytel account.
     * @throws Throwable
     */
    @Test
    public void testTestListInboundSMS() throws Throwable {
        // Parameters for the API call
        Integer page = null;
        Integer pagesize = null;
        String from = null;
        String shortcode = null;
        String datecreated = null;

        // Set callback and perform API call
        String result = null;
        APICallBackCatcher<String> response = new APICallBackCatcher<String>();
        controller.setHttpCallBack(httpResponse);
        controller.createListInboundSMSAsync(page, pagesize, from, shortcode, datecreated, response);
        result = response.getResult();

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders(), true));

    }

    /**
     * Retrieve a list of Short Code messages.
     * @throws Throwable
     */
    @Test
    public void testTestListSMS() throws Throwable {
        // Parameters for the API call
        String shortcode = null;
        String to = null;
        String dateSent = null;
        Integer page = null;
        Integer pageSize = null;

        // Set callback and perform API call
        String result = null;
        APICallBackCatcher<String> response = new APICallBackCatcher<String>();
        controller.setHttpCallBack(httpResponse);
        controller.createListSMSAsync(shortcode, to, dateSent, page, pageSize, response);
        result = response.getResult();

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders(), true));

    }

}
