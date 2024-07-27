/*
 * Alăng Quân Sỹ
 * PD09903
 */
package com.mycompany.entity;

/**
 *
 * @author Just Share
 */
public class HoaDonChiTiet {
    Double giaBan;
    int soLuongBan;
    String maThe;
    String maHD;

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(Double giaBan, int soLuongBan, String maThe, String maHD) {
        this.giaBan = giaBan;
        this.soLuongBan = soLuongBan;
        this.maThe = maThe;
        this.maHD = maHD;
    }
    
    
}
