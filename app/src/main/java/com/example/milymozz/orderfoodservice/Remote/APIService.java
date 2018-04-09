package com.example.milymozz.orderfoodservice.Remote;

import com.example.milymozz.orderfoodservice.Model.DataMessage;
import com.example.milymozz.orderfoodservice.Model.MyResponse;

import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by milymozz on 2018. 2. 15..
 */

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAweNrw40:APA91bEcfiebutsTSN-bptqz16Ub08tDjFkRxJsEbBtovcBpr4zSFASa2pLU2Alf_9TbElM8fEjpiP3N9N7_WegGcAZI0dmkBXrKGbiPIIzKzcBQsYvXGHYxmQmiXuHMsUViry3d7KSs"
            }
    )

    @POST("fcm/send")
    retrofit2.Call<MyResponse> sendNotification(@Body DataMessage body);

}
