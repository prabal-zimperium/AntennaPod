package com.pb.test;

import android.widget.TextView;

import androidx.annotation.NonNull;

import com.zimperium.api.v5.ZDeviceStatus;
import com.zimperium.api.v5.ZDeviceStatusCallback;

public class SDKVersionCallback implements ZDeviceStatusCallback {
    public SDKVersionCallback(TextView sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    private TextView sdkVersion ;

    @Override
    public void onDeviceStatus(@NonNull ZDeviceStatus zDeviceStatus) {
        sdkVersion.setText(zDeviceStatus.getSdkVersion());
    }
}
