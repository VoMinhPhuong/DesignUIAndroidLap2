package com.example.designui.tuan8Firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.designui.R;

public class Login_success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_success);
    }

    public void logout(View view) {
        startActivity( new Intent(Login_success.this, MainLoginActivity.class));
    }
}