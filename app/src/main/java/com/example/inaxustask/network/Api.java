package com.example.inaxustask.network;

import com.example.inaxustask.network.responses.IssuesList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;

public interface Api {

    @FormUrlEncoded
    @GET("/api/Inspection/GetIssuesList")
    Call<IssuesList> issuelist(
            @Field("assignee") String asignee
    );
}
