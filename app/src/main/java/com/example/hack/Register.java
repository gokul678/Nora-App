package com.example.hack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hack.Adapter.DBHelper;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Register extends AppCompatActivity {
    EditText user,email,pass,cpass;
    Button rbtn;
    DBHelper DB;
    String username,emailaddress,password,cpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        user=findViewById(R.id.UserName);
        email=findViewById(R.id.EmailAddress);
        pass=findViewById(R.id.Password);
        cpass=findViewById(R.id.CPassword);
        rbtn=findViewById(R.id.SignBUTTON);
        DB = new DBHelper(this);

        rbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                FirebaseDatabase database = FirebaseDatabase.getInstance();
//                DatabaseReference myRef = database.getReference("C_name");
//                DatabaseReference myRef1 = database.getReference("C_email");
//                DatabaseReference myRef2 = database.getReference("P_name");
//                DatabaseReference myRef3 = database.getReference("P_cname");
                username = user.getText().toString();
                emailaddress = email.getText().toString();
                password = pass.getText().toString();
                cpassword = cpass.getText().toString();
//                myRef.setValue(username);
//                myRef1.setValue(emailaddress);
//                myRef2.setValue(password);
//                myRef3.setValue(cpassword);


                Boolean checkinsertdata = DB.insertuserdata(username, emailaddress, password);
                if(checkinsertdata==true) {
                    Toast.makeText(Register.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Register.this, Login.class);
                    startActivity(i);

                }
                else {
                    Toast.makeText(Register.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();
                }
                Cursor res = DB.getdata();
                if(res.getCount()==0){
                    Toast.makeText(Register.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("Name :"+res.getString(0)+"\n");
                    buffer.append("Email :"+res.getString(1)+"\n");
                    buffer.append("phone :"+res.getString(2)+"\n\n");
                }


            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(getApplicationContext(), First_login.class));
    }
}