package deepin.com.leelocalrepodemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import deepin.com.sdk.common.MyCommon;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String strFromSDK = MyCommon.getHelloWorld();
        ((TextView)findViewById(R.id.id_hello_world)).setText("Hello World From UI \nand \n" + strFromSDK);
    }
}
