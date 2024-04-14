package com.example.average;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    TextView txtaverage,txtpower;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        txtaverage=(TextView) findViewById(R.id.txtaverage);
        txtpower=(TextView) findViewById(R.id.txtpower);
        btn2=(Button) findViewById((R.id.btn2));
        Intent intent=getIntent();
        String pow=intent.getStringExtra("pow");
        String avg=intent.getStringExtra("avg");

        txtpower.setText(pow);
        txtaverage.setText(avg);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}