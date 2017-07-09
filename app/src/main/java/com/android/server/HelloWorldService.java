package com.android.server;

import android.os.IHelloWorld;
import android.os.RemoteException;
import android.util.Log;

/**
 * Created by 41264 on 07/10/17.
 */

public class HelloWorldService extends IHelloWorld.Stub {

    private static final String TAG = HelloWorldService.class.getSimpleName();

    @Override
    public void printSth(String content) throws RemoteException {
        Log.i(TAG,content);
    }

    @Override
    public String getHelloWorld() throws RemoteException {
        return "hello world";
    }
}
