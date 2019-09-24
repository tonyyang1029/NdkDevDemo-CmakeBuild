//
// Created by TY on 2019-09-24.
//

#include <stdio.h>
#include <string.h>
#include "com_ty_android_ndkdevdemo_NdkLib.h"

JNIEXPORT jstring JNICALL
Java_com_ty_android_ndkdevdemo_NdkLib_getData(JNIEnv *env, jobject thiz) {
    jclass clazz = (*env)->GetObjectClass(env, thiz);
    jfieldID id = (*env)->GetFieldID(env, clazz, "number", "I");

    int number = (*env)->GetIntField(env, thiz, id);
    char data[50] = {0};
    sprintf(data, "No.%d ", number);
    strcpy((data + strlen(data)), "greeting from ndk library.");

    return (*env)->NewStringUTF(env, data);
}

JNIEXPORT void JNICALL
Java_com_ty_android_ndkdevdemo_NdkLib_updateData(JNIEnv *env, jobject thiz) {
    jclass clazz = (*env)->GetObjectClass(env, thiz);
    jfieldID id = (*env)->GetFieldID(env, clazz, "number", "I");

    int number = (*env)->GetIntField(env, thiz, id);
    number++;
    (*env)->SetIntField(env, thiz, id, number);
}