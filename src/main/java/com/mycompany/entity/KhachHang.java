/*
 * Alăng Quân Sỹ
 * PD09903
 */
package com.mycompany.entity;

/**
 *
 * @author Just Share
 */
public class KhachHang {

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public Double getSoDu() {
        return soDu;
    }

    public void setSoDu(Double soDu) {
        this.soDu = soDu;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }
    String maKhachHang;
    String hoTen;
    String SDT;
    String CCCD;
    Double soDu;
    String hinhAnh;
    String maTaiKhoan;

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String hoTen, String SDT, String CCCD, Double soDu, String hinhAnh, String maTaiKhoan) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.SDT = SDT;
        this.CCCD = CCCD;
        this.soDu = soDu;
        this.hinhAnh = hinhAnh;
        this.maTaiKhoan = maTaiKhoan;
    }
}
