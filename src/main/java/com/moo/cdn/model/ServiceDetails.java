package com.moo.cdn.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * https://docs.fastly.com/api/config#service
 */
public class ServiceDetails {

    //private Boolean active; // Service docs wrong - this doesn't exist
    //private Integer version; // Service docs wrong - this doesn't exist
    private Boolean testing;
    private Boolean staging;
    @SerializedName("active_version")
    private Version activeVersion;

    private List<Version> versions;
//
//    public Boolean getActive() {
//        return active;
//    }

//    public void setActive(Boolean active) {
//        this.active = active;
//    }

//    public Integer getVersion() {
//        return version;
//    }

//    public void setVersion(Integer version) {
//        this.version = version;
//    }

    public Boolean getTesting() {
        return testing;
    }

    public void setTesting(Boolean testing) {
        this.testing = testing;
    }

    public Boolean getStaging() {
        return staging;
    }

    public void setStaging(Boolean staging) {
        this.staging = staging;
    }

    public Version getActiveVersion() {
        return activeVersion;
    }

    public void setActiveVersion(Version activeVersion) {
        this.activeVersion = activeVersion;
    }

    public List<Version> getVersions() {
        return versions;
    }

    public void setVersions(List<Version> versions) {
        this.versions = versions;
    }
}
