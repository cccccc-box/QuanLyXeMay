/*
 * Alăng Quân Sỹ
 * PD09903
 */
package com.mycompany.entity;

/**
 *
 * @author Just Share
 */
public class XeMay {
    int maXe;
    String bienSoXe;
    String hangXe;
    boolean tinhTrang;
    String maKhachHang;

    public int getMaXe() {
        return maXe;
    }

    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public XeMay() {
    }

    public XeMay(int maXe, String bienSoXe, String hangXe, boolean tinhTrang, String maKhachHang) {
        this.maXe = maXe;
        this.bienSoXe = bienSoXe;
        this.hangXe = hangXe;
        this.tinhTrang = tinhTrang;
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString() {
        return this.bienSoXe;
    }
    
    
}
