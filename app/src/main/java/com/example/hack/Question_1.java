package com.example.hack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Objects;

import static android.telephony.SmsManager.*;

public class Question_1 extends AppCompatActivity {

    boolean doubleBackToExitPressedOnce=false;
 ImageView green,red,orange,yellow;
 int sum=0;


    private SensorManager mSensorManager;
    private float mAccel;
    private float mAccelCurrent;
    private float mAccelLast;
    private static int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_1);
        green=findViewById(R.id.green);
        yellow=findViewById(R.id.yellow);
        orange=findViewById(R.id.orange);
        red=findViewById(R.id.red);



        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum=sum+1;
                Intent i=new Intent(Question_1.this, Question_2.class);
                i.putExtra("sum",Integer.toString(sum));

                startActivity(i);




            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sum=sum+2;
                Intent i = new Intent(Question_1.this,Question_2.class);
                i.putExtra("sum",Integer.toString(sum));
                startActivity(i);


            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sum=sum+3;
                Intent i=new Intent(Question_1.this, Question_2.class);
                i.putExtra("sum",Integer.toString(sum));

                startActivity(i);

            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sum=sum+4;
                Intent i=new Intent(Question_1.this, Question_2.class);
                i.putExtra("sum",Integer.toString(sum));

                startActivity(i);

            }
        });

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        Objects.requireNonNull(mSensorManager).registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_NORMAL);
        mAccel = 10f;
        mAccelCurrent = SensorManager.GRAVITY_EARTH;
        mAccelLast = SensorManager.GRAVITY_EARTH;

    }
    private final SensorEventListener mSensorListener = new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent event) {
            float x = event.values[0];
            float y = event.values[1];
            float z = event.values[2];
            String phoneme="9811058889";
            String message="testing gokul";

            mAccelLast = mAccelCurrent;
            mAccelCurrent = (float) Math.sqrt((double) (x * x + y * y + z * z));
            float delta = mAccelCurrent - mAccelLast;
            mAccel = mAccel * 0.10f + delta;
            if (mAccel > 12) {
                counter++;
            }

            if (counter >= 3) {
                counter = 0;



                Toast t = Toast.makeText(getApplicationContext(), "Don't Shake phone", Toast.LENGTH_LONG);
                t.show();
                SmsManager smsManager= getDefault();
                smsManager.sendTextMessage(phoneme,null,message,null,null);
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+phoneme));
                startActivity(callIntent);

            }
        }
        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    };
    @Override
    protected void onResume() {
        mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_NORMAL);
        super.onResume();
    }
    @Override
    protected void onPause() {
        mSensorManager.unregisterListener(mSensorListener);
        super.onPause();
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