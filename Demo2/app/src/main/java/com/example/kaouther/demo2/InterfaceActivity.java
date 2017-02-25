package com.example.kaouther.demo2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class InterfaceActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface);
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.activity_interface);
        layout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(InterfaceActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
