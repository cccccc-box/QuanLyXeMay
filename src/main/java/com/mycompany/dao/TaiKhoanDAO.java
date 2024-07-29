/*
 * Alăng Quân Sỹ
 * PD09903
 */
package com.mycompany.dao;

import com.mycompany.entity.TaiKhoan;
import com.mycompany.utils.jdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Just Share
 */
public class TaiKhoanDAO extends QuanLyXeMayDAO<TaiKhoan, String> {

    String INSERT_SQL = "insert into TaiKhoan(maTaiKhoan,TenDangNhap,matKhau,quyen) values(?,?,?,?)";
    String UPDATE_SQL = "update TaiKhoan set tenDangNhap=?, matKhau=?, quyen=? where maTaiKhoan=?";
    String DELETE_SQL = "delete from TaiKhoan where maTaiKhoan =?";
    String SELECT_ALL_SQL = "select * from TaiKhoan";
    String SELECT_BY_ID_SQL = "select * from TaiKhoan where maTaiKhoan=?";
    String SELECT_BY_UserName = "select * from TaiKhoan where tenDangNhap=?";
    String SELECT_NOT_IN = "select maTaiKhoan from TaiKhoan where maTaiKhoan not in(select maTaiKhoan from NhanVien union select maTaiKhoan from KhachHang)";

    @Override
    public void insert(TaiKhoan entity) {
        jdbc.update(INSERT_SQL, entity.getMaTaiKhoan(), entity.getTenDangNhap(), entity.getMatKhau(), entity.getQuyen());
    }

    @Override
    public void update(TaiKhoan entity) {
        jdbc.update(UPDATE_SQL, entity.getTenDangNhap(), entity.getMatKhau(), entity.getQuyen(), entity.getMaTaiKhoan());
    }

    @Override
    public void delete(String id) {
        jdbc.update(DELETE_SQL, id);
    }

    @Override
    public TaiKhoan selectById(String id) {
        List<TaiKhoan> list = selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public TaiKhoan selectByUserName(String id) {
        List<TaiKhoan> list = selectBySQL(SELECT_BY_UserName, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<TaiKhoan> selectAll() {
        return selectBySQL(SELECT_ALL_SQL);
    }

    public List<TaiKhoan> selectNotIn() {
        return selectBySQLmaTKnotIn(SELECT_NOT_IN);
    }

    @Override
    protected List<TaiKhoan> selectBySQL(String sql, Object... args) {
        List<TaiKhoan> list = new ArrayList<TaiKhoan>();
        try {
            ResultSet rs = jdbc.query(sql, args);
            while (rs.next()) {
                TaiKhoan entity = new TaiKhoan();
                entity.setMaTaiKhoan(rs.getString("maTaiKhoan"));
                entity.setTenDangNhap(rs.getString("tenDangNhap"));
                entity.setMatKhau(rs.getString("matKhau"));
                entity.setQuyen(rs.getInt("quyen"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected List<TaiKhoan> selectBySQLmaTKnotIn(String sql, Object... args) {
        List<TaiKhoan> list = new ArrayList<TaiKhoan>();
        try {
            ResultSet rs = jdbc.query(sql, args);
            while (rs.next()) {
                TaiKhoan entity = new TaiKhoan();
                entity.setMaTaiKhoan(rs.getString("maTaiKhoan"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
