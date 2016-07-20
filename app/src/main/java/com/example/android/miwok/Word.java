package com.example.android.miwok;

/**
 * Created by Nexus on 7/11/2016.
 */
public class Word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {

        return mMiwokTranslation;


    }
}