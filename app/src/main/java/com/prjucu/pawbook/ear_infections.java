
package com.prjucu.pawbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ear_infections extends AppCompatActivity {

    Button treatment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ear_infections);

        treatment = findViewById(R.id.treatment);

        treatment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ear_infections.this, ear_treatment.class));
            }
        });
    }
}