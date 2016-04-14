package com.brilliant.sean.justdoit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by sean on 16. 4. 14.
 */
public class NumThree extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numthree);

        Button numthreeButton = (Button) findViewById(R.id.numthreeButton);
        numthreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gobackIntent3 = new Intent();
                finish();
            }
        });
    }
}
