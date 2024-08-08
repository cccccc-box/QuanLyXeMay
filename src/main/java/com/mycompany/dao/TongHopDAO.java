/*
 * Alăng Quân Sỹ
 * PD09903
 */
package com.mycompany.dao;

import com.mycompany.utils.jdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Just Share
 */
public class TongHopDAO {

    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = jdbc.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> getDanhSachTheTheoMaKH(String maKH) {
        String sql = "{CALL danhSachTheXeTheoMaKH(?)}";
        String[] cols = {"maThe", "bienSoXe", "maLoai", "thoiHan"};
        return this.getListOfArray(sql, cols, maKH);
    }

    public List<Object[]> getDanhSachHoaDonTHeoMaKH(String maKH) {
        String sql = "{CALL danhSachHoaDonTHeoMaKH(?)}";
        String[] cols = {"maHD", "maThe", "giaBan", "NgayBan"};
        return this.getListOfArray(sql, cols, maKH);
    }
    
        public List<Object[]> getLichSuXeRaVaoTheoMaXe(Integer maXe) {
        String sql = "{CALL lichSuXeRaVaoTheoMaXe(?)}";
        String[] cols = {"STT", "gioVao", "gioRa", "maNV", "maXe"};
        return this.getListOfArray(sql, cols, maXe);
    }

}
