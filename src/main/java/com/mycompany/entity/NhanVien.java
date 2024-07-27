/*
 * Alăng Quân Sỹ
 * PD09903
 */
package com.mycompany.entity;

/**
 *
 * @author Just Share
 */
public class NhanVien {
    String maNV;
    String hoTenNV;
    String SDT;
    String CCCD;
    String vaiTro;
    String hinhAnh;
    String maTaiKhoan;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTenNV() {
        return hoTenNV;
    }

    public void setHoTenNV(String hoTenNV) {
        this.hoTenNV = hoTenNV;
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

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
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

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTenNV, String SDT, String CCCD, String vaiTro, String hinhAnh, String maTaiKhoan) {
        this.maNV = maNV;
        this.hoTenNV = hoTenNV;
        this.SDT = SDT;
        this.CCCD = CCCD;
        this.vaiTro = vaiTro;
        this.hinhAnh = hinhAnh;
        this.maTaiKhoan = maTaiKhoan;
    }
    
    
}
