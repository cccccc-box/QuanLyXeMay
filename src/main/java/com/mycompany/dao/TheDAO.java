/*
 * Alăng Quân Sỹ
 * PD09903
 */
package com.mycompany.dao;

import com.mycompany.entity.The;
import com.mycompany.utils.jdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Just Share
 */
public class TheDAO extends QuanLyXeMayDAO<The, Integer> {

    String INSERT_SQL = "insert into The(thoiHan,maXe,maKhachHang,maLoai) values(?,?,?,?)";
    String UPDATE_SQL = "update The set thoiHan=?, maXe=?, maKhachHang=?,maLoai=? where maThe=?";
    String DELETE_SQL = "delete from The where maThe =?";
    String SELECT_ALL_SQL = "select * from The";
    String SELECT_BY_ID_SQL = "select * from The where maThe=?";
    String SELECT_MaTheMoiNhat = "select Max(maThe)as maThe from The";

    @Override
    public void insert(The entity) {
        jdbc.update(INSERT_SQL, entity.getThoiHan(), entity.getMaXe(), entity.getMaKhachHang(), entity.getMaLoai());
    }

    @Override
    public void update(The entity) {
        jdbc.update(UPDATE_SQL, entity.getThoiHan(), entity.getMaXe(), entity.getMaKhachHang(), entity.getMaLoai(), entity.getMaThe());
    }

    @Override
    public void delete(Integer id) {
        jdbc.update(DELETE_SQL, id);
    }

    @Override
    public The selectById(Integer id) {
        List<The> list = selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }


    @Override
    public List<The> selectAll() {
        return selectBySQL(SELECT_ALL_SQL);
    }
        public The timMaTheMoiNhat() {
        List<The> list = timMaTheMoi(SELECT_MaTheMoiNhat);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<The> selectBySQL(String sql, Object... args) {
        List<The> list = new ArrayList<The>();
        try {
            ResultSet rs = jdbc.query(sql, args);
            while (rs.next()) {
                The entity = new The();
                entity.setMaThe(rs.getInt("maThe"));
                entity.setThoiHan(rs.getDate("thoiHan"));
                entity.setMaXe(rs.getInt("maXe"));
                entity.setMaKhachHang(rs.getString("maKhachHang"));
                entity.setMaLoai(rs.getString("maLoai"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
        protected List<The> timMaTheMoi(String sql, Object... args) {
        List<The> list = new ArrayList<The>();
        try {
            ResultSet rs = jdbc.query(sql, args);
            while (rs.next()) {
                The entity = new The();
                entity.setMaThe(rs.getInt("maThe"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    

}
