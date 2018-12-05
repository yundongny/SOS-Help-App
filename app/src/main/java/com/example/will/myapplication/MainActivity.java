package com.example.will.myapplication;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageButton ProfilePicture = findViewById(R.id.ProfilePicture);
        ProfilePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ProfilePage.class);
                startActivity(intent);
            }
        });
        final Button GetHelp = findViewById(R.id.getHelpBtn);
        GetHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), JoinGroup.class);
                startActivity(intent);
            }
        });
        final Button GiveHelp = findViewById(R.id.giveHelpBtn);
        GiveHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), createGroup.class);
                startActivity(intent);
            }
        });

    }


}
