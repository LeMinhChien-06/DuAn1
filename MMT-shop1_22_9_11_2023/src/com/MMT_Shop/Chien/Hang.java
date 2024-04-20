package com.MMT_Shop.Chien;

public class Hang {

    private int id;
    private String maHang;
    private String tenHang;
    private String created_At;
    private String updated_At;
    private String created_By;
    private String updated_By;
    private String deleted;

    public Hang() {
    }

    public Hang(int id, String maHang, String tenHang, String created_At, String updated_At, String created_By, String updated_By, String deleted) {
        this.id = id;
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.created_At = created_At;
        this.updated_At = updated_At;
        this.created_By = created_By;
        this.updated_By = updated_By;
        this.deleted = deleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getCreated_At() {
        return created_At;
    }

    public void setCreated_At(String created_At) {
        this.created_At = created_At;
    }

    public String getUpdated_At() {
        return updated_At;
    }

    public void setUpdated_At(String updated_At) {
        this.updated_At = updated_At;
    }

    public String getCreated_By() {
        return created_By;
    }

    public void setCreated_By(String created_By) {
        this.created_By = created_By;
    }

    public String getUpdated_By() {
        return updated_By;
    }

    public void setUpdated_By(String updated_By) {
        this.updated_By = updated_By;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

}
