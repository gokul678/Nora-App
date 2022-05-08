package com.example.hack;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;



import static android.content.ContentValues.TAG;

public class Question_2 extends AppCompatActivity {
    ImageView green,red,orange,yellow;
    int sum;
    String s;
    boolean doubleBackToExitPressedOnce=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_2);
        green=findViewById(R.id.green);
        yellow=findViewById(R.id.yellow);
        orange=findViewById(R.id.orange);
        red=findViewById(R.id.red);
        Intent intent = getIntent();
        String value=intent.getStringExtra("sum");
         sum=Integer.parseInt(value);

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sum=sum+1;
                Intent i=new Intent(Question_2.this, Question_3.class);
                i.putExtra("sum",Integer.toString(sum));

                startActivity(i);

            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sum=sum+2;
                Intent i=new Intent(Question_2.this, Question_3.class);
                i.putExtra("sum",Integer.toString(sum));

                startActivity(i);


            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sum=sum+3;
                Intent i=new Intent(Question_2.this, Question_3.class);
                i.putExtra("sum",Integer.toString(sum));

                startActivity(i);


            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sum=sum+4;
                Intent i=new Intent(Question_2.this, Question_3.class);
                i.putExtra("sum",Integer.toString(sum));

                startActivity(i);


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