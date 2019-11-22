package com.example.mysocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class receiverWindow extends AppCompatActivity {
    EditText cause, location,contact_number,date,requirement,accountNum ;
    Button postCause;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference causeDataRef = database.getReference("Cause");
   // DatabaseReference databaseReference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver_window);

        cause = findViewById(R.id.editText);
        location = findViewById(R.id.editText2);
      //  contact_number = findViewById(R.id.editText6);
        //date = findViewById(R.id.date);
        requirement = findViewById(R.id.req1);
       // accountNum = findViewById(R.id.req2);

        postCause = findViewById(R.id.postcause);




     //final DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
      //  final DatabaseReference locationDataRef = FirebaseDatabase.getInstance().getReference("Tasks");
      //  final DatabaseReference contactDataRef = FirebaseDatabase.getInstance().getReference("Tasks");
      //  final DatabaseReference dateDataRef = FirebaseDatabase.getInstance().getReference("Tasks");
      //  final DatabaseReference requirementDataRef = FirebaseDatabase.getInstance().getReference("Tasks");
      //  final DatabaseReference AccNoDataRef = FirebaseDatabase.getInstance().getReference("Tasks");


        postCause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(receiverWindow.this, donorWindow.class));

               causeDataRef.setValue(cause.getText().toString());


             //   locationDataRef.child("Location").setValue(location);
             //   contactDataRef.child("Contact Number").setValue(contact_number);
             //   dateDataRef.child("Date").setValue(date);
             //   requirementDataRef.child("Requirement").setValue(requirement);
             //   AccNoDataRef.child("Requirement").setValue(accountNum);

            }
        });

    }
}
