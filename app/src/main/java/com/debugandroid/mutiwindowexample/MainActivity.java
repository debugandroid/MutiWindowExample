package com.debugandroid.mutiwindowexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button firstBtn=(Button)findViewById(R.id.button);

        firstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,FirstActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        Button secondBtn= (Button) findViewById(R.id.button2);
        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT);
                 intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }
}
