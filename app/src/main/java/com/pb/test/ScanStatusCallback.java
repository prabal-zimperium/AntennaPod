package com.pb.test;

import android.widget.TextView;

import androidx.annotation.NonNull;

import com.zimperium.api.v5.ZDeviceStatus;
import com.zimperium.api.v5.ZDeviceStatusCallback;

public class ScanStatusCallback implements ZDeviceStatusCallback {

    public ScanStatusCallback(TextView scanProgress) {
        this.scanProgress = scanProgress;
    }

    private TextView scanProgress ;

    public TextView getScanProgress() {
        return scanProgress;
    }

    @Override
    public void onDeviceStatus(@NonNull ZDeviceStatus zDeviceStatus) {
        scanProgress.setText(zDeviceStatus.getInitialScanProgressPercentage()+"");
    }

}