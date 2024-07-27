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
    String maKhachHang;
    String hoTen;
    String SDT;
    String soDu;
    String hinhAnh;
    String maTaiKhoan;

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

    public String getSoDu() {
        return soDu;
    }

    public void setSoDu(String soDu) {
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

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String hoTen, String SDT, String soDu, String hinhAnh, String maTaiKhoan) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.SDT = SDT;
        this.soDu = soDu;
        this.hinhAnh = hinhAnh;
        this.maTaiKhoan = maTaiKhoan;
    }
    
    
}
