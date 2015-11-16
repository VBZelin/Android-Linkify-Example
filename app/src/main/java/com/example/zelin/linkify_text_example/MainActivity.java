package com.example.zelin.linkify_text_example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button launch_button;
    Button launch_button2;
    Button launch_button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        launch_button = (Button) findViewById(R.id.launch_button);
        launch_button2 = (Button) findViewById(R.id.launch_button2);
        launch_button3 = (Button) findViewById(R.id.launch_button3);
        launch_button.setOnClickListener(this);
        launch_button2.setOnClickListener(this);
        launch_button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.launch_button:
                startActivity(new Intent(this, LinkifyActivity.class));
                break;
            case R.id.launch_button2:
                startActivity(new Intent(this, LinkifyActivity2.class));
                break;
            case R.id.launch_button3:
                startActivity(new Intent(this, LinkifyActivity3.class));
                break;
        }
    }
}
