
package com.adorable.adespl.Activities.LoanItems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.adorable.adespl.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class LAPLoan extends AppCompatActivity {
    Button submitQuery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.activity_laploan);

        submitQuery = findViewById(R.id.submitquerylap);
        submitQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(LAPLoan.this, com.google.android.material.R.style.Theme_Design_BottomSheetDialog);
                bottomSheetDialog.setContentView(R.layout.bottomsheetlayout);
                bottomSheetDialog.show();
            }
        });

    }
}