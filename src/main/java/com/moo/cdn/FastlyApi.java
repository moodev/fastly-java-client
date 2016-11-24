package com.moo.cdn;

import com.moo.cdn.model.Backend;
import com.moo.cdn.model.Domain;
import com.moo.cdn.model.ServiceDetails;
import com.moo.cdn.model.Version;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * An interface for the Fastly API
 * See https://docs.fastly.com/api/
 */
public interface FastlyApi {

    public final static String FASTLY_URL = "https://api.fastly.com";
    public final static String FASTLY_TEST_URL_SUFFIX = "global.prod.fastly.net";

    @POST("/service/{service_id}/purge_all")
    Call<Object> purgeAll(@Header("Fastly-Key") String apiKey, @Path("service_id") String serviceId);

    @GET("/service/{service_id}/details")
    Call<ServiceDetails> getServiceDetails(@Header("Fastly-Key") String apiKey, @Path("service_id") String serviceId);

    @GET("/service/{service_id}/version/{version}/backend/{name}")
    Call<Backend> getBackend(@Header("Fastly-Key") String apiKey, @Path("service_id") String serviceId, @Path("version") String version, @Path("name") String name);

    @PUT("/service/{service_id}/version/{version}/backend/{old_name}")
    Call<Backend> updateBackend(@Header("Fastly-Key") String apiKey, @Path("service_id") String serviceId, @Path("version") String version, @Path("old_name") String oldName, @Body Backend updatedBacked);

    @POST("/service/{service_id}/version/{version}/domain")
    Call<Domain> createDomain(@Header("Fastly-Key") String apiKey, @Path("service_id") String serviceId, @Path("version") String version, @Body Domain name);

    @PUT("/service/{service_id}/version/{version}/activate")
    Call<Version> activateVersion(@Header("Fastly-Key") String apiKey, @Path("service_id") String serviceId, @Path("version") String version);

    @PUT("/service/{service_id}/version/{version}/clone")
    Call<Version> cloneVersion(@Header("Fastly-Key") String apiKey, @Path("service_id") String serviceId, @Path("version") String version);

}

