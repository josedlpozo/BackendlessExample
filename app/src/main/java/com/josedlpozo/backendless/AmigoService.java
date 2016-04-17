package com.josedlpozo.backendless;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by josedelpozo on 17/4/16.
 */
public interface AmigoService {

    @Headers({"application-id: APP_ID",
            "secret-key: REST_SECRET_KEY",
            "Content-Type: application/json"})
    @GET("/{version}/data/{table-name}")
    Call<BackendlessResponse> getAmigos(@Path("version") String version, @Path("table-name") String table);
}
