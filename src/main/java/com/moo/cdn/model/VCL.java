package com.moo.cdn.model;

import com.google.gson.annotations.SerializedName;

/**
 * https://docs.fastly.com/api/config#VCL
 */
public class VCL {

    private String content;

    private Boolean main;

    private String name;

    @SerializedName("service_id")
    private String serviceId;

    private Integer version;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getMain() {
        return main;
    }

    public void setMain(Boolean main) {
        this.main = main;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
