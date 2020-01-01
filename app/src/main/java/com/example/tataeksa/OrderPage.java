package com.example.tataeksa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;


import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;


public class OrderPage extends AppCompatActivity {
    EditText nama,perusahaan,pj,phone,email;
    DataHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_page);
        dbHelper = new DataHelper(this);

        nama = (EditText) findViewById(R.id.textInputEditText9);
        perusahaan = (EditText) findViewById(R.id.textInputEditText);
        pj = (EditText) findViewById(R.id.textInputEditText2);
        phone = (EditText) findViewById(R.id.textInputEditText3);
        email = (EditText) findViewById(R.id.textInputEditText4);

        Button con = (Button)findViewById(R.id.con);

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(OrderPage.this,verivikasi.class);
                int2.putExtra("nama", nama.getText().toString());
                int2.putExtra("phone", phone.getText().toString());
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("insert into biodata(nama, perusahaan, pj, phone,email) values('" +
                        nama.getText().toString() + "','" +
                        perusahaan.getText().toString() + "','" +
                        pj.getText().toString() + "','" +
                        phone.getText().toString() + "','" +
                        email.getText().toString() + "')");
//                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
//               daftar_booking.ma.RefreshList();
//                finish();
                startActivity(int2);

            }
        });
    }
}
