package android.app;

import android.content.Context;
import android.os.IHelloWorld;
import android.os.RemoteException;

/**
 * Created by 41264 on 07/10/17.
 */

public class HelloWorldManager {
    IHelloWorld mService;
    public HelloWorldManager(Context ctx,IHelloWorld service){
        mService = service;
    }

    public void printSth(String content){
        try {
            mService.printSth(content);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public String getHelloWorld(){
        try {
            mService.getHelloWorld();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return null;
    }
}
