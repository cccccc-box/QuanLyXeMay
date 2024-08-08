/*
 * Alăng Quân Sỹ
 * PD09903
 */
package com.mycompany.dao;

import com.mycompany.entity.XeMay;
import com.mycompany.utils.jdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Just Share
 */
public class XeMayDAO extends QuanLyXeMayDAO<XeMay, Integer> {

    public String getMaKH_XeMayDAO() {
        return maKH_XeMayDAO;
    }

    public void setMaKH_XeMayDAO(String maKH_XeMayDAO) {
        this.maKH_XeMayDAO = maKH_XeMayDAO;
    }

    String maKH_XeMayDAO;

    String INSERT_SQL = "insert into XeMay(bienSoXe,hangXe,tinhTrang,maKhachHang) values(?,?,?,?)";
    String UPDATE_SQL = "update XeMay set bienSoXe=?, hangXe=? where maXe=?";
    String DELETE_SQL = "delete from XeMay where maXe =?";
    String SELECT_ALL_SQL = "select * from XeMay";
    String SELECT_BY_ID_SQL = "select * from XeMay where maXe=?";
    String SELECT_BY_KH_SQL = "select * from XeMay where maKhachHang=?";

    @Override
    public void insert(XeMay entity) {
        jdbc.update(INSERT_SQL, entity.getBienSoXe(), entity.getHangXe(), entity.isTinhTrang(), entity.getMaKhachHang());
    }

    @Override
    public void update(XeMay entity) {
        jdbc.update(UPDATE_SQL, entity.getBienSoXe(), entity.getHangXe(), entity.getMaXe());
    }

    @Override
    public void delete(Integer id) {
        jdbc.update(DELETE_SQL, id);
    }

    @Override
    public XeMay selectById(Integer id) {
        List<XeMay> list = selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

//    public XeMay selectByMaKH(String maKH) {
//        List<XeMay> list = selectBySQL(SELECT_BY_KH_SQL, maKH);
//        if (list.isEmpty()) {
//            return null;
//        }
//        return list.get(0);
//    }
    public List<XeMay> selectByMaKH(String maKh) {
        return selectBySQL(SELECT_BY_KH_SQL, maKH_XeMayDAO);
    }


    @Override
    public List<XeMay> selectAll() {
        return selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    protected List<XeMay> selectBySQL(String sql, Object... args) {
        List<XeMay> list = new ArrayList<XeMay>();
        try {
            ResultSet rs = jdbc.query(sql, args);
            while (rs.next()) {
                XeMay entity = new XeMay();
                entity.setMaXe(rs.getInt("maXe"));
                entity.setBienSoXe(rs.getString("bienSoXe"));
                entity.setHangXe(rs.getString("hangXe"));
                entity.setTinhTrang(rs.getBoolean("tinhTrang"));
                entity.setMaKhachHang(rs.getString("maKhachHang"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
