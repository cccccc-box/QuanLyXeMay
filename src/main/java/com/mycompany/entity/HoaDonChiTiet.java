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
    int maThe;
    int maHD;

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public int getMaThe() {
        return maThe;
    }

    public void setMaThe(int maThe) {
        this.maThe = maThe;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(Double giaBan, int maThe, int maHD) {
        this.giaBan = giaBan;
        this.maThe = maThe;
        this.maHD = maHD;
    }


    
    
}
