package com.os.operando.intentflag_activity_forward_resultsample;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LoginSelectActivity extends AppCompatActivity {

    private com.os.operando.intentflag_activity_forward_resultsample.databinding.ActivityLoginSelectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login_select);

        binding.facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = LoginActivity.createIntent(LoginSelectActivity.this, "facebook");
                i.addFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT);
                startActivity(i);
            }
        });

        binding.google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = LoginActivity.createIntent(LoginSelectActivity.this, "google");
                i.addFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT);
                startActivity(i);
            }
        });

        binding.finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}