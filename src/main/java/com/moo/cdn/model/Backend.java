package com.moo.cdn.model;

import com.google.gson.annotations.SerializedName;

/**
 * https://docs.fastly.com/api/config#backend
 */
public class Backend {

    private String address;

    @SerializedName("auto_loadbalance")
    private Boolean autoLoadBalance;

    @SerializedName("between_bytes_timeout")
    private Integer betweenBytesTimeout;

    @SerializedName("client_cert")
    private String clientCert;

    private String comment;

    @SerializedName("connect_timeout")
    private Integer connectionTimeout;

    @SerializedName("error_threshold")
    private Integer errorThreshold;

    @SerializedName("first_byte_timeout")
    private Integer firstByteTimeout;

    private String healthcheck;

    private String hostname;

    private String ipv4;

    private String ipv6;

    private Boolean locked;

    @SerializedName("max_conn")
    private Integer maxConn;

    @SerializedName("max_tls_version")
    private Integer maxTlsVersion;

    @SerializedName("min_tls_version")
    private Integer minTlsVersion;

    private String name;

    private Integer port;

    @SerializedName("request_condition")
    private String requestCondition;

    @SerializedName("service_id")
    private String serviceId;

    private String shield;

    @SerializedName("ssl_ca_cert")
    private String sslCaCert;

    @SerializedName("ssl_cert_hostname")
    private String sslCertHostname;


    @SerializedName("ssl_check_cert")
    private String sslCheckCert;

    @SerializedName("ssl_ciphers")
    private String sslCiphers;

    @SerializedName("ssl_client_cert")
    private String sslClientCert;

    @SerializedName("ssl_client_key")
    private String sslClientKey;

    @SerializedName("ssl_hostname")
    private String sslHostname;

    @SerializedName("ssl_sni_hostname")
    private String sslSniHostname;

    @SerializedName("use_ssl")
    private Boolean useSSl;

    private Integer version;

    private Integer weight;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getAutoLoadBalance() {
        return autoLoadBalance;
    }

    public void setAutoLoadBalance(Boolean autoLoadBalance) {
        this.autoLoadBalance = autoLoadBalance;
    }

    public Integer getBetweenBytesTimeout() {
        return betweenBytesTimeout;
    }

    public void setBetweenBytesTimeout(Integer betweenBytesTimeout) {
        this.betweenBytesTimeout = betweenBytesTimeout;
    }

    public String getClientCert() {
        return clientCert;
    }

    public void setClientCert(String clientCert) {
        this.clientCert = clientCert;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public Integer getErrorThreshold() {
        return errorThreshold;
    }

    public void setErrorThreshold(Integer errorThreshold) {
        this.errorThreshold = errorThreshold;
    }

    public Integer getFirstByteTimeout() {
        return firstByteTimeout;
    }

    public void setFirstByteTimeout(Integer firstByteTimeout) {
        this.firstByteTimeout = firstByteTimeout;
    }

    public String getHealthcheck() {
        return healthcheck;
    }

    public void setHealthcheck(String healthcheck) {
        this.healthcheck = healthcheck;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getIpv4() {
        return ipv4;
    }

    public void setIpv4(String ipv4) {
        this.ipv4 = ipv4;
    }

    public String getIpv6() {
        return ipv6;
    }

    public void setIpv6(String ipv6) {
        this.ipv6 = ipv6;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Integer getMaxConn() {
        return maxConn;
    }

    public void setMaxConn(Integer maxConn) {
        this.maxConn = maxConn;
    }

    public Integer getMaxTlsVersion() {
        return maxTlsVersion;
    }

    public void setMaxTlsVersion(Integer maxTlsVersion) {
        this.maxTlsVersion = maxTlsVersion;
    }

    public Integer getMinTlsVersion() {
        return minTlsVersion;
    }

    public void setMinTlsVersion(Integer minTlsVersion) {
        this.minTlsVersion = minTlsVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getRequestCondition() {
        return requestCondition;
    }

    public void setRequestCondition(String requestCondition) {
        this.requestCondition = requestCondition;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getShield() {
        return shield;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

    public String getSslCaCert() {
        return sslCaCert;
    }

    public void setSslCaCert(String sslCaCert) {
        this.sslCaCert = sslCaCert;
    }

    public String getSslCertHostname() {
        return sslCertHostname;
    }

    public void setSslCertHostname(String sslCertHostname) {
        this.sslCertHostname = sslCertHostname;
    }

    public String getSslCheckCert() {
        return sslCheckCert;
    }

    public void setSslCheckCert(String sslCheckCert) {
        this.sslCheckCert = sslCheckCert;
    }

    public String getSslCiphers() {
        return sslCiphers;
    }

    public void setSslCiphers(String sslCiphers) {
        this.sslCiphers = sslCiphers;
    }

    public String getSslClientCert() {
        return sslClientCert;
    }

    public void setSslClientCert(String sslClientCert) {
        this.sslClientCert = sslClientCert;
    }

    public String getSslClientKey() {
        return sslClientKey;
    }

    public void setSslClientKey(String sslClientKey) {
        this.sslClientKey = sslClientKey;
    }

    public String getSslHostname() {
        return sslHostname;
    }

    public void setSslHostname(String sslHostname) {
        this.sslHostname = sslHostname;
    }

    public String getSslSniHostname() {
        return sslSniHostname;
    }

    public void setSslSniHostname(String sslSniHostname) {
        this.sslSniHostname = sslSniHostname;
    }

    public Boolean getUseSSl() {
        return useSSl;
    }

    public void setUseSSl(Boolean useSSl) {
        this.useSSl = useSSl;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
