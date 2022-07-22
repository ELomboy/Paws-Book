package com.prjucu.pawbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class urinary extends AppCompatActivity {

    Button treatment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urinary);

        treatment = findViewById(R.id.treatment);

        treatment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(urinary.this, urinary_treatment.class));
            }
        });
    }
}