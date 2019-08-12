package com.liugdxd.zoomeye.util;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import lombok.extern.slf4j.Slf4j;
import okhttp3.*;

@Slf4j
public class OKHttpUtil {
    private static OKHttpUtil okHttpUtil;
    private final OkHttpClient okHttpClient;


    private OKHttpUtil() {
        okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new LoggingInterceptor())
                .build();
    }

    public static OKHttpUtil getInstance() {
        if (null == okHttpUtil) {
            synchronized (OKHttpUtil.class) {
                if (null == okHttpUtil) {
                    okHttpUtil = new OKHttpUtil();
                }
            }
        }
        return okHttpUtil;
    }

    //get 请求
    public void get(String urlString, Callback callback) {
        Request request = new Request.Builder().url(urlString).get().build();
        okHttpClient.newCall(request).enqueue(callback);
    }

    //post请求
    public void post(String urlString, FormBody formBody, Callback callback) {
        Request request = new Request.Builder().url(urlString).method("POST", formBody).build();
        okHttpClient.newCall(request).enqueue(callback);
    }

    public static String executePostHttpConn(String url, String message) throws Exception{
        String result = "";
        try {
            log.info("===============OKHTTP请求报文：{}",message);
            //interfaceLogin(url,message);
            MediaType json  = MediaType.parse("application/json;charset=utf-8");
            OkHttpClient client;
            client = new OkHttpClient.Builder()
                    .readTimeout(100, TimeUnit.SECONDS)
                    .build();

            RequestBody requestBody = RequestBody.create(json, message);
            Request request = new Request.Builder()
                    .url(url)
                    .post(requestBody)
                    .build();
            Response response = client.newCall(request).execute();
            if(response.isSuccessful()){
                result  = response.body().string();
            }else{
                result = response.message();
            }
        } catch (IOException e) {
            log.error("http请求异常{}",url, e);
            throw e;
        }
        log.info("===============OKHTTP返回报文body：{}"+result);
        return result;
    }

    //添加拦截器
    class LoggingInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            String method = request.method();
            Response proceed = chain.proceed(request);
            return proceed;
        }
    }
}