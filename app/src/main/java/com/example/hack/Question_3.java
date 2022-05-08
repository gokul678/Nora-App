package com.example.hack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Question_3 extends AppCompatActivity {
    ImageView green,red,orange,yellow;
    int sum;
    String s;
    boolean doubleBackToExitPressedOnce=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_3);

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
                Intent i=new Intent(Question_3.this, Question_4.class);
                i.putExtra("sum",Integer.toString(sum));

                startActivity(i);


            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sum=sum+2;
                Intent i=new Intent(Question_3.this, Question_4.class);
                i.putExtra("sum",Integer.toString(sum));

                startActivity(i);


            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sum=sum+3;
                Intent i=new Intent(Question_3.this, Question_4.class);
                i.putExtra("sum",Integer.toString(sum));

                startActivity(i);


            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sum=sum+4;
                Intent i=new Intent(Question_3.this, Question_4.class);
                i.putExtra("sum",Integer.toString(sum));

                startActivity(i);


            }
        });

    }

}