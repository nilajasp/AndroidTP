package com.example.commandlinecreate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by nilajapatankar on 4/13/15.
 */
public class DisplayMessageActivity extends Activity {
    String message;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        message = intent.getStringExtra(HomeActivity.EXTRA_MESSAGE);
        setContentView(R.layout.display_message_layout);
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }
}