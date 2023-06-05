package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

public class MessageActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSend;
    EditText etMessage;
    RecyclerView rvMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(this);
        etMessage = findViewById(R.id.etMessage);

        rvMessage = findViewById(R.id.rvMessage);
    }

    public void sendMessage() {
        FirebaseFirestore.getInstance().collection("messages").add("rrr");
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == btnSend.getId()) {
            sendMessage();
        }
    }
}