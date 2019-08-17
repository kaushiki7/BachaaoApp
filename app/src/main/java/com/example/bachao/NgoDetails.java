package com.example.bachao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NgoDetails extends AppCompatActivity {

    TextView nm,ab,ct;
    Button visit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo_details);
        nm = findViewById(R.id.heading);
        ab = findViewById(R.id.about);
        ct = findViewById(R.id.contact);
        visit = findViewById(R.id.visit);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        if(name.equals("D"))
        {
            nm.setText("Direct Relief International");
            ct.setText("Contact: +18059644767");
            ab.setText("Direct Relief is a humanitarian aid organization. It’s active in all 50 states and 70 countries and has a mission to improve the health and lives of people affected by poverty or emergencies.");
            visit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://www.directrelief.org/");
                    Intent i = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                }
            });
        }
        else if(name.equals("I"))
        {
            nm.setText("International Red Cross");
            ct.setText("Contact: +41227346001");
            ab.setText("From small house fires to multi-state natural disasters, the American Red Cross goes wherever they’re needed so that people can have clean water, safe shelter, and hot meals when they need them most.");
            visit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://www.icrc.org/");
                    Intent i = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                }
            });
        }
        else if(name.equals("A"))
        {
            nm.setText("All Hands");
            ct.setText("Contact: 5087588211");
            ab.setText("All Hands is the world’s leading disaster relief organization powered by volunteers. Over the last ten years, they have enabled over 35,000 volunteers to donate 175,000 days impacting 500,000 people all over the globe.");
            visit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://www.allhandsandhearts.org/");
                    Intent i = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(i);
                }
            });
        }


    }
}
