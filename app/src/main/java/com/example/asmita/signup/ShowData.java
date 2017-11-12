package com.example.asmita.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {

    TextView name, gender, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        Intent intent = getIntent();
        String sname = intent.getStringExtra("name");
        String sgender = intent.getStringExtra("gender");
        String semail = intent.getStringExtra("email");
        String spass = intent.getStringExtra("password");

        name = (TextView) findViewById(R.id.txtName);
        gender = (TextView) findViewById(R.id.txtGender);
        email = (TextView) findViewById(R.id.txtEmail);
        password = (TextView) findViewById(R.id.txtPassword);

        name.setText(sname);
        gender.setText(sgender);
        email.setText(semail);
        password.setText(spass);

    }
}
