package com.adorable.adespl.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.adorable.adespl.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

public class Main_Dashboard extends AppCompatActivity {
    MaterialCardView loanservice, insuranceservice, contactus, aboutus;
    long back_pressed;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    FloatingActionButton navopenar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navview);
        navopenar = findViewById(R.id.opendrawer);

        loanservice = findViewById(R.id.loanservices);
        insuranceservice = findViewById(R.id.insuranceservices);
        contactus = findViewById(R.id.contact);
        aboutus = findViewById(R.id.about);

        navopenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item1:
//                        startActivity(new Intent(getApplicationContext(), Tracking.class));
                        break;
                    case R.id.item2:
//                        startActivity(new Intent(getApplicationContext(), Completed_Tasks.class));
                        break;
                    case R.id.item3:
//                        startActivity(new Intent(getApplicationContext(), Add_Payslip.class));
                        break;
                    case R.id.item4:
//                        startActivity(new Intent(getApplicationContext(), Attendance_Manager.class));
                        break;
                    case R.id.item5:
//                        startActivity(new Intent(getApplicationContext(), LeaveRequests.class));

                }
                drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });

        loanservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Loan_Items.class));
//                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });
        insuranceservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Insurance_Items.class));
//                overridePendingTransition(android.R.anim.fade_out, android.R.anim.fade_in);
            }
        });


    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);


        } else if (back_pressed + 1000 > System.currentTimeMillis()) {
            super.onBackPressed();
            Intent startMain = new Intent(Intent.ACTION_MAIN);
            startMain.addCategory(Intent.CATEGORY_HOME);
            startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(startMain);
        } else {
            Toast.makeText(getBaseContext(),
                            "Press once again to exit!", Toast.LENGTH_SHORT)
                    .show();
        }
        back_pressed = System.currentTimeMillis();


    }
}