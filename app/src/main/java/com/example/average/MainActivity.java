package com.example.average;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText num,snum;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        num=(EditText) findViewById(R.id.num);
        snum=(EditText) findViewById(R.id.snum);
        btn=(Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int base=Integer.parseInt(num.getText().toString());
                int power=Integer.parseInt(snum.getText().toString());
                int exp=power;
                long result=1;
                double sum=0.0;
                double avg=0.0;
                while(exp!=0)
                {
                    result=base*result;
                    exp--;
                }
                String s=String.valueOf((result));
                sum=base+power;
                avg=sum/2;

                String f=String.valueOf(avg);
                Intent intent=new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("pow",s);
                intent.putExtra("avg",f);
                startActivity(intent);


            }

        });



    }
}