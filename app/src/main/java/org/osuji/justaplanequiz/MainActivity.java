package org.osuji.justaplanequiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.osuji.justaplanequiz.Activities.SetsActivity;

public class MainActivity extends AppCompatActivity {

    CardView airport,aerodynamics, pilot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        pilot = findViewById(R.id.Pilot);
        airport = findViewById(R.id.Airport);
        aerodynamics = findViewById(R.id.Aerodynamics);

        pilot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SetsActivity.class);
                startActivity(intent);
            }
        });
    }
}