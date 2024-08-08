/*
 * Alăng Quân Sỹ
 * PD09903
 */
package com.mycompany.dao;

import com.mycompany.entity.LoaiThe;
import com.mycompany.utils.jdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Just Share
 */
public class LoaiTheDAO extends QuanLyXeMayDAO<LoaiThe, String> {

    String INSERT_SQL = "insert into LoaiThe(maLoai,tenLoai,giaTien,ngayApDung) values(?,?,?,?)";
    String UPDATE_SQL = "update LoaiThe set tenLoai=?, giaTien=?, ngayApDung=? where maLoai=?";
    String DELETE_SQL = "delete from LoaiThe where maLoai =?";
    String SELECT_ALL_SQL = "select * from LoaiThe";
    String SELECT_BY_ID_SQL = "select * from LoaiThe where maLoai=?";
    String SELECT_TENLOAITHE = "select tenLoai from LoaiThe";

    @Override
    public void insert(LoaiThe entity) {
        jdbc.update(INSERT_SQL, entity.getMaLoai(), entity.getTenLoai(), entity.getGiaTien(), entity.getNgayApDung());
    }

    @Override
    public void update(LoaiThe entity) {
        jdbc.update(UPDATE_SQL, entity.getTenLoai(), entity.getGiaTien(), entity.getNgayApDung(), entity.getMaLoai());
    }

    @Override
    public void delete(String id) {

        jdbc.update(DELETE_SQL, id);
    }

    @Override
    public LoaiThe selectById(String id) {
        List<LoaiThe> list = selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<LoaiThe> selectAll() {
        return selectBySQL(SELECT_ALL_SQL);
    }

    public List<LoaiThe> selectTenLoaiThe() {
        return selectForTenLoaiThe(SELECT_TENLOAITHE);
    }

    @Override
    protected List<LoaiThe> selectBySQL(String sql, Object... args) {
        List<LoaiThe> list = new ArrayList<LoaiThe>();
        try {
            ResultSet rs = jdbc.query(sql, args);
            while (rs.next()) {
                LoaiThe entity = new LoaiThe();
                entity.setMaLoai(rs.getString("maLoai"));
                entity.setTenLoai(rs.getString("tenLoai"));
                entity.setGiaTien(rs.getDouble("giaTien"));
                entity.setNgayApDung(rs.getDate("ngayApDung"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
        protected List<LoaiThe> selectForTenLoaiThe(String sql, Object... args) {
        List<LoaiThe> list = new ArrayList<LoaiThe>();
        try {
            ResultSet rs = jdbc.query(sql, args);
            while (rs.next()) {
                LoaiThe entity = new LoaiThe();
                entity.setTenLoai(rs.getString("tenLoai"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
