/*
 * Alăng Quân Sỹ
 * PD09903
 */
package com.mycompany.entity;

import java.util.Date;

/**
 *
 * @author Just Share
 */
public class HoaDon {
    int maHD;
    Date ngayBan;
    String maKhachHang;

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public HoaDon() {
    }

    public HoaDon(int maHD, Date ngayBan, String maKhachHang) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.maKhachHang = maKhachHang;
    }
    
}
