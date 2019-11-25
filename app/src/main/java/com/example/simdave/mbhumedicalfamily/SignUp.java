package com.example.simdave.mbhumedicalfamily;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    private TextView haveAccountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        haveAccountTextView = findViewById(R.id.haveAccountTextView);
        haveAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent haveAccountIntent = new Intent(SignUp.this, Login.class);
                startActivity(haveAccountIntent);
            }
        });

    }
}
