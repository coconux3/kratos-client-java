/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.7.3-alpha.8
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
import java.time.OffsetDateTime;
import java.util.UUID;
import sh.ory.kratos.model.Identity;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for Session
 */
public class SessionTest {
    private final Session model = new Session();

    /**
     * Model tests for Session
     */
    @Test
    public void testSession() {
        // TODO: test Session
    }

    /**
     * Test the property 'active'
     */
    @Test
    public void activeTest() {
        // TODO: test active
    }

    /**
     * Test the property 'authenticatedAt'
     */
    @Test
    public void authenticatedAtTest() {
        // TODO: test authenticatedAt
    }

    /**
     * Test the property 'expiresAt'
     */
    @Test
    public void expiresAtTest() {
        // TODO: test expiresAt
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'identity'
     */
    @Test
    public void identityTest() {
        // TODO: test identity
    }

    /**
     * Test the property 'issuedAt'
     */
    @Test
    public void issuedAtTest() {
        // TODO: test issuedAt
    }

}
