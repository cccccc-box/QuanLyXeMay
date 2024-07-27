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
    String maHD;
    Date ngayBan;
    String maKhachHang;
    String maNV;

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
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

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public HoaDon() {
    }

    public HoaDon(String maHD, Date ngayBan, String maKhachHang, String maNV) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.maKhachHang = maKhachHang;
        this.maNV = maNV;
    }
    
    
}
