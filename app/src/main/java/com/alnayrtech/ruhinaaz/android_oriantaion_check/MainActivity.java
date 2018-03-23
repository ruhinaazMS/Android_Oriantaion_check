package com.alnayrtech.ruhinaaz.android_oriantaion_check;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int orientation = this.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {

            Toast.makeText(MainActivity.this,"Oriatation portrait",Toast.LENGTH_LONG).show();
        } else {

           // Toast.makeText(MainActivity.this,"Oriatation landscapt",Toast.LENGTH_LONG).show();
            //code for landscape mode
        }
    }
}
