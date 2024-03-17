package org.example.app.model;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int id;
    private String title;
    private String body;

    // constructors

    // getters and setters

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}