package com.example.floatwindow;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class SingleFloatView extends FrameLayout implements View.OnClickListener {

  private TextView textView;

  public SingleFloatView(Context context) {
    super(context);
    LayoutInflater.from(context).inflate(R.layout.float_window, this);
    textView = findViewById(R.id.count);
    textView.setText(String.valueOf(App.count));
  }

  @Override
  public void onClick(View v) {
  }

}
