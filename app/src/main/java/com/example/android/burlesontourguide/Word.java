package com.example.android.burlesontourguide;

/**
 * {@link Word} represents a Burleson area of interest word that the user wants to learn.
 * It contains a picture, name and telephone number
 */
/**
 * {@link Word} represents a Burleson area of interest word that the user wants to learn.
 * It contains resource IDs for the picture, name and telephone number of interest
 */
public class Word {

    /** String resource ID for the default parks */
    private int mPlaceTranslationId;

    /** String resource ID for the default hotel */
    private int mNumberTranslationId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param placeTranslationId is the string resource ID for the place in Burleson
     * @param numberTranslationId is the string resource Id for the number in Burleson

     */
    public Word(int placeTranslationId, int numberTranslationId, int ImageResourceId ) {
        mPlaceTranslationId = placeTranslationId;
        mNumberTranslationId = numberTranslationId;
        mImageResourceId = ImageResourceId;
    }

    /**
     * Get the string resource ID for the default parks in Burleson.
     */
    public int getmPlaceTranslationId() {
        return mPlaceTranslationId;
    }

    /**
     * Get the string resource ID for the hotels in Burleson
     */
    public int getmNumberTranslationId() {
        return mNumberTranslationId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }



}