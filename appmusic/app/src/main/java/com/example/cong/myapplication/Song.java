package com.example.cong.myapplication;

/**
 * Created by cong on 10/28/2017.
 */

public class Song {
    private String Title;
    private int File;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getFile() {
        return File;
    }

    public void setFile(int file) {
        File = file;
    }

    public Song(String title, int file) {

        Title = title;
        File = file;
    }
}




