package com.usut.dustapi.data;

import com.usut.dustapi.model.dust_material.FineDust;

import retrofit2.Callback;

public interface FineDustRepository {

    boolean isAvailable();

    void getFineDustData(Callback<FineDust> callback);
}
