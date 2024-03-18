package com.example.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to UI elements
        final EditText inputField = findViewById(R.id.input_field);
        Button factorialButton = findViewById(R.id.factorial_button);

        // Set up the "Explicit Intent" button
        factorialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the input number from the text field
                int inputNumber = Integer.parseInt(inputField.getText().toString());

                // Create an Intent to start the FactorialActivity
                Intent explicitIntent = new Intent(MainActivity.this, MainActivity2.class);
                // Pass the input number as an extra
                explicitIntent.putExtra("input_number", inputNumber);

                // Start the FactorialActivity
                startActivity(explicitIntent);
            }
        });
    }
}
