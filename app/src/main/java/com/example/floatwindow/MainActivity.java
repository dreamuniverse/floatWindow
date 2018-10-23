package com.example.floatwindow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  private Button button;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initView();
  }

  private void initView() {
    button = findViewById(R.id.next);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        jump();
      }
    });
  }

  private void jump() {
    Intent intent = new Intent(this, SecondActivity.class);
    startActivityForResult(intent, 0);
  }

  @Override
  public void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
  }
}