package com.brilliant.sean.justdoit;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView1;
    IconTextListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView1 = (ListView) findViewById(R.id.listView1);
        adapter = new IconTextListAdapter(this);

        Resources res = getResources();
        adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.iconimage1), "fear", "explain1"));
        adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.iconimage2), "achievement", "explain2"));
        adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.iconimage3), "present", "explain3"));
        adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.iconimage4), "happiness", "explain4"));
        adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.iconimage5), "posting or share", "explain5"));

        listView1.setAdapter(adapter);
        //리스트뷰에 어뎁터 연결

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent first = new Intent(getApplicationContext(), NumOne.class);
                        startActivity(first);
                        break;
                    case 1:
                        Intent second = new Intent(getApplicationContext(), NumTwo.class);
                        startActivity(second);
                        break;
                    case 2:
                        Intent third = new Intent(getApplicationContext(), NumThree.class);
                        startActivity(third);
                        break;
                    case 3:
                        Intent fourth = new Intent(getApplicationContext(), NumFour.class);
                        startActivity(fourth);
                        break;
                    case 4:
                        Intent fifth = new Intent(getApplicationContext(), NumFive.class);
                        startActivity(fifth);
                        break;

                }
            }
        });
    }
}
