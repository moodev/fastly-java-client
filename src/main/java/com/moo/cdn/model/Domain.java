package com.moo.cdn.model;

import com.google.gson.annotations.SerializedName;

/**
 * https://docs.fastly.com/api/config#domain
 */
public class Domain {

    private String comment;

    private String name;

    @SerializedName("service_id")
    private String serviceId;

    private Integer version;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
