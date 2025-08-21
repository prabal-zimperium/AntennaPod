package com.pb.test;

import android.widget.TextView;

import androidx.annotation.NonNull;

import com.zimperium.api.v5.ZDeviceStatus;
import com.zimperium.api.v5.ZDeviceStatusCallback;

public class ThreatStatusCallback implements ZDeviceStatusCallback {

    public ThreatStatusCallback(TextView threatStatus) {
        this.threatStatus = threatStatus;
    }

    private TextView threatStatus ;

    public TextView getThreatStatus() {
        return threatStatus;
    }

    @Override
    public void onDeviceStatus(@NonNull ZDeviceStatus zDeviceStatus) {
        threatStatus.setText(zDeviceStatus.getActiveThreats().size()+"");
    }

}