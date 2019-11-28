package com.example.slideanimationactivities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;






public class Registration extends AppCompatActivity {
    private Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        init();
        cancel = findViewById(R.id.cancel);
        cancel.setOnClickListener(new CancelHandling());
    }


    private void init(){
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    private class CancelHandling implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Registration.this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out_second);
        }
    }
}
