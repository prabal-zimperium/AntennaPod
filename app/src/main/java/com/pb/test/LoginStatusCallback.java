package com.pb.test;

import android.widget.TextView;

import androidx.annotation.NonNull;

import com.zimperium.api.v5.ZDeviceStatus;
import com.zimperium.api.v5.ZDeviceStatusCallback;

public class LoginStatusCallback implements ZDeviceStatusCallback {

    public LoginStatusCallback(TextView loginStatus) {
        this.loginStatus = loginStatus;
    }

    private TextView loginStatus ;

    public TextView getLoginStatus() {
        return loginStatus;
    }

    @Override
    public void onDeviceStatus(@NonNull ZDeviceStatus zDeviceStatus) {
        loginStatus.setText(zDeviceStatus.getLoginStatus()+"");
    }

}