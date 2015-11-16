package com.example.zelin.linkify_text_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class LinkifyActivity2 extends AppCompatActivity {

    TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkify2);

        text2 = (TextView) findViewById(R.id.text2);
        text2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
