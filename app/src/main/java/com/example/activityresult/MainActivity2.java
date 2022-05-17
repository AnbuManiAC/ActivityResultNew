package com.example.activityresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button add = findViewById(R.id.add);
        Button sub = findViewById(R.id.sub);
        TextView textView = findViewById(R.id.showNum);


        int num1 = getIntent().getIntExtra("num1",0);
        int num2 = getIntent().getIntExtra("num2",0);

        textView.setText("Numbers : "+" "+num1+" "+num2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getIntent().putExtra("result",num1+num2);
                setResult(RESULT_OK,getIntent());
                finish();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getIntent().putExtra("result",num1-num2);
                setResult(RESULT_OK,getIntent());
                finish();
            }
        });
    }
}