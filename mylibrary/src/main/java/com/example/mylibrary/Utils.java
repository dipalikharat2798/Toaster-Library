package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Utils {
    public static void shortToast(Context ctx, String string){
        Toast.makeText(ctx, string, Toast.LENGTH_SHORT).show();
    }
}
