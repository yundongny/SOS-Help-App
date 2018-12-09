package com.example.will.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        final ImageButton ProfilePicture = findViewById(R.id.ProfilePicture);
//        ProfilePicture.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(v.getContext(), ProfilePage.class);
//                startActivity(intent);
//            }
//        });
        final Button createGroupButton = findViewById(R.id.createGroupButton);
        createGroupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), createGroup.class);
                startActivity(intent);
            }
        });

        final RecyclerView recyclerView = findViewById(R.id.availableGroups);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));

        ListAdapter listAdapter = new ListAdapter(testData());
        recyclerView.setAdapter(listAdapter);
//.2
//        final Button GiveHelp = findViewById(R.id.giveHelpBtn);
//        GiveHelp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(v.getContext(), createGroup.class);
//                startActivity(intent);
//            }
//        });

    }
    private StudyGroupItem[] testData() {
        StudyGroupItem studyGroupItem1 = new StudyGroupItem();
        StudyGroupItem studyGroupItem2 = new StudyGroupItem();
        StudyGroupItem studyGroupItem3 = new StudyGroupItem();
        StudyGroupItem studyGroupItem4 = new StudyGroupItem();
        StudyGroupItem studyGroupItem5 = new StudyGroupItem();
        StudyGroupItem studyGroupItem6 = new StudyGroupItem();
        StudyGroupItem studyGroupItem7 = new StudyGroupItem();
        StudyGroupItem studyGroupItem8 = new StudyGroupItem();
        StudyGroupItem studyGroupItem9 = new StudyGroupItem();
        StudyGroupItem studyGroupItem10 = new StudyGroupItem();
        StudyGroupItem studyGroupItem11 = new StudyGroupItem();
        StudyGroupItem[] studyGroupItems = {studyGroupItem1, studyGroupItem2, studyGroupItem3,
                studyGroupItem4, studyGroupItem5, studyGroupItem6, studyGroupItem7, studyGroupItem8,
                studyGroupItem9, studyGroupItem10, studyGroupItem11};
        return studyGroupItems;
    }
}
