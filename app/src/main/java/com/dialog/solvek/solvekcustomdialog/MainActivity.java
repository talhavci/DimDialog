package com.dialog.solvek.solvekcustomdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.dialog.solvek.dimdialog.DimDialog;
import com.dialog.solvek.dimdialog.DimDialogClickListener;
import com.dialog.solvek.dimdialog.DimDialogIcon;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dimdialog(View view){
        new DimDialog(this).setTitle("DimDialog Title")
            .setMessage("DimDialog message. Something write...")
            .setCancelable(true)
            .setIcon(DimDialogIcon.QUESTION)
            .setNegativeButtonColor(R.color.red)
            .setPositiveButtonColor(android.R.color.holo_orange_dark)
            .setNormalButtonColor(R.color.colorPrimaryDark)
            .setButtonNormalListener("Remind Me Later", new DimDialogClickListener() {
                @Override
                public void onClick() {
                    // do something
                }
            }).setButtonPositiveListener("Interested", new DimDialogClickListener() {
                @Override
                public void onClick() {
                    // do something
                }
            }).setButtonNegativeListener("Not Interested", new DimDialogClickListener() {
                @Override
                public void onClick() {
                    // do something
                }
            }).show();
    }
}
