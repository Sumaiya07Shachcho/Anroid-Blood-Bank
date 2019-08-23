package com.kayeswap.bloodbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Blood_Bank extends AppCompatActivity {

    Button beadonor, buser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood__bank);
            beadonor = findViewById(R.id.donorbtn);
            buser = findViewById(R.id.dlist);


            beadonor.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    startActivity(new Intent(Blood_Bank.this, Donor_Reg.class));
                }
            });

            buser.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    startActivity(new Intent(Blood_Bank.this, Blood_Group.class));
                }
            });


        }

}
