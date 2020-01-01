package com.example.tataeksa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class fin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_verification);

        final TextView txt= (TextView) findViewById(R.id.textView21);
        final TextView txt2= (TextView) findViewById(R.id.textView22);
        txt.setText(getIntent().getStringExtra("nama"));
        txt2.setText(getIntent().getStringExtra("phone"));


        Button back = (Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4 = new Intent(fin.this,MainActivity.class);
                startActivity(int4);

            }
            });
    }
}