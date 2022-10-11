package com.firstapp.foodwaste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
RelativeLayout searchfood,donatefood,updatefood,mycart,myorder,createcity,createplace,myprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchfood=findViewById(R.id.searchfood);
        donatefood=findViewById(R.id.donatefood);
        updatefood=findViewById(R.id.updatefood);
        mycart=findViewById(R.id.mycart);
        myorder=findViewById(R.id.myorder);
        createcity=findViewById(R.id.createcity);
        createplace=findViewById(R.id.createplace);
        myprofile=findViewById(R.id.myprofile);
        searchfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {
                Intent intent = new Intent(MainActivity.this,Searchfood.class);
                startActivity(intent);
            }

        } );
        donatefood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Donatefood.class);
                startActivity(intent);

            }
        });
        updatefood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,updatefood.class);
                startActivity(intent);

            }
        });
        mycart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,mycart.class);
                startActivity(intent);

            }
        });
        myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,myorder.class);
                startActivity(intent);

            }
        });
        createcity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,createcity.class);
                startActivity(intent);

            }
        });
        createplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,createplace.class);
                startActivity(intent);

            }
        });
        myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,myprofile.class);
                startActivity(intent);

            }
        });

    }

}

