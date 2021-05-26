package com.jason.test;

import android.content.Context;
import android.widget.Toast;

/**
 * @author：Jason
 * @date：2021/5/26 15:23
 * @email：1129847330@qq.com
 * @description:
 */
public class JitpackUtil {
    public static void showToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}