package com.example.glassmorphism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.borutsky.neumorphism.NeumorphicFrameLayout;

public class View_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__page);

        TextView name = (TextView)findViewById(R.id.name);
        TextView email = (TextView)findViewById(R.id.email);
        TextView contact = (TextView)findViewById(R.id.number);
        TextView designation = (TextView)findViewById(R.id.position);

        Intent intent = getIntent();
        String str = intent.getStringExtra("name");
        String str1= intent.getStringExtra("email");
        String str2 = intent.getStringExtra("contact");
        String str3 = intent.getStringExtra("designation");

        name.setText(str);
        email.setText(str1);
        contact.setText(str2);
        designation.setText(str3);

        NeumorphicFrameLayout neomorphFrameLayout = findViewById(R.id.EditProfile);
        neomorphFrameLayout.setOnClickListener(v -> {
            Intent intent1 = new Intent(View_Page.this, MainActivity.class);
            startActivity(intent1);
        });




    }
}