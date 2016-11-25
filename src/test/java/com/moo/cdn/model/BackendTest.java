package com.moo.cdn.model;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BackendTest extends AbstractModelTest {

    private Backend backend;

    @Before
    public void setUp() throws FileNotFoundException {
        super.setUp();
        backend = gson.fromJson(dataObject.toString(), Backend.class);
    }

    @Override
    protected String getTestDataFile() {
        return "Backend.json";
    }

    @Override
    protected Class getTestClass() {
        return Backend.class;
    }

    @Test
    public void testBasicProperties() {
        assertThat(backend.getAddress(), is(dataObject.get("address").getAsString()));
        assertThat(backend.getAutoLoadBalance(), is(dataObject.get("auto_loadbalance").getAsBoolean()));
        assertThat(backend.getBetweenBytesTimeout(), is(dataObject.get("between_bytes_timeout").getAsInt()));
        assertThat(backend.getClientCert(), is(dataObject.get("client_cert").getAsString()));
        assertThat(backend.getComment(), is(dataObject.get("comment").getAsString()));
        assertThat(backend.getConnectionTimeout(), is(dataObject.get("connect_timeout").getAsInt()));
        assertThat(backend.getErrorThreshold(), is(dataObject.get("error_threshold").getAsInt()));
        assertThat(backend.getFirstByteTimeout(), is(dataObject.get("first_byte_timeout").getAsInt()));
        assertThat(backend.getHealthcheck(), is(dataObject.get("healthcheck").getAsString()));
        assertThat(backend.getHostname(), is(dataObject.get("hostname").getAsString()));
        assertThat(backend.getIpv4(), is(dataObject.get("ipv4").getAsString()));
        assertThat(backend.getIpv6(), is(dataObject.get("ipv6").getAsString()));
        assertThat(backend.getLocked(), is(dataObject.get("locked").getAsBoolean()));
        assertThat(backend.getMaxConn(), is(dataObject.get("max_conn").getAsInt()));
        assertThat(backend.getMaxTlsVersion(), is(dataObject.get("max_tls_version").getAsInt()));
        assertThat(backend.getMinTlsVersion(), is(dataObject.get("min_tls_version").getAsInt()));
        assertThat(backend.getName(), is(dataObject.get("name").getAsString()));
        assertThat(backend.getPort(), is(dataObject.get("port").getAsInt()));
        assertThat(backend.getRequestCondition(), is(dataObject.get("request_condition").getAsString()));
        assertThat(backend.getServiceId(), is(dataObject.get("service_id").getAsString()));
        assertThat(backend.getShield(), is(dataObject.get("shield").getAsString()));
        assertThat(backend.getSslCaCert(), is(dataObject.get("ssl_ca_cert").getAsString()));
        assertThat(backend.getSslCertHostname(), is(dataObject.get("ssl_cert_hostname").getAsString()));
        assertThat(backend.getSslCheckCert(), is(dataObject.get("ssl_check_cert").getAsString()));
        assertThat(backend.getSslCiphers(), is(dataObject.get("ssl_ciphers").getAsString()));
        assertThat(backend.getSslClientCert(), is(dataObject.get("ssl_client_cert").getAsString()));
        assertThat(backend.getSslClientKey(), is(dataObject.get("ssl_client_key").getAsString()));
        assertThat(backend.getSslHostname(), is(dataObject.get("ssl_hostname").getAsString()));
        assertThat(backend.getSslSniHostname(), is(dataObject.get("ssl_sni_hostname").getAsString()));
        assertThat(backend.getUseSSl(), is(dataObject.get("use_ssl").getAsBoolean()));
        assertThat(backend.getVersion(), is(dataObject.get("version").getAsInt()));
        assertThat(backend.getWeight(), is(dataObject.get("weight").getAsInt()));
    }

}
