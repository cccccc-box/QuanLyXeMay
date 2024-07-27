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
public class QuanLy {
    int STT;
    Date gioVao;
    Date gioRa;
    String maNV;
    int maXe;

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public Date getGioVao() {
        return gioVao;
    }

    public void setGioVao(Date gioVao) {
        this.gioVao = gioVao;
    }

    public Date getGioRa() {
        return gioRa;
    }

    public void setGioRa(Date gioRa) {
        this.gioRa = gioRa;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getMaXe() {
        return maXe;
    }

    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }

    public QuanLy() {
    }

    public QuanLy(int STT, Date gioVao, Date gioRa, String maNV, int maXe) {
        this.STT = STT;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        this.maNV = maNV;
        this.maXe = maXe;
    }
    
    
}
