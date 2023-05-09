package com.example.gossiper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class chatwin extends AppCompatActivity {

    String reciverimg,reciverUid,reciverName,SenderUID;
    CircleImageView profile;
    TextView reciverNName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatwin);
        getSupportActionBar().hide();

        reciverName=getIntent().getStringExtra("nameeee");
        reciverimg=getIntent().getStringExtra("reciverImg");
        reciverUid=getIntent().getStringExtra("uid");

        profile=findViewById(R.id.profileimgg);
        reciverNName= findViewById(R.id.recivername);
        Picasso.get().load(reciverimg).into(profile);
        reciverNName.setText(""+reciverName);




    }
}