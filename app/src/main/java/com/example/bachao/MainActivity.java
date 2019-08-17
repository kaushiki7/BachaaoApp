package com.example.bachao;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    SearchView searchView;
    Button b7, b8, b9, b10, b11, sub;
    TelephonyManager tm;
    GridView grid;
    String[] web = {"Medicine", "Food", "Clothes", "Donate"};
    int[] imageId = {R.drawable.doctorsbag, R.drawable.vegetarianfood, R.drawable.clothes, R.drawable.piggy};
    Spinner sp;
    String[] values = {"Select NGO","Direct Relief International","International Red Cross","All Hands"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = findViewById(R.id.search);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b10 = findViewById(R.id.button10);
        b11 = findViewById(R.id.button11);
        sp = findViewById(R.id.spinner);
        sub = findViewById(R.id.submit);

        searchView.setQueryHint("Search NGO's");

        ArrayAdapter<String> adap = new ArrayAdapter<String>(MainActivity.this,R.layout.spin_text,values);
        sp.setAdapter(adap);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                String ngo = values[i];
                if(ngo.equals("Direct Relief International"))
                {
                    Intent i1 = new Intent(MainActivity.this, NgoDetails.class);
                    i1.putExtra("name","D");
                    startActivity(i1);
                }
                else if(ngo.equals("International Red Cross"))
                {
                    Intent i2 = new Intent(MainActivity.this, NgoDetails.class);
                    i2.putExtra("name","I");
                    startActivity(i2);
                }
                else if(ngo.equals("All Hands"))
                {
                    Intent i3 = new Intent(MainActivity.this, NgoDetails.class);
                    i3.putExtra("name","A");
                    startActivity(i3);
                }

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        CustomGrid adapter = new CustomGrid(MainActivity.this, web, imageId);
        grid=findViewById(R.id.grid);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position)
                {
                    case 0: Intent intent1;
                        intent1 = new Intent(getApplicationContext(),Medicine.class);
                        startActivity(intent1);
                        break;

                    case 1: Intent intent2;
                        intent2 = new Intent(getApplicationContext(),CommonFC.class);
                        startActivity(intent2);
                        break;

                    case 2:Intent intent3;
                        intent3 = new Intent(getApplicationContext(),CommonFC.class);
                        startActivity(intent3);
                        break;

                    case 3: Intent intent4;
                    intent4 = new Intent(getApplicationContext(),Donate.class);
                    startActivity(intent4);
                    break;
                }

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7 = new Intent(Intent.ACTION_DIAL);
                i7.setData(Uri.parse("tel:123456789"));
                startActivity(i7);
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, DisasterType.class);
                startActivity(i);
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(Intent.ACTION_SENDTO);
                i4.setData(Uri.parse("mailto:" + "kaushiki71421@gmail.com"));
                try {
                    startActivity(i4);
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(MainActivity.this, "No email clients installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i11 = new Intent(MainActivity.this,More.class);
                startActivity(i11);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "You are one more step closer to get help. Enter some details about you.", Toast.LENGTH_SHORT).show();
                Intent s = new Intent(MainActivity.this,UserDetails.class);
                startActivity(s);
            }
        });
    }
}










