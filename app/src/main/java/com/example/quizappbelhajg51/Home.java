package com.example.quizappbelhajg51;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {
    Button bStart, bMap;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bStart = (Button) findViewById(R.id.bStart);
        bMap = (Button) findViewById(R.id.bMap);
        //button to see user info
        //hello "name || username text at the top"
        bStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this, Quiz1.class));
            }
        });
        bMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //step 4 :Traitement****************************************************************
                startActivity(new Intent(Home.this, MapActivityTest.class));

            }
        });
    }
}