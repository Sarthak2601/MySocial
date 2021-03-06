package com.example.mysocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class donorWindow extends AppCompatActivity {

    TextView causeReceiver,location,contact,date,requirement,accountn;
    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_window);

        button = findViewById(R.id.button2);

        causeReceiver = findViewById(R.id.Cause_Receiver);
        location = findViewById(R.id.Location_Receiver);
        contact = findViewById(R.id.Contact_Receiver);
        date = findViewById(R.id.Date_Receiver);
        requirement = findViewById(R.id.Requirement_Receiver);
        accountn = findViewById(R.id.AccountN_Receiver);


       Intent i = getIntent();
        String Cause = i.getStringExtra("Cause");
        String Location = i.getStringExtra("Location");
        String Contact = i.getStringExtra("ContactNumber");
        String Date = i.getStringExtra("Date");
        String Requirement = i.getStringExtra("Requirement");
        String AccountNum = i.getStringExtra("AccountNum");

       causeReceiver.setText("Cause: " + Cause);
       location.setText("Location: " + Location);
       contact.setText("Contact: "+Contact);
       date.setText("Date: "+Date);
       requirement.setText("Requirement: "+Requirement);
       accountn.setText("Account Number: "+AccountNum);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(donorWindow.this, payment.class));
           }
       });


    }
}
