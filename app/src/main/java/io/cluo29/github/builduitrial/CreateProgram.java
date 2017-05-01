package io.cluo29.github.builduitrial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by CLUO29 on 01/05/17.
 */

public class CreateProgram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createprogram);

        String s= getIntent().getStringExtra("CJJAWL");

        Log.d("CJJAWL",s);

    }
}
