package com.kuaishou.okhttpdemo.utils;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class OkhttpHelper {

    public static void getRequest(String url, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        client.newCall(request).enqueue(callback);

        /*
        拆解
        步骤1
         */
//        1. 获取OkHttpClient对象
//        OkHttpClient client1 = new OkHttpClient();
////        2. 获取构建Request对象
//        Request request1 = new Request.Builder()
//                .url(url)
//                .get()
//                .build();
////        3. 构建Call对象
//        Call call = client1.newCall(request1);
//
//        call.enqueue(callback);
    }

    public static void postRequest(String url, FormBody.Builder builder, Callback callback) {
        OkHttpClient client = new OkHttpClient();
//        FormBody builder1 = new Builder();
        FormBody build = builder.build();
        Request request = new Request.Builder()
                .url(url)
                .post(build)
                .build();
        client.newCall(request).enqueue(callback);
    }
}
