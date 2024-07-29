/*
 * Alăng Quân Sỹ
 * PD09903
 */
package com.mycompany.dao;

import com.mycompany.entity.NhanVien;
import com.mycompany.utils.jdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Just Share
 */
public class NhanVienDAO extends QuanLyXeMayDAO<NhanVien, String> {

    String INSERT_SQL = "insert into NhanVien(maNV,hoTenNV,SDT,CCCD,vaiTro,hinhAnh,maTaiKhoan) values(?,?,?,?,?,?,?)";
    String UPDATE_SQL = "update NhanVien set hoTenNV=?,SDT=?,CCCD=?,vaiTro=?,hinhAnh=?,maTaiKhoan=? where maNV=?";
    String DELETE_SQL = "delete from NhanVien where maNV =?";
    String SELECT_ALL_SQL = "select * from NhanVien";
    String SELECT_BY_ID_SQL = "select * from NhanVien where maNV=?";

    @Override
    public void insert(NhanVien entity) {
        jdbc.update(INSERT_SQL, entity.getMaNV(), entity.getHoTenNV(), entity.getSDT(), entity.getCCCD(), entity.getVaiTro(), entity.getHinhAnh(), entity.getMaTaiKhoan());
    }

    @Override
    public void update(NhanVien entity) {
        jdbc.update(UPDATE_SQL, entity.getHoTenNV(), entity.getSDT(), entity.getCCCD(), entity.getVaiTro(), entity.getHinhAnh(), entity.getMaTaiKhoan(), entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        jdbc.update(DELETE_SQL, id);
    }

    @Override
    public NhanVien selectById(String id) {
        List<NhanVien> list = selectBySQL(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> selectAll() {
        return selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    protected List<NhanVien> selectBySQL(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<NhanVien>();
        try {
            ResultSet rs = jdbc.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("maNV"));
                entity.setHoTenNV(rs.getString("hoTenNV"));
                entity.setSDT(rs.getString("SDT"));
                entity.setCCCD(rs.getString("CCCD"));
                entity.setVaiTro(rs.getString("vaiTro"));
                entity.setHinhAnh(rs.getString("hinhAnh"));
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
