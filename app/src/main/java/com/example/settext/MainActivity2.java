package com.example.settext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "com.example.android.settext.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();

    }
    public void tofirst(View view) {
        CharSequence str= view.getContentDescription();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_MESSAGE, str);
        startActivity(intent);
    }
}