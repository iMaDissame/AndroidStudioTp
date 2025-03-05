package com.example.seance2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView nomprenom;
    private TextView email;
    private TextView phone;
    private TextView adresse;
    private TextView ville;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        nomprenom = findViewById(R.id.nomprenom);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        adresse = findViewById(R.id.adresse);
        ville = findViewById(R.id.ville);
        Intent intent = getIntent();
        String nomPrenom = intent.getStringExtra("nomPrenom");
        String emailText = intent.getStringExtra("email");
        String phoneText = intent.getStringExtra("phone");
        String adresseText = intent.getStringExtra("adresse");
        String villeText = intent.getStringExtra("ville");
        nomprenom.setText(nomPrenom);
        email.setText(emailText);
        phone.setText(phoneText);
        adresse.setText(adresseText);
        ville.setText(villeText);





    }
}