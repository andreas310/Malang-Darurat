package com.andreassusanto.malangdarurat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by POPO on 1/16/2018.
 */

public class MainActivity extends AppCompatActivity {

    /*Deklarasi variable*/
    Button btn_navigasi;
    String goolgeMap = "com.google.android.apps.maps"; // identitas package aplikasi google masps android
    Uri gmmIntentUri;
    Intent mapIntent;
    String polres_malang = "-7.992669, 112.629061"; // koordinat Polisi
    /*Deklarasi variable*/


    /*Deklarasi variable*/
    Button btn_navigasi1;
    String goolgeMap1 = "com.google.android.apps.maps"; // identitas package aplikasi google masps android
    Uri gmmIntentUri1;
    Intent mapIntent1;
    String rumah_sakit = "-7.972116, 112.627460"; // koordinat RSUD
    /*Deklarasi variable*/

    /*Deklarasi variable*/
    Button btn_navigasi2;
    String goolgeMap2 = "com.google.android.apps.maps"; // identitas package aplikasi google masps android
    Uri gmmIntentUri2;
    Intent mapIntent2;
    String pemadam_kebakaran = "-7.979790, 112.624870"; // koordinat Pemadam
    /*Deklarasi variable*/





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // menyamakan variable pada layout activity_main.xml
        btn_navigasi    = (Button) findViewById(R.id.btn_navigasi);

        // tombol untuk menjalankan navigasi goolge maps intents
        btn_navigasi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri = Uri.parse("google.navigation:q=" + polres_malang);

                // Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
                mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

                // Set package Google Maps untuk tujuan aplikasi yang di Intent yaitu google maps
                mapIntent.setPackage(goolgeMap);

                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(MainActivity.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }

        });


        btn_navigasi1    = (Button) findViewById(R.id.btn_navigasi1);

        // tombol untuk menjalankan navigasi goolge maps intents
        btn_navigasi1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri1 = Uri.parse("google.navigation:q=" + rumah_sakit);

                // Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
                mapIntent1 = new Intent(Intent.ACTION_VIEW, gmmIntentUri1);

                // Set package Google Maps untuk tujuan aplikasi yang di Intent yaitu google maps
                mapIntent1.setPackage(goolgeMap1);

                if (mapIntent1.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent1);
                } else {
                    Toast.makeText(MainActivity.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }

        });


        btn_navigasi2    = (Button) findViewById(R.id.btn_navigasi2);

        // tombol untuk menjalankan navigasi goolge maps intents
        btn_navigasi2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri2 = Uri.parse("google.navigation:q=" + pemadam_kebakaran);

                // Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
                mapIntent2 = new Intent(Intent.ACTION_VIEW, gmmIntentUri2);

                // Set package Google Maps untuk tujuan aplikasi yang di Intent yaitu google maps
                mapIntent2.setPackage(goolgeMap2);

                if (mapIntent2.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent2);
                } else {
                    Toast.makeText(MainActivity.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }

        });





        Button klik = (Button) findViewById(R.id.btn_klik);

        klik.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0){

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        PolisiActivity.class);
                startActivity(myIntent);

            }
        });


        Button klik2 = (Button) findViewById(R.id.btn_klik2);
        klik2.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0){

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        RsActivity.class);
                startActivity(myIntent);

            }
        });


        Button panggil = (Button) findViewById(R.id.panggil);

        panggil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0341362222"));

                if (ActivityCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }
        });


        Button panggil1 = (Button) findViewById(R.id.panggil1);

        panggil1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0341324018"));

                if (ActivityCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }
        });


        Button panggil2 = (Button) findViewById(R.id.panggil2);

        panggil2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:03413021657"));

                if (ActivityCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }
        });


        Button about = (Button) findViewById(R.id.btn_about);
        about.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0){

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        AboutActivity.class);
                startActivity(myIntent);

            }
        });


        Button twitter = (Button) findViewById(R.id.btn_twitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0){

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        Activitypmi.class);
                startActivity(myIntent);

            }
        });

        Button twitter1 = (Button) findViewById(R.id.btn_twitter1);
        twitter1.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0){

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        Activitybpdb.class);
                startActivity(myIntent);

            }
        });
    }
}
