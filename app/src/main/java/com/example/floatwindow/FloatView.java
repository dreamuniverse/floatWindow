package com.example.floatwindow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class FloatView extends FrameLayout implements View.OnClickListener {

  private TextView textView;

  public FloatView(Context context) {
    super(context);
    LayoutInflater.from(context).inflate(R.layout.float_window, this);
    textView = findViewById(R.id.count);
    textView.setText(String.valueOf(App.count));
  }

  @Override
  public void onClick(View v) {

  }

}
