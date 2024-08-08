/*
 * Alăng Quân Sỹ
 * PD09903
 */
package com.mycompany.utils;

import com.mycompany.dao.KhachHangDAO;
import com.mycompany.entity.KhachHang;
import com.mycompany.entity.TaiKhoan;

/**
 *
 * @author Just Share
 */
public class Auth {

    public static TaiKhoan user = null;

    public static void clear() {
        Auth.user = null;
    }

    public static boolean isLogin() {
        return Auth.user != null;
        }

    public static String quyenTruyCap() {
        String quyen;
        if (Auth.user.getQuyen() == 1) {
            quyen="quanLy";
        } else if(Auth.user.getQuyen() == 2){
            quyen="baoVe";
        }
        else{
            quyen="khachHang";
        }
        return quyen;
    }
    public static KhachHang layMaKhachHang(){
        String maTK=user.getMaTaiKhoan();
        KhachHangDAO dao = new KhachHangDAO();
        KhachHang kh=dao.slectByMaTK(maTK);
        return kh;
    }

}
