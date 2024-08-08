/*
 * Alăng Quân Sỹ
 * PD09903
 */
package com.mycompany.dao;

import com.mycompany.entity.HoaDonChiTiet;
import com.mycompany.utils.jdbc;
import java.util.List;

/**
 *
 * @author Just Share
 */
public class HoaDonChiTietDAO extends QuanLyXeMayDAO<HoaDonChiTiet, Integer> {

    String INSERT_SQL = "insert into HoaDonChiTiet(giaBan,maThe,maHD) values(?,?,?)";

    @Override
    public void insert(HoaDonChiTiet entity) {
        jdbc.update(INSERT_SQL, entity.getGiaBan(), entity.getMaThe(), entity.getMaHD());
    }

    @Override
    public void update(HoaDonChiTiet entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public HoaDonChiTiet selectById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<HoaDonChiTiet> selectAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected List<HoaDonChiTiet> selectBySQL(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
