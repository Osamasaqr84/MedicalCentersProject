package com.codesroots.osamaomar.medicalcentersproject.data.repositories;

import com.codesroots.osamaomar.medicalcentersproject.Entities.AddRateResponse;
import com.codesroots.osamaomar.medicalcentersproject.Entities.PhotosResponse;
import com.codesroots.osamaomar.medicalcentersproject.Entities.RatingResponse;
import com.codesroots.osamaomar.medicalcentersproject.data.remote.ApiInterface;

import java.util.List;


import io.reactivex.Observable;
import io.reactivex.Single;

public class RatingRepository {


    private ApiInterface userApi;


    public RatingRepository(ApiInterface userApi) {
        this.userApi = userApi;

    }

    public Single<List<RatingResponse.DataBean>> getCenterEvaluation(Integer page)   {
        return userApi .getCenterEvaluation(page)
                .flatMapIterable(data -> data.getData())
         .toList();
    }

    public Observable<PhotosResponse> getPhotos(Integer page  , Integer id)   {
        return userApi .getPhotos(page , id);
          /*      .flatMapIterable(data -> data.getData().get(0).getHcphotos())
         .toList();*/
    }

    public Observable<AddRateResponse> addRate(int user_id,
                                               int rate,
                                               String comment,
                                               int healthcare_id)   {
        return userApi .addRate(user_id, rate, comment, healthcare_id);
          /*      .flatMapIterable(data -> data.getData().get(0).getHcphotos())
         .toList();*/
    }







}
