/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.6.0-alpha.16
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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import sh.ory.kratos.model.RecoveryAddress;
import sh.ory.kratos.model.VerifiableAddress;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for Identity
 */
public class IdentityTest {
    private final Identity model = new Identity();

    /**
     * Model tests for Identity
     */
    @Test
    public void testIdentity() {
        // TODO: test Identity
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'recoveryAddresses'
     */
    @Test
    public void recoveryAddressesTest() {
        // TODO: test recoveryAddresses
    }

    /**
     * Test the property 'schemaId'
     */
    @Test
    public void schemaIdTest() {
        // TODO: test schemaId
    }

    /**
     * Test the property 'schemaUrl'
     */
    @Test
    public void schemaUrlTest() {
        // TODO: test schemaUrl
    }

    /**
     * Test the property 'traits'
     */
    @Test
    public void traitsTest() {
        // TODO: test traits
    }

    /**
     * Test the property 'test'
     */
    @Test
    public void testTest() {
        // TODO: test test
    }

    /**
     * Test the property 'verifiableAddresses'
     */
    @Test
    public void verifiableAddressesTest() {
        // TODO: test verifiableAddresses
    }

}
