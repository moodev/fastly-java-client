package com.moo.cdn;

import com.moo.cdn.model.ActionResult;
import com.moo.cdn.model.Backend;
import com.moo.cdn.model.Domain;
import com.moo.cdn.model.Service;
import com.moo.cdn.model.ServiceDetails;
import com.moo.cdn.model.VCL;
import com.moo.cdn.model.Version;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

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
    @GET("/service/{service_id}/version/{version}/backend")
    Call<List<Backend>> listBackends(@Path("service_id") String serviceId, @Path("version") String version);

    @GET("/service/{service_id}/version/{version}/backend/{name}")
    Call<Backend> getBackend(@Path("service_id") String serviceId, @Path("version") String version, @Path("name") String name);

    @POST("/service/{service_id}/version/{version}/backend")
    Call<Backend> createBackend(@Path("service_id") String serviceId, @Path("version") String version, @Body Backend backend);

    @PUT("/service/{service_id}/version/{version}/backend/{old_name}")
    Call<Backend> updateBackend(@Path("service_id") String serviceId, @Path("version") String version, @Path("old_name") String oldName, @Body Backend updatedBacked);

    @DELETE("/service/{service_id}/version/{version}/backend/{name}")
    Call<ActionResult> deleteBackend(@Path("service_id") String serviceId, @Path("version") String version, @Path("name") String name);

    // Domain
    @GET("/service/{service_id}/version/{version}/domain")
    Call<List<Domain>> listDomains(@Path("service_id") String serviceId, @Path("version") String version);

    @GET("/service/{service_id}/version/{version}/domain/{name}")
    Call<Domain> getDomain(@Path("service_id") String serviceId, @Path("version") String version, @Path("name") String name);

    @POST("/service/{service_id}/version/{version}/domain")
    Call<Domain> createDomain(@Path("service_id") String serviceId, @Path("version") String version, @Body Domain domain);

    @PUT("/service/{service_id}/version/{version}/domain/{old_name}")
    Call<Domain> updateDomain(@Path("service_id") String serviceId, @Path("version") String version, @Path("old_name") String oldName, @Body Domain domain);

    @PUT("/service/{service_id}/version/{version}/domain/{name}")
    Call<ActionResult> deleteDomain(@Path("service_id") String serviceId, @Path("version") String version, @Path("name") String name);

    // Service
    @GET("/service")
    Call<List<Service>> listServices();

    @GET("/service/search")
    Call<Service> getServiceByName(@Query("name") String serviceName);

    @GET("/service/{service_id}/details")
    Call<ServiceDetails> getServiceDetails(@Path("service_id") String serviceId);

    @GET("/service/{id}")
    Call<Service> getService(@Path("id") String serviceId);

    @GET("/service/{id}/domain")
    Call<List<Domain>> listServiceDomains(@Path("id") String serviceId);

    @POST("/service")
    Call<Service> createService(@Body Service service);

    @PUT("/service/{id}")
    Call<Service> updateService(@Path("id") String serviceId, @Body Service service);

    @DELETE("/service/{id}")
    Call<ActionResult> deleteService(@Path("id") String serviceId);

    // VCL
    @GET("/service/{service_id}/version/{version}/vcl")
    Call<List<VCL>> listVCLs(@Path("service_id") String serviceId, @Path("version") String version);

    @GET("/service/{service_id}/version/{version}/vcl/{name}")
    Call<VCL> getVCL(@Path("service_id") String serviceId, @Path("version") String version, @Path("name") String name);

    @GET("/service/{service_id}/version/{version}/generated_vcl")
    Call<VCL> getGeneratedVCL(@Path("service_id") String serviceId, @Path("version") String version);

    @POST("/service/{service_id}/version/{version}/vcl")
    Call<VCL> createVCL(@Path("service_id") String serviceId, @Path("version") String version, @Body VCL vcl);

    @POST("/service/{service_id}/version/{version}/vcl/{name}/main")
    Call<VCL> setVCLAsMain(@Path("service_id") String serviceId, @Path("version") String version, @Path("name") String name);

    @PUT("/service/{service_id}/version/{version}/vcl/{old_name}")
    Call<VCL> updateVCL(@Path("service_id") String serviceId, @Path("version") String version,  @Path("old_name") String oldName, @Body VCL vcl);

    @DELETE("/service/{service_id}/version/{version}/vcl/{name}")
    Call<ActionResult> deleteVCL(@Path("service_id") String serviceId, @Path("version") String version,  @Path("name") String name);

    //Version
    @GET("/service/{service_id}/version")
    Call<List<Version>> listVersions(@Path("service_id") String serviceId);

    @GET("/service/{service_id}/version/{number}")
    Call<Version> getVersion(@Path("service_id") String serviceId, @Path("number") String version);

    @GET("/service/{service_id}/version/{number}/validate")
    Call<ActionResult> validateVersion(@Path("service_id") String serviceId, @Path("number") String version);

    @POST("/service/{service_id}/version")
    Call<Version> createVersion(@Path("service_id") String serviceId);

    @PUT("/service/{service_id}/version/{number}")
    Call<Version> updateVersion(@Path("service_id") String serviceId, @Path("number") String versionNumber, @Body Version version);

    @PUT("/service/{service_id}/version/{number}/activate")
    Call<Version> activateVersion(@Path("service_id") String serviceId, @Path("number") String version);

    @PUT("/service/{service_id}/version/{number}/deactivate")
    Call<Version> deactivateVersion(@Path("service_id") String serviceId, @Path("number") String version);

    @PUT("/service/{service_id}/version/{version}/clone")
    Call<Version> cloneVersion(@Path("service_id") String serviceId, @Path("version") String version);

    @PUT("/service/{service_id}/version/{number}/lock")
    Call<Version> lockVersion(@Path("service_id") String serviceId, @Path("number") String version);


}

