package com.example.dila.pedulipendidikan_dila;

public class Post {
    String id;
    private String userID;
    private String username;
    private String titlePost;
    private String lokasi;
    private String jumlah;
    private String deskripsi;
    private String imagePost;

    //Wajib kasih Constructor Kosong
    public Post() {
    }

    public Post(String id, String userID, String username, String mImagePost, String titlePost, String jumlah, String lokasi, String deskripsi) {
        this.id = id;
        this.username = username;
        this.imagePost = mImagePost;
        this.titlePost = titlePost;
        this.lokasi = lokasi;
        this.jumlah = jumlah;
        this.deskripsi =deskripsi;
        this.userID = userID;
    }

    public String getImagePost() {
        return imagePost;
    }

    public String getUserID() {
        return userID;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getTitlePost() {
        return titlePost;
    }

    public String getJumlah() {
        return jumlah;
    }
    public String getLokasi() {
        return lokasi;
    }
    public String getDeskripsi() {
        return deskripsi;
    }

}
