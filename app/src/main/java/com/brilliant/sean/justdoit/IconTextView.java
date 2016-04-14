package com.brilliant.sean.justdoit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by sean on 16. 4. 12.
 */
public class IconTextView extends LinearLayout {
    private ImageView mIcon;
    private TextView mText1;
    private TextView mText2;

    public IconTextView(Context context, IconTextItem aItem) {
        super(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.main_listitem, this, true);

        mIcon = (ImageView) findViewById(R.id.iconItem);
        mIcon.setImageDrawable(aItem.getIcon());

        mText1 = (TextView) findViewById(R.id.dataItem1);
        mText1.setText(aItem.getData(0));

        mText2 = (TextView) findViewById(R.id.dataItem2);
        mText2.setText(aItem.getData(1));
    }

    public void setText(int index, String data) {     //메뉴안에 텍스트뷰 두개니까 []안에 인덱스로 설정
        if (index == 0) {
            mText1.setText(data);
        } else if (index == 1) {
            mText2.setText(data);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setIcon(Drawable icon) {
        mIcon.setImageDrawable(icon);
    }

}
