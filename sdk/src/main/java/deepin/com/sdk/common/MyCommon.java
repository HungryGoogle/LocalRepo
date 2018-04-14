package deepin.com.sdk.common;

import android.util.Log;

import static deepin.com.sdk.common.ConstCommon.MyTag;

/**
 * Created by Li on 2018/4/14.
 */

public class MyCommon {
    public static int Test1(){
        Log("call MyCommon.Test1(); ");
        return 0;
    }

    public static void Log(String str){
        Log.i(MyTag, str);
    }

    public static String getHelloWorld(){
        return "Hello world from SDK";
    }
}
