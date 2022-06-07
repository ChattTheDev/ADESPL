
package com.adorable.adespl.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.adorable.adespl.Activities.LoanItems.BusinessLoan;
import com.adorable.adespl.Activities.LoanItems.CarLoan;
import com.adorable.adespl.Activities.LoanItems.HomeLoan;
import com.adorable.adespl.Activities.LoanItems.LAPLoan;
import com.adorable.adespl.Activities.LoanItems.PersonalLoan;
import com.adorable.adespl.R;
import com.google.android.material.button.MaterialButton;

public class Loan_Items extends AppCompatActivity {
    MaterialButton pLoan, bLoan, cLoan, hLoan, lLoan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_items);
        pLoan = findViewById(R.id.ploan);
        bLoan = findViewById(R.id.bloan);
        cLoan = findViewById(R.id.cloan);
        hLoan = findViewById(R.id.hloan);
        lLoan = findViewById(R.id.lloan);
        pLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PersonalLoan.class));
            }
        });
        bLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), BusinessLoan.class));
            }
        });
        cLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CarLoan.class));
            }
        });
        hLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HomeLoan.class));
            }
        });
        lLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LAPLoan.class));
            }
        });
    }
}