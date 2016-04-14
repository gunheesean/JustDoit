package com.brilliant.sean.justdoit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by sean on 16. 4. 13.
 */
public class NumOne extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numone);

        Button numoneButton = (Button) findViewById(R.id.numoneButton);
        numoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gobackIntent1 = new Intent();
                finish();
            }
        });

    }
}
