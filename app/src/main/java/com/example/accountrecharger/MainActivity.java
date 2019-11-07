package com.example.accountrecharger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView dialog_card = findViewById(R.id.dialog_card);
        CardView mobitel_card = findViewById(R.id.mobitel_card);

        dialog_card.setOnClickListener(this);
        mobitel_card.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.dialog_card:
                intent = new Intent(this, Dialog_Account_Recharge.class);
                startActivity(intent);
                break;
            case R.id.mobitel_card:
                System.out.println("Button 2 Clicked!!!");
                break;
            default:
                break;
        }
    }

}

