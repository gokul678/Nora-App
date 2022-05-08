package com.example.hack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



import static android.content.ContentValues.TAG;

public class Sms_send extends AppCompatActivity {
    EditText pho,txt1;
    Button b1;
    String phno,text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_send);
        pho=findViewById(R.id.UserName);
        txt1=findViewById(R.id.Texttts);
        b1=findViewById(R.id.SEND);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                Intent i = new Intent(Sms_send.this,First_qus.class);
                startActivity(i);

            }
        });





    }

}