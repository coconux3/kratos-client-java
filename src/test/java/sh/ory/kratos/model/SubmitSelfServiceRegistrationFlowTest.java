/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.6.0-alpha.8
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import sh.ory.kratos.model.SubmitSelfServiceRegistrationFlowWithPasswordMethod;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for SubmitSelfServiceRegistrationFlow
 */
public class SubmitSelfServiceRegistrationFlowTest {
    private final SubmitSelfServiceRegistrationFlow model = new SubmitSelfServiceRegistrationFlow();

    /**
     * Model tests for SubmitSelfServiceRegistrationFlow
     */
    @Test
    public void testSubmitSelfServiceRegistrationFlow() {
        // TODO: test SubmitSelfServiceRegistrationFlow
    }

    /**
     * Test the property 'csrfToken'
     */
    @Test
    public void csrfTokenTest() {
        // TODO: test csrfToken
    }

    /**
     * Test the property 'method'
     */
    @Test
    public void methodTest() {
        // TODO: test method
    }

    /**
     * Test the property 'password'
     */
    @Test
    public void passwordTest() {
        // TODO: test password
    }

    /**
     * Test the property 'traits'
     */
    @Test
    public void traitsTest() {
        // TODO: test traits
    }

}
