package com.example.naveen.hogwartsexpress;

public class News {
   private String mSection;
   private String mTitle;
   private String mDate;
   private String mUrl;
   private String mAuthor;

    public News(String Section, String Title, String Date, String Url, String Author) {
        mSection = Section;
        mTitle = Title;
        mDate = Date;
        mUrl = Url;
        mAuthor = Author;
    }

    public String getmSection() {
        return mSection;
    }
    public String getmTitle() {
        return mTitle;
    }
    public String getmDate() {
        return mDate;
    }
    public String getmUrl() {
        return mUrl;
    }
    public String getmAuthor() {
        return mAuthor;
    }
}
