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
public class The {
    int maThe;
    Date thoiHan;
    int maXe;
    String maKhachHang;
    String maLoai;

    public int getMaThe() {
        return maThe;
    }

    public void setMaThe(int maThe) {
        this.maThe = maThe;
    }

    public Date getThoiHan() {
        return thoiHan;
    }

    public void setThoiHan(Date thoiHan) {
        this.thoiHan = thoiHan;
    }

    public int getMaXe() {
        return maXe;
    }

    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public The() {
    }

    public The(int maThe, Date thoiHan, int maXe, String maKhachHang, String maLoai) {
        this.maThe = maThe;
        this.thoiHan = thoiHan;
        this.maXe = maXe;
        this.maKhachHang = maKhachHang;
        this.maLoai = maLoai;
    }
    
    
}
