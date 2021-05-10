/*
 * Ory Kratos API
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.6.0-alpha.9
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
import sh.ory.kratos.model.PluginConfigArgs;
import sh.ory.kratos.model.PluginConfigInterface;
import sh.ory.kratos.model.PluginConfigLinux;
import sh.ory.kratos.model.PluginConfigNetwork;
import sh.ory.kratos.model.PluginConfigRootfs;
import sh.ory.kratos.model.PluginConfigUser;
import sh.ory.kratos.model.PluginEnv;
import sh.ory.kratos.model.PluginMount;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for PluginConfig
 */
public class PluginConfigTest {
    private final PluginConfig model = new PluginConfig();

    /**
     * Model tests for PluginConfig
     */
    @Test
    public void testPluginConfig() {
        // TODO: test PluginConfig
    }

    /**
     * Test the property 'args'
     */
    @Test
    public void argsTest() {
        // TODO: test args
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'dockerVersion'
     */
    @Test
    public void dockerVersionTest() {
        // TODO: test dockerVersion
    }

    /**
     * Test the property 'documentation'
     */
    @Test
    public void documentationTest() {
        // TODO: test documentation
    }

    /**
     * Test the property 'entrypoint'
     */
    @Test
    public void entrypointTest() {
        // TODO: test entrypoint
    }

    /**
     * Test the property 'env'
     */
    @Test
    public void envTest() {
        // TODO: test env
    }

    /**
     * Test the property '_interface'
     */
    @Test
    public void _interfaceTest() {
        // TODO: test _interface
    }

    /**
     * Test the property 'ipcHost'
     */
    @Test
    public void ipcHostTest() {
        // TODO: test ipcHost
    }

    /**
     * Test the property 'linux'
     */
    @Test
    public void linuxTest() {
        // TODO: test linux
    }

    /**
     * Test the property 'mounts'
     */
    @Test
    public void mountsTest() {
        // TODO: test mounts
    }

    /**
     * Test the property 'network'
     */
    @Test
    public void networkTest() {
        // TODO: test network
    }

    /**
     * Test the property 'pidHost'
     */
    @Test
    public void pidHostTest() {
        // TODO: test pidHost
    }

    /**
     * Test the property 'propagatedMount'
     */
    @Test
    public void propagatedMountTest() {
        // TODO: test propagatedMount
    }

    /**
     * Test the property 'user'
     */
    @Test
    public void userTest() {
        // TODO: test user
    }

    /**
     * Test the property 'workDir'
     */
    @Test
    public void workDirTest() {
        // TODO: test workDir
    }

    /**
     * Test the property 'rootfs'
     */
    @Test
    public void rootfsTest() {
        // TODO: test rootfs
    }

}
