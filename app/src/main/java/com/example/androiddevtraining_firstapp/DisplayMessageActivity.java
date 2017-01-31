package com.example.androiddevtraining_firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // NOTE: This uses the name of the file, not the id.
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        // NOTE: This uses the explicitly-defined id, which can be any arbitrary
        // name. It does not need to be the same as the name of the XML file.
        ViewGroup layout = (ViewGroup) findViewById(R.id.pjl_activity_display_message);
        layout.addView(textView);

        TextView textView2 = new TextView(this);
        textView2.setTextSize(80);
        textView2.setText("No Whammy!!");
        layout.addView(textView2);
    }
}
