package com.example.zelin.linkify_text_example;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;

public class LinkifyActivity3 extends AppCompatActivity {
    TextView text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkify3);
        SpannableString ss = new SpannableString(
                getString(R.string.link_final_best));
        ClickableSpan homeLink = new ClickableSpan() {
            @Override
            public void onClick(View textView) {
                startActivity(new Intent(LinkifyActivity3.this, MainActivity.class));
            }
        };
        ss.setSpan(homeLink, 0, 4,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(new StyleSpan(Typeface.BOLD), 0, 5,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(new URLSpan("tel:4155551212"), 12, 16,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        text3 = (TextView) findViewById(R.id.text3);
        text3.setText(ss);
        text3.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
