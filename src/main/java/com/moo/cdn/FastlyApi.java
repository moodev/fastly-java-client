package com.moo.cdn;

import com.moo.cdn.model.Backend;
import com.moo.cdn.model.Domain;
import com.moo.cdn.model.Service;
import com.moo.cdn.model.ServiceDetails;
import com.moo.cdn.model.Version;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * An interface for the Fastly API
 * See https://docs.fastly.com/api/
 */
public interface FastlyApi {

    final static String FASTLY_TEST_URL_SUFFIX = "global.prod.fastly.net"; // TODO: shouldn't live here

    // Purging
    @POST("/service/{service_id}/purge_all")
    Call<Object> purgeAll(@Path("service_id") String serviceId);

    // Backend
    @GET("/service/{service_id}/version/{version}/backend/{name}")
    Call<Backend> getBackend(@Path("service_id") String serviceId, @Path("version") String version, @Path("name") String name);

    @POST("/service/{service_id}/version/{version}/backend")
    Call<Backend> createBackend( @Path("service_id") String serviceId, @Path("version") String version, @Body Backend backend);

    @PUT("/service/{service_id}/version/{version}/backend/{old_name}")
    Call<Backend> updateBackend( @Path("service_id") String serviceId, @Path("version") String version, @Path("old_name") String oldName, @Body Backend updatedBacked);

    // Domain
    @POST("/service/{service_id}/version/{version}/domain")
    Call<Domain> createDomain(@Path("service_id") String serviceId, @Path("version") String version, @Body Domain name);

    // Service
    @GET("/service/search")
    Call<Service> getServiceByName(@Query("name") String serviceName);

    @GET("/service/{service_id}/details")
    Call<ServiceDetails> getServiceDetails(@Path("service_id") String serviceId);

    @POST("/service")
    Call<Service> createService(@Body Service service);

    @DELETE("/service/{id}")
    Call<Object> deleteService(@Path("id") String serviceId);

    //Version
    @PUT("/service/{service_id}/version/{number}/activate")
    Call<Version> activateVersion(@Path("service_id") String serviceId, @Path("number") String version);

    @PUT("/service/{service_id}/version/{number}/deactivate")
    Call<Version> deactivateVersion(@Path("service_id") String serviceId, @Path("number") String version);

    @PUT("/service/{service_id}/version/{version}/clone")
    Call<Version> cloneVersion(@Path("service_id") String serviceId, @Path("version") String version);

}

