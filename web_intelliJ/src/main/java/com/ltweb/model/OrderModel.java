package com.ltweb.model;

public class OrderModel extends AbstractModel {
    private int maDH;
    private int maSP;
    private int soluong;
    private long gia;
    private String time;
    private String trangthai;
    private String img;

    public OrderModel() {
    }

    public int getMaDH() {
        return maDH;
    }

    public void setMaDH(int maDH) {
        this.maDH = maDH;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    public String getGiaString(long a) {
        String result = "";int j=0;
        String gia = String.valueOf(a);
        for (int i = (gia.length() - 1); i >= 0; i--) {
            if (j%3==0&&j!=0){
                result="."+result;
            }
            result = gia.charAt(i) + result;
            j++;
        }
        return result;
    }
}
