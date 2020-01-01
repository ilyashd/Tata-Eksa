package com.example.tataeksa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class verivikasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verivikasi);

        Button berikut = (Button)findViewById(R.id.berikut);
        berikut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3 = new Intent(verivikasi.this,fin.class);

                int3.putExtra("nama", getIntent().getStringExtra("nama"));
                int3.putExtra("phone", getIntent().getStringExtra("phone"));
                startActivity(int3);
            }
        });
    }
    public void ambilGambar(View v){
        Intent i = new Intent(
                Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(i, 1);
    }
}
