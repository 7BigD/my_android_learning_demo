package com.kuaishou.helloworld.util;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

    public static Toast mToast;

    public static void showMsg(String msg, Context context) {
        if (mToast == null) {
            mToast = Toast.makeText(context, msg, Toast.LENGTH_LONG);
        } else {
            mToast.setText(msg);
        }
        mToast.show();
    }
}
