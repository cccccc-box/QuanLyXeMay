/*
 * Alăng Quân Sỹ
 * PD09903
 */
package com.mycompany.dao;
import com.mycompany.entity.KhachHang;
import com.mycompany.utils.jdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Just Share
 */
public class KhachHangDAO extends QuanLyXeMayDAO<KhachHang, String>{
    String INSERT_SQL="insert into KhachHang(maKhachHang,hoTen,SDT,CCCD,soDu,hinhAnh,maTaiKhoan) values(?,?,?,?,?,?,?)";
    String UPDATE_SQL="update KhachHang set hoTen=?, SDT=?, CCCD=?, soDu=?, hinhAnh=?, maTaiKhoan=? where maKhachHang=?";
    String DELETE_SQL="delete from KhachHang where maKhachHang =?";
    String SELECT_ALL_SQL="select * from KhachHang";
    String SELECT_BY_ID_SQL="select * from KhachHang where maKhachHang=?";

    @Override
    public void insert(KhachHang entity) {
        jdbc.update(INSERT_SQL, entity.getMaKhachHang(), entity.getHoTen(), entity.getSDT(),entity.getCCCD(),entity.getSoDu(),entity.getHinhAnh(),entity.getMaTaiKhoan());
    }

    @Override
    public void update(KhachHang entity) {
        jdbc.update(UPDATE_SQL, entity.getHoTen(), entity.getSDT(),entity.getCCCD(),entity.getSoDu(),entity.getHinhAnh(),entity.getMaTaiKhoan(), entity.getMaKhachHang());
    }

    @Override
    public void delete(String id) {
        jdbc.update(DELETE_SQL,id);    }

    @Override
    public KhachHang selectById(String id) {
        List<KhachHang> list = selectBySQL(SELECT_BY_ID_SQL,id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhachHang> selectAll() {
        return selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    protected List<KhachHang> selectBySQL(String sql, Object... args) {
        List <KhachHang> list = new ArrayList<KhachHang>();
        try {
            ResultSet rs=jdbc.query(sql, args);
            while(rs.next()){
            KhachHang entity = new KhachHang();
            entity.setMaKhachHang(rs.getString("maKhachHang"));
            entity.setHoTen(rs.getString("hoTen"));
            entity.setSDT(rs.getString("SDT"));
            entity.setCCCD(rs.getString("CCCD"));
            entity.setSoDu(rs.getString("soDu"));
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
