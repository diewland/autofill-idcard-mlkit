package com.diewland.card_autofill_mlkit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText text_idcard;
    private Button btn_idcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_idcard = findViewById(R.id.btn_idcard);
        text_idcard = findViewById(R.id.text_idcard);

        btn_idcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, LivePreviewActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        String id_card = getIntent().getStringExtra("ID_CARD");
        text_idcard.setText(id_card);
    }
}
