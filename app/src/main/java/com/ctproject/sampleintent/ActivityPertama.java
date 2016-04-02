package com.ctproject.sampleintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPertama extends AppCompatActivity {

    private Button pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertama);

        pindah = (Button) findViewById(R.id.bPindah);

        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(ActivityPertama.this, ActivityKedua.class);
                startActivity(pindah);
            }
        });
    }
}
