package com.example.da3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        final EditText number1 = findViewById(R.id.editTextTextPersonName);
        final EditText number2 = findViewById(R.id.editTextTextPersonName3);
        Button add = findViewById(R.id.button);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


           int n1 =Integer.parseInt(number1.getText().toString());
           int  n2 =Integer.parseInt(number2.getText().toString());
           int sum =n1+n2;



                Toast.makeText(MainActivity.this, sum + "", Toast.LENGTH_SHORT).show();
            }
        });




 }
}