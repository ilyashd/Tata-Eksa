package com.example.tataeksa;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class daftar_booking_detail extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbHelper;
    Button ton2;
    TextView nama, perusahaan, pj, tlvn, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_booking_detail);


        dbHelper = new DataHelper(this);
        nama = (TextView) findViewById(R.id.textView1);
        perusahaan = (TextView) findViewById(R.id.textView2);
        pj = (TextView) findViewById(R.id.textView3);
        tlvn = (TextView) findViewById(R.id.textView4);
        email = (TextView) findViewById(R.id.textView5);

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM biodata WHERE nama = '" +
                getIntent().getStringExtra("nama") + "'", null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            cursor.moveToPosition(0);
            nama.setText(cursor.getString(1).toString());
            perusahaan.setText(cursor.getString(2).toString());
            pj.setText(cursor.getString(3).toString());
            tlvn.setText(cursor.getString(4).toString());
            email.setText(cursor.getString(5).toString());
        }
        ton2 = (Button) findViewById(R.id.button1);
        ton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                finish();
            }
        });
    }
}