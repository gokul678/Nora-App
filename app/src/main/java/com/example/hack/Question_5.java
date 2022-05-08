package com.example.hack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Question_5 extends AppCompatActivity {

    ImageView green,red,orange,yellow;
    int sum;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_5);
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
                if(sum>=6&&sum<=14) {
                    Intent i = new Intent(Question_5.this, result.class);
                    i.putExtra("sum", Integer.toString(sum));
                    startActivity(i);
                    Toast t = Toast.makeText(getApplicationContext(), Integer.toString(sum), Toast.LENGTH_LONG);
                    t.show();
                }
                else if(sum>=14&&sum<=20)
                {
                    Intent i = new Intent(Question_5.this, result3.class);
                    i.putExtra("sum", Integer.toString(sum));
                    startActivity(i);
                    Toast t = Toast.makeText(getApplicationContext(), Integer.toString(sum), Toast.LENGTH_LONG);
                    t.show();
                }
                else {
                    Intent i = new Intent(Question_5.this, result2.class);

                    i.putExtra("sum", Integer.toString(sum));
                    Toast t = Toast.makeText(getApplicationContext(), Integer.toString(sum), Toast.LENGTH_LONG);
                    t.show();
                    startActivity(i);
                }


            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sum=sum+2;
                if(sum>=6&&sum<=14) {
                    Intent i = new Intent(Question_5.this, result.class);
                    i.putExtra("sum", Integer.toString(sum));
                    startActivity(i);
                    Toast t = Toast.makeText(getApplicationContext(), Integer.toString(sum), Toast.LENGTH_LONG);
                    t.show();
                }
                else if(sum>=14&&sum<= 20)
                {
                    Intent i = new Intent(Question_5.this, result3.class);
                    i.putExtra("sum", Integer.toString(sum));
                    startActivity(i);
                    Toast t = Toast.makeText(getApplicationContext(), Integer.toString(sum), Toast.LENGTH_LONG);
                    t.show();
                }
                else {
                    Intent i = new Intent(Question_5.this, result2.class);

                    i.putExtra("sum", Integer.toString(sum));
                    Toast t = Toast.makeText(getApplicationContext(), Integer.toString(sum), Toast.LENGTH_LONG);
                    t.show();
                    startActivity(i);
                }


            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sum=sum+3;
                if(sum>=6&&sum<=14) {
                    Intent i = new Intent(Question_5.this, result.class);
                    i.putExtra("sum", Integer.toString(sum));
                    startActivity(i);
                    Toast t = Toast.makeText(getApplicationContext(), Integer.toString(sum), Toast.LENGTH_LONG);
                    t.show();
                }
                else if(sum>=14&&sum<=20)
                {
                    Intent i = new Intent(Question_5.this, result3.class);
                    i.putExtra("sum", Integer.toString(sum));
                    startActivity(i);
                    Toast t = Toast.makeText(getApplicationContext(), Integer.toString(sum), Toast.LENGTH_LONG);
                    t.show();
                }
                else {
                    Intent i = new Intent(Question_5.this, result2.class);

                    i.putExtra("sum", Integer.toString(sum));
                    Toast t = Toast.makeText(getApplicationContext(), Integer.toString(sum), Toast.LENGTH_LONG);
                    t.show();
                    startActivity(i);
                }


            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sum=sum+4;
                if(sum>=6&&sum<=14) {
                    Intent i = new Intent(Question_5.this, result.class);
                    i.putExtra("sum", Integer.toString(sum));
                    startActivity(i);
                    Toast t = Toast.makeText(getApplicationContext(), Integer.toString(sum), Toast.LENGTH_LONG);
                    t.show();
                }
                else if(sum>=14&&sum<=20)
                {
                    Intent i = new Intent(Question_5.this, result3.class);
                    i.putExtra("sum", Integer.toString(sum));
                    startActivity(i);
                    Toast t = Toast.makeText(getApplicationContext(), Integer.toString(sum), Toast.LENGTH_LONG);
                    t.show();
                }
                else {
                    Intent i = new Intent(Question_5.this, result2.class);

                    i.putExtra("sum", Integer.toString(sum));
                    Toast t = Toast.makeText(getApplicationContext(), Integer.toString(sum), Toast.LENGTH_LONG);
                    t.show();
                    startActivity(i);
                }


            }
        });

    }

}