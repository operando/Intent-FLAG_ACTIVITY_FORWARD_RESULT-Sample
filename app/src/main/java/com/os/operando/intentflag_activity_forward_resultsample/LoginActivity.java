package com.os.operando.intentflag_activity_forward_resultsample;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.os.operando.intentflag_activity_forward_resultsample.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    public static final String RESULT_SNS_LOGIN = "sns_login";
    private static final String EXTRA_SNS = "sns";

    private ActivityLoginBinding binding;

    public static Intent createIntent(Context context, String snsServiceName) {
        Intent i = new Intent(context, LoginActivity.class);
        i.putExtra(EXTRA_SNS, snsServiceName);
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra(RESULT_SNS_LOGIN, getIntent().getStringExtra(EXTRA_SNS));
                setResult(RESULT_OK, i);
                finish();
            }
        });
    }
}