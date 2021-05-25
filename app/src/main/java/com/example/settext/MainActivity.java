package com.example.settext;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView rcvd;
   static int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
         i++;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity2.EXTRA_MESSAGE);
        String s="textView"+i;
          int resID = getResources().getIdentifier(s, "id", getPackageName());
            rcvd = (TextView) findViewById(resID);
            rcvd.setText(message);

    }


    public void tosec(View view) {

        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }

    public void map(View view) {
        Uri addressUri = Uri.parse("geo:17.724798,76.936935" );
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

        // Find an activity to handle the intent, and start that activity.
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }
}
