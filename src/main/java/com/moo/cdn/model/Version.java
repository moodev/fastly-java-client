package com.moo.cdn.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * https://docs.fastly.com/api/config#version
 */
public class Version {

    private Boolean active;

    private String comment;

    @SerializedName("created_at")
    private Date createdAt;

    @SerializedName("deleted_at")
    private Date deletedAt;

    private Boolean deployed;

    private Boolean locked;

    private Integer number;

    @SerializedName("service_id")
    private String serviceId;

    private Boolean staging;

    private Boolean testing;

    @SerializedName("updated_at")
    private Date updatedAt;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Boolean getDeployed() {
        return deployed;
    }

    public void setDeployed(Boolean deployed) {
        this.deployed = deployed;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
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

    public Boolean getStaging() {
        return staging;
    }

    public void setStaging(Boolean staging) {
        this.staging = staging;
    }

    public Boolean getTesting() {
        return testing;
    }

    public void setTesting(Boolean testing) {
        this.testing = testing;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
