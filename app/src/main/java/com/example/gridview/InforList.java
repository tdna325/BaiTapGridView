package com.example.gridview;

public class InforList {
    private int gImage;
    private String gName;
    private String gAdd;
    private String gNum;

    public InforList(int gImage, String gName, String gAdd, String gNum) {
        this.gImage = gImage;
        this.gName = gName;
        this.gAdd = gAdd;
        this.gNum = gNum;
    }

    public int getgImage() {
        return gImage;
    }

    public void setgImage(int gImage) {
        this.gImage = gImage;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getgAdd() {
        return gAdd;
    }

    public void setgAdd(String gAdd) {
        this.gAdd = gAdd;
    }

    public String getgNum() {
        return gNum;
    }

    public void setgNum(String gNum) {
        this.gNum = gNum;
    }
}
