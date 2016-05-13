package com.coolweather.app.util;

/**
 * Created by owen on 16/5/12.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
