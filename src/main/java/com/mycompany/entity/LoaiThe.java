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
public class LoaiThe {
    String maLoai;
    String tenLoai;
    Double giaTien;
    Date ngayApDung;

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public Double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(Double giaTien) {
        this.giaTien = giaTien;
    }

    public Date getNgayApDung() {
        return ngayApDung;
    }

    public void setNgayApDung(Date ngayApDung) {
        this.ngayApDung = ngayApDung;
    }

    public LoaiThe() {
    }

    public LoaiThe(String maLoai, String tenLoai, Double giaTien, Date ngayApDung) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.giaTien = giaTien;
        this.ngayApDung = ngayApDung;
    }

    @Override
    public String toString() {
        return this.tenLoai;
    }
    
    
    
}
