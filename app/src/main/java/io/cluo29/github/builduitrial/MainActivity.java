package io.cluo29.github.builduitrial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button create = (Button) findViewById(R.id.button);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //ManageReplay
                Intent i = new Intent( getApplicationContext(), CreateProgram.class);
                i.putExtra("CJJAWL","cjjawl");
                startActivity(i);
            }
        });

    }
}
