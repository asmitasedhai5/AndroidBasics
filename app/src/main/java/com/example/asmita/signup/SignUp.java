package com.example.asmita.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    Button b;

    EditText etname;
    EditText etemail;
    EditText etpassword;

    RadioGroup rg;
    RadioButton r1;
    RadioButton r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        b=(Button) findViewById(R.id.btn_signup);
        etname=(EditText) findViewById(R.id.input_name);
        etemail=(EditText) findViewById(R.id.input_email);
        etpassword=(EditText) findViewById(R.id.input_password);
        rg=(RadioGroup) findViewById(R.id.radioGroup);
        r1=(RadioButton) findViewById(R.id.f);
        r2=(RadioButton) findViewById(R.id.m);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Alternative, but not a good practice..difficult if we have many radio buttons.
              String salute="";
//                if(r1.isChecked()){
//                    salute="Ms";
//                }
//                else{
//                    salute="Mr";
//                }
                int i = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) rg.findViewById(i);

                final String name = etname.getText().toString();
                final String email = etemail.getText().toString();
                final String password = etpassword.getText().toString();

                Toast.makeText(SignUp.this,name+" \n"+ email+"\n"+ password+" \n"+rb.getText().toString(),Toast.LENGTH_LONG).show();
               // System.out.println(salute+"."+name+" /n"+ email+"/n"+ password);
            }
        });
    }
}
