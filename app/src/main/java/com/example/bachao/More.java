package com.example.bachao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class More extends AppCompatActivity
{

    String[] list={"About us","Contact us","Join Us","Safety Measures"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(More.this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    Intent intent = new Intent(More.this,AboutUs.class);
                    startActivity(intent);
                }
                if(i==1)
                {
                    Intent intent1 = new Intent(More.this,ContactUs.class);
                    startActivity(intent1);
                }
                if(i==2)
                {
                    Intent intent2 = new Intent(More.this,JoinUs.class);
                    startActivity(intent2);
                }
                if(i==3)
                {
                    Intent intent3 = new Intent(More.this,StaySafe.class);
                    startActivity(intent3);
                }
            }
        });

    }
}
