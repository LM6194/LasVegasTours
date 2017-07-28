package com.example.luis.lasvegastours;

/**
 * Created by Luis on 6/29/2017.
 */

public class TourActivity {
    /** name of activity*/
    private String mName;
    /** website of activity*/
    private String mWebsite;
    /** location of the activity*/
    private String mAddress;
    /** picture of the Activity*/
    private int mImageResourseId;


    /**
     * Create a new Activity object
     * @param name of activity
     * @param website of activity
     * @param address of activity
     * @param mImageResourseId of activity
     */

    public TourActivity(String name, String website, String address, int mImageResourseId) {
        mName = name;
        mWebsite = website;
        mAddress = address;
        this.mImageResourseId = mImageResourseId;
    }

    public String getName() {return mName;}

    public String getWebsite() {
        return mWebsite;
    }

    public String getAddress() {
        return mAddress;
    }

    public int getImageResourseId(){return mImageResourseId;}

}
