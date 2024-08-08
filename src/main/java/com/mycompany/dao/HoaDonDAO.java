/*
 * Alăng Quân Sỹ
 * PD09903
 */
package com.mycompany.dao;

import com.mycompany.entity.HoaDon;
import com.mycompany.entity.The;
import com.mycompany.utils.jdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Just Share
 */
public class HoaDonDAO extends QuanLyXeMayDAO<HoaDon, Integer> {

    String INSERT_SQL = "insert into HoaDon(NgayBan,maKhachHang) values(?,?)";
    String SELECT_maHDMoi = "select Max(maHD) as maHD from HoaDon";

    @Override
    public void insert(HoaDon entity) {
        jdbc.update(INSERT_SQL, entity.getNgayBan(), entity.getMaKhachHang());
    }

    @Override
    public void update(HoaDon entity) {
    }

    @Override
    public void delete(Integer id) {
    }

    @Override
    public HoaDon selectById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public HoaDon timMaHDMoiNhat() {
        List<HoaDon> list = timMaHDMoi(SELECT_maHDMoi);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HoaDon> selectAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected List<HoaDon> selectBySQL(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    protected List<HoaDon> timMaHDMoi(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<HoaDon>();
        try {
            ResultSet rs = jdbc.query(sql, args);
            while (rs.next()) {
                HoaDon entity = new HoaDon();
                entity.setMaHD(rs.getInt("maHD"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
