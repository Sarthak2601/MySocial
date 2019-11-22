package com.example.mysocial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



import java.util.ArrayList;

public class receiverWindow extends AppCompatActivity {
    EditText cause, location,contact_number,date,requirement,accountNum ;
    Button postCause;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver_window);

        cause = findViewById(R.id.editText);
        location = findViewById(R.id.editText2);
        contact_number = findViewById(R.id.editText6);
        date = findViewById(R.id.date);
        requirement = findViewById(R.id.req1);
        accountNum = findViewById(R.id.req2);
        postCause = findViewById(R.id.postcause);






        postCause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(receiverWindow.this, donorWindow.class);
                intent.putExtra("Cause", cause.getText().toString());
                intent.putExtra("Location", location.getText().toString());
                intent.putExtra("ContactNumber", contact_number.getText().toString());
                intent.putExtra("Date", date.getText().toString());
                intent.putExtra("Requirement", requirement.getText().toString());
                intent.putExtra("AccountNum", accountNum.getText().toString());

                startActivity(intent);
                finish();

            }
        });

    }


}
