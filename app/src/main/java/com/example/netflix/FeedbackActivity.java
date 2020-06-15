package com.example.netflix;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FeedbackActivity extends AppCompatActivity {
    /*
        This acitivty handles providing the feedback about the application to the developers.
    */
    EditText name, feedback;
    Button submitBtn;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        name = (EditText) findViewById(R.id.Name);
        feedback = (EditText) findViewById(R.id.feedback);
        submitBtn = (Button) findViewById((R.id.submitBtn));

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = name.getText().toString();
                String feedBackTxt = feedback.getText().toString();
                //Get reference of the Real time database.
                reference = FirebaseDatabase.getInstance().getReference().child("Feedback:" + userName);
                //Push the values to the database.
                reference.push().setValue(feedBackTxt);

                name.setText("");
                feedback.setText("");

                Toast.makeText(FeedbackActivity.this, "Thank you for providing the feedback.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
