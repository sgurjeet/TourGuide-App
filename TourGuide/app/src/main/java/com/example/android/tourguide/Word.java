package com.example.android.tourguide;

/**
 * Created by Gurjeet on 04-Feb-17.
 */

public class Word {
    private String mTitle;
    private String mLoc;
    private int mImage;
    public Word(String title,String loc,int image)    //set all variables
    {   mTitle=title;
        mLoc=loc;
        mImage=image;
    }
    public int getImage()
    {   return mImage;}
    public String getTitle(){   //return title
        return mTitle; }
    public String getLoc(){  //return location
        return mLoc;
    }

}
