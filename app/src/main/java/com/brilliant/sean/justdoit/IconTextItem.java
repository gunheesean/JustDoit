package com.brilliant.sean.justdoit;

import android.graphics.drawable.Drawable;

/**
 * Created by sean on 16. 4. 12.
 */
public class IconTextItem {
    private Drawable mIcon;
    private String[] mData;
    private boolean mSelectable;

    public IconTextItem(Drawable icon, String[] obj) {
        mIcon = icon;
        mData = obj;
    }

    public IconTextItem(Drawable icon, String obj1, String obj2) {
        mIcon = icon;

        mData = new String[3];
        mData[0] = obj1;
        mData[1] = obj2;
    }
    public boolean isSelectable() {
        return mSelectable;
    }
    public void setSelectable(boolean selectable) {
        mSelectable = selectable;
    }

    public String[] getmData() {
        return mData;
    }

    public String getData(int index) {
        if (mData == null || index >= mData.length) {
            return null;
        }
        return mData[index];
    }

    public void setData(String[] obj) {
        mData = obj;
    }

    public void setIcon(Drawable icon) {
        mIcon = icon;
    }

    public Drawable getIcon() {
        return mIcon;
    }
}
