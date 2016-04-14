package com.brilliant.sean.justdoit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by sean on 16. 4. 14.
 */
public class NumFive extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numfive);

        Button numfiveButton = (Button) findViewById(R.id.numfiveButton);
        numfiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gobackIntent5 = new Intent();
                finish();
            }
        });
    }
}
