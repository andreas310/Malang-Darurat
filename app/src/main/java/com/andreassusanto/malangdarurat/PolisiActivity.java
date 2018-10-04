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
 * Created by Kuncoro on 27/03/2016.
 */
public class PolisiActivity extends AppCompatActivity {

    /*Deklarasi variable*/
    Button btn_navigasi;
    String goolgeMap = "com.google.android.apps.maps"; // identitas package aplikasi google masps android
    Uri gmmIntentUri;
    Intent mapIntent;
    String polres_malang = "-7.930864, 112.648710"; // koordinat Polisi
    /*Deklarasi variable*/


    /*Deklarasi variable*/
    Button btn_navigasi1;
    String goolgeMap1 = "com.google.android.apps.maps"; // identitas package aplikasi google masps android
    Uri gmmIntentUri1;
    Intent mapIntent1;
    String rumah_sakit = "-7.993140, 112.648128"; // koordinat RSUD
    /*Deklarasi variable*/

    /*Deklarasi variable*/
    Button btn_navigasi2;
    String goolgeMap2 = "com.google.android.apps.maps"; // identitas package aplikasi google masps android
    Uri gmmIntentUri2;
    Intent mapIntent2;
    String pemadam_kebakaran = "-7.979790, 112.624870"; // koordinat Pemadam
    /*Deklarasi variable*/

    /*Deklarasi variable*/
    Button btn_navigasi3;
    String goolgeMap3 = "com.google.android.apps.maps"; // identitas package aplikasi google masps android
    Uri gmmIntentUri3;
    Intent mapIntent3;
    String pmi = "-7.938479, 112.632437"; // koordinat PMI
    /*Deklarasi variable*/

    /*Deklarasi variable*/
    Button btn_navigasi4;
    String goolgeMap4 = "com.google.android.apps.maps"; // identitas package aplikasi google masps android
    Uri gmmIntentUri4;
    Intent mapIntent4;
    String bpbd = "-8.003893, 112.618595"; // koordinat bpbd
    /*Deklarasi variable*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polisi);

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
                    Toast.makeText(PolisiActivity.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
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
                    Toast.makeText(PolisiActivity.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
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
                    Toast.makeText(PolisiActivity.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }

        });


        btn_navigasi3    = (Button) findViewById(R.id.btn_navigasi3);

        // tombol untuk menjalankan navigasi goolge maps intents
        btn_navigasi3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri3 = Uri.parse("google.navigation:q=" + pmi);

                // Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
                mapIntent3 = new Intent(Intent.ACTION_VIEW, gmmIntentUri3);

                // Set package Google Maps untuk tujuan aplikasi yang di Intent yaitu google maps
                mapIntent3.setPackage(goolgeMap3);

                if (mapIntent3.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent3);
                } else {
                    Toast.makeText(PolisiActivity.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }

        });


        btn_navigasi4    = (Button) findViewById(R.id.btn_navigasi4);

        // tombol untuk menjalankan navigasi goolge maps intents
        btn_navigasi4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri4 = Uri.parse("google.navigation:q=" + bpbd);

                // Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
                mapIntent4 = new Intent(Intent.ACTION_VIEW, gmmIntentUri4);

                // Set package Google Maps untuk tujuan aplikasi yang di Intent yaitu google maps
                mapIntent4.setPackage(goolgeMap4);

                if (mapIntent4.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent4);
                } else {
                    Toast.makeText(PolisiActivity.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }

        });


        Button panggil = (Button) findViewById(R.id.panggil);

        panggil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0341491304"));

                if (ActivityCompat.checkSelfPermission(PolisiActivity.this,
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
                callIntent.setData(Uri.parse("tel:0341325057"));

                if (ActivityCompat.checkSelfPermission(PolisiActivity.this,
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
                callIntent.setData(Uri.parse("tel:0341361667"));

                if (ActivityCompat.checkSelfPermission(PolisiActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }
        });


        Button panggil3 = (Button) findViewById(R.id.panggil3);

        panggil3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0341472392"));

                if (ActivityCompat.checkSelfPermission(PolisiActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }
        });


        Button panggil4 = (Button) findViewById(R.id.panggil4);

        panggil4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0341368638"));

                if (ActivityCompat.checkSelfPermission(PolisiActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }
        });


        Button twitter = (Button) findViewById(R.id.btn_twitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0){

                // Start NewActivity.class
                Intent myIntent = new Intent(PolisiActivity.this,
                        Activitykedung.class);
                startActivity(myIntent);

            }
        });

        Button twitter1 = (Button) findViewById(R.id.btn_twitter1);
        twitter1.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0){

                // Start NewActivity.class
                Intent myIntent = new Intent(PolisiActivity.this,
                        Activitylowok.class);
                startActivity(myIntent);

            }
        });



    }
}