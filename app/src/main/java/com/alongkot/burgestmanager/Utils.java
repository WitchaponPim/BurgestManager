package com.alongkot.burgestmanager;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ptwitchapon on 9/2/2561.
 */

public class Utils {


    public static void toast(Context context, String string) {
        Toast toast = Toast.makeText(context, string, Toast.LENGTH_SHORT);

        toast.show();

    }



}
