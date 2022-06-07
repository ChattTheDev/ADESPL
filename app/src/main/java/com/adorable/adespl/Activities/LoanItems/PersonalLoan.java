package com.adorable.adespl.Activities.LoanItems;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.adorable.adespl.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class PersonalLoan extends AppCompatActivity {
    Button submitQuery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.activity_personal_loan);

        submitQuery = findViewById(R.id.submitquery);
        submitQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(PersonalLoan.this, com.google.android.material.R.style.Theme_Design_BottomSheetDialog);
                bottomSheetDialog.setContentView(R.layout.bottomsheetlayout);
                bottomSheetDialog.show();
            }
        });

    }
}