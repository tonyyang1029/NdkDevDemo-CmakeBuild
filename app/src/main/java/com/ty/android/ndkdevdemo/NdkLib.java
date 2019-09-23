package com.ty.android.ndkdevdemo;

public class NdkLib {
    static {
        System.loadLibrary("NdkLib");
    }

    private int number = 0;

    public native String getData();
    public native void updateData();
}
