package com.example.floatwindow;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.FrameLayout;

import java.util.HashMap;
import java.util.Map;

public class App extends Application implements Application.ActivityLifecycleCallbacks {

  public static int count = 0;
  public Map<Activity, Boolean> floatMap = new HashMap<>();

  @Override
  public void onCreate() {
    super.onCreate();
    registerActivityLifecycleCallbacks(this);
    ContextFactory.getInstance().setContext(this);
  }

  @Override
  public void onActivityResumed(Activity activity) {
    FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
    params.gravity = Gravity.END | Gravity.BOTTOM;
    params.bottomMargin = 60;
    count++;
    if (!floatMap.containsKey(activity) || !floatMap.get(activity)) {
      FloatView floatView = new FloatView(activity);
      activity.addContentView(floatView, params);
      floatMap.put(activity, true);
    }

  }

  @Override
  public void onActivityCreated(Activity activity, Bundle bundle) {

  }

  @Override
  public void onActivityStopped(Activity activity) {

  }

  @Override
  public void onActivityPaused(Activity activity) {
  }

  @Override
  public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

  }

  @Override
  public void onActivityStarted(Activity activity) {

  }

  @Override
  public void onActivityDestroyed(Activity activity) {
    floatMap.put(activity, false);
  }

}
