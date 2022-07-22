package com.prjucu.pawbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class common_illness extends AppCompatActivity {

    Button ear_infections, itchy_skin, dental_disease, vomiting, stiffness, urinary, obesity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_illness);

        ear_infections = findViewById(R.id.ear_infections);
        itchy_skin = findViewById(R.id.itchy_skin);
        dental_disease = findViewById(R.id.dental_disease);
        vomiting = findViewById(R.id.vomiting);
        stiffness = findViewById(R.id.stiffness);
        urinary = findViewById(R.id.urinary);
        obesity = findViewById(R.id.obesity);

        ear_infections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(common_illness.this, ear_infections.class));
            }
        });

        itchy_skin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(common_illness.this, itchy_skin.class));
            }
        });

        dental_disease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(common_illness.this, dental_disease.class));
            }
        });

        vomiting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(common_illness.this, vomiting.class));
            }
        });

        stiffness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(common_illness.this, stiffness.class));
            }
        });

        urinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(common_illness.this, urinary.class));
            }
        });

        obesity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(common_illness.this, obesity.class));
            }
        });
    }
}