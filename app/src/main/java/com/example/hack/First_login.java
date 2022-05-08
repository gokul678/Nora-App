package com.example.hack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;


public class First_login extends AppCompatActivity {

    boolean doubleBackToExitPressedOnce=false;

ImageView imageView;
Button loginbtn,registerbtn;
TextView maybelater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_login);

        maybelater=findViewById(R.id.Text2);

        loginbtn=findViewById(R.id.login);
        registerbtn=findViewById(R.id.sign);
        imageView = findViewById(R.id.image1);
        Glide.with(this).load(R.drawable.animi_gif).into(imageView);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(First_login.this,Login.class);
                startActivity(i);
                finish();

            }
        });

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(First_login.this,Register.class);
                startActivity(i);
                finish();

            }
        });

        maybelater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(First_login.this,Sms_send.class);
                startActivity(i);
                finish();

            }
        });
    }

    public void onBackPressed()
    {
        // TODO Auto-generated method stub
//        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert)
//                .setTitle("Exit  :")
//                .setMessage("Are you sure you want to exit..?")
//                .setPositiveButton("Yes",new DialogInterface.OnClickListener()
//                {
//
//                    @Override
//                    public void onClick(DialogInterface arg0, int arg1)
//                    {
//                        // TODO Auto-generated method stub
//                        Intent i=new Intent(Intent.ACTION_MAIN);
//                        i.addCategory(Intent.CATEGORY_HOME);
//                        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(i);
//                        finish();
//                    }
//                }).setNegativeButton("No",null).show();
//        Intent i=new Intent(Intent.ACTION_MAIN);
//        i.addCategory(Intent.CATEGORY_HOME);
//        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(i);
//        finish();



        if (doubleBackToExitPressedOnce) {
//            super.onBackPressed();
            finishAffinity();
            System.exit(0);
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}