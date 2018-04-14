package deepin.com.sdk;

import android.app.Activity;
import android.os.Bundle;

import deepin.com.sdk.common.MyCommon;

public class SDKBaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdkbase);

        // call test1()
        MyCommon.Test1();
    }


}
