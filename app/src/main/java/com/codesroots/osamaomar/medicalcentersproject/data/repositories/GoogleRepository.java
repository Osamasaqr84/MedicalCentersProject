package com.codesroots.osamaomar.medicalcentersproject.data.repositories;

import com.codesroots.osamaomar.medicalcentersproject.Entities.GoogleSearchEntity;
import com.codesroots.osamaomar.medicalcentersproject.data.remote.ApiInterface;

import io.reactivex.Observable;

public class GoogleRepository {

    private ApiInterface userApi;


    public GoogleRepository(ApiInterface userApi) {
        this.userApi = userApi;

    }


    public Observable<GoogleSearchEntity> getGoogleData(String key ,
                                                        Double lat, Double lng,
                                                        String type   ,
                                                        String pagetoken)   {


        return userApi .getStoresfroomgooglesData(key, lat.toString()+","+lng.toString(), type ,pagetoken);


    }


}
