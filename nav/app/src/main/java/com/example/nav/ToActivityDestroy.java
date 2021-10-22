package com.example.nav;

import android.app.Activity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * destroy an activity
 */
public class ToActivityDestroy {
    private static Map<String, Activity> destoryMap = new HashMap<>();
    /**
     * add activity to destroy list
     *
     * @param activity to be destroyed anctivity
     */
    public static void addDestoryActivity(Activity activity, String activityName) {
        destoryMap.put(activityName, activity);
    }

}
