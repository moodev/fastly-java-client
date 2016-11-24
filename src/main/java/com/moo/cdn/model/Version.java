package com.moo.cdn.model;

import com.google.gson.annotations.SerializedName;

/**
 * https://docs.fastly.com/api/config#version
 */
public class Version {

    private Boolean active;

    private Boolean locked;

    private Boolean deployed;

    private Integer number;

    @SerializedName("service_id")
    private String serviceId;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean getDeployed() {
        return deployed;
    }

    public void setDeployed(Boolean deployed) {
        this.deployed = deployed;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
}
