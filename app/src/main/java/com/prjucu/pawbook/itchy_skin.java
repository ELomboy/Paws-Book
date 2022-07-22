package com.prjucu.pawbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class itchy_skin extends AppCompatActivity {

    Button treatment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itchy_skin);

        treatment = findViewById(R.id.treatment);

        treatment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(itchy_skin.this, itchy_treatment.class));
            }
        });
    }
}