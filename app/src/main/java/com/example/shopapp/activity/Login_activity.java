package com.example.shopapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.shopapp.R;

import java.util.Locale;

public class Login_activity extends AppCompatActivity {

    Button login;
    EditText username,password;

    protected void onCreate(Bundle saveInstancesState) {
        super.onCreate(saveInstancesState);

        setContentView(R.layout.login_relative);

        login = (Button) findViewById(R.id.btnLogin);
        username = (EditText) findViewById(R.id.et_Username);
        password = (EditText) findViewById(R.id.et_Password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (password.getText().toString().toUpperCase().equals("TEST1")) {
                    login_sukses();
                } else {
                    Toast.makeText(getApplicationContext(), "Salah Password", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    private void login_sukses() {
        String user_login = username.getText().toString();
        Intent i = new Intent(this,MainActivity.class);
        // kirimkan username nya ke dalam tampilan utama
        i.putExtra("USERNAME", user_login);
        startActivity(i);
    }

    ;
}
