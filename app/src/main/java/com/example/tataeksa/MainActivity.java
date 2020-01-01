package com.example.tataeksa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton order = findViewById(R.id.order);
        order.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent int1 = new Intent(MainActivity.this,OrderPage.class);
                startActivity(int1);
            }
        });

        ImageButton imageButton8 = findViewById(R.id.imageButton8);
        imageButton8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(MainActivity.this, daftar_booking.class);
                startActivity(int3);

        }
        });

        Button article1 = (Button)findViewById(R.id.article1);
        article1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4 = new Intent(MainActivity.this,Article1.class);
                startActivity(int4);

            }
        });
    }
}
