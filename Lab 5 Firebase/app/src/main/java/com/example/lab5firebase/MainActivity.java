package com.example.lab5firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn = (Button) findViewById(R.id.btn);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        EditText name = (EditText) findViewById(R.id.name);
        switch (view.getId()){
            case R.id.btn:
                DatabaseReference myRef = FirebaseDatabase.getInstance().getReference().child("Names");
                myRef.setValue(name.getText().toString());
                break;
        }
    }
}