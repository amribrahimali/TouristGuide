package com.example.android.touristguide;

import static android.R.attr.name;

/**
 * Created by El.masry on 04/02/2018.
 */

public class Place {
    public String mName,mDesc;
    public int mImgId;
    public Place(String name,int imgId,String desc){
        mName=name;
        mImgId=imgId;
        mDesc=desc;
    }

    public String getmName() {
        return mName;
    }

    public int getmImgId() {
        return mImgId;
    }

    public String getmDesc() {
        return mDesc;
    }
}

