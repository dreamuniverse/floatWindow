package com.example.floatwindow;

import android.content.Context;


//若涉及到数据同步等，需要作为单例使用，此处暂时未用
public class SingleFloatManager {

  private static volatile SingleFloatManager INSTANCE;
  private SingleFloatView floatView;
  private Context mContext;

  private SingleFloatManager() {
    mContext = ContextFactory.getInstance().getContext();
    floatView = new SingleFloatView(mContext);
  }



  public static SingleFloatManager getInstance() {
    if (INSTANCE == null) {
      synchronized (SingleFloatManager.class) {
        if (INSTANCE == null) {
          INSTANCE = new SingleFloatManager();
        }
      }
    }
    return INSTANCE;

  }
}
