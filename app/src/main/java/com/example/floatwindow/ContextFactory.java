package com.example.floatwindow;

import android.content.Context;

public class ContextFactory {

  private static ContextFactory instance = new ContextFactory();
  private Context mContext;

  public void setContext(Context context) {
    mContext = context;
  }

  public Context getContext() {
    return mContext;
  }

  public static ContextFactory getInstance() {
    return instance;
  }
}
