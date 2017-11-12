package com.example.asmita.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Addition extends AppCompatActivity {

    EditText et1,et2;
    Button b;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        b=(Button)findViewById(R.id.btnAdd);
        ans=(TextView)findViewById(R.id.tvAns);

        //Alternatively, no need to mention add on onclick
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i= Integer.parseInt(et1.getText().toString());
                int j= Integer.parseInt(et2.getText().toString());
                int k=i+j;
                ans.setText("Ans is:"+k);

            }
        });


    }
//need to put add method in onClick
//    public void add(View v){
//        int i= Integer.parseInt(et1.getText().toString());
//        int j= Integer.parseInt(et2.getText().toString());
//        int k=i+j;
//        ans.setText("Ans is:"+k);
//    }
}
