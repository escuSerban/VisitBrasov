package com.example.p7visitbrasov;

public class Contents {

    /**
     * String resource ID for the title of the content
     */
    private String mTitle;

    /**
     * String resource ID for the description of the content
     */
    private String mDescription;

    /**
     * String resource ID for the contact details of the content
     */
    private String mContact;

    /**
     * Image resource ID for the content
     */
    private int mImageResourceId;

    /**
     * Create a new Contents object.
     *
     * @param title           is the string resource Id for each content such as hotels, restaurants or attractions
     * @param description     is the string resource Id for the content description
     * @param contact         is the resource ID for the contact details of each content
     * @param imageResourceId is the drawable resource ID for the image associated with the content
     */
    public Contents(int imageResourceId, String title, String description, String contact) {
        mTitle = title;
        mDescription = description;
        mContact = contact;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the title of the content.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Get the string resource ID for the description of the content.
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Get the string resource ID for the contact details of the content.
     */
    public String getContact() {
        return mContact;
    }

    /**
     * Return the image resource ID of the content.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
