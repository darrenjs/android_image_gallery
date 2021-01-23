package com.darren.smith.videoplayer.presentation;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;

public class UiUtils {

    private UiUtils() {
    }

    public static boolean isTablet(Context context) {
        int value = context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK;
        switch (value) {
            case Configuration.SCREENLAYOUT_SIZE_SMALL:
            case Configuration.SCREENLAYOUT_SIZE_NORMAL:
                return false;
            default:
                return true;
        }
    }

    public static boolean isPortrait(Context context) {
        return context.getResources().getConfiguration().orientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
    }

    public static int dpToPx(float dp) {
        return  (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }
}
