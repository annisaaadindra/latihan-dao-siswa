package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dao.SiswaDAO;
import com.entity.Siswa;

public class ImplSiswa implements SiswaDAO {
    private Connection conn;

    public ImplSiswa(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int insert(Siswa siswa) throws Exception {
        String sql = "insert into tmahasiswa(nama, nim) values(?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, siswa.getNama());
        pst.setString(2, siswa.getNim());
        int affectedRow = pst.executeUpdate();

        return affectedRow;
    }

    @Override
    public int update(Siswa siswa) throws Exception {
        String sql = "update tmahasiswa set nama=?, nim=? where id=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, siswa.getNama());
        pst.setString(2, siswa.getNim());
        pst.setInt(3, siswa.getId());
        int affectedRow = pst.executeUpdate();
        return affectedRow;
    }

    @Override
    public int delete(int id) throws Exception {
        String sql = "delete from tmahasiswa where id=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        int affectedRow = pst.executeUpdate();
        return affectedRow;
    }

    @Override
    public Siswa findByID(int id) throws Exception {
        Siswa siswa = null;
        String sql = "select id, nama, nim from tmahasiswa where id=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            siswa = new Siswa();
            siswa.setId(rs.getInt("id"));
            siswa.setNama(rs.getString("nama"));
        }

        return siswa;
    }

    @Override
    public List<Siswa> findAll() throws Exception {
        List<Siswa> listOfSiswa = new ArrayList<Siswa>();
        String sql = "select id, nama, nim from tmahasiswa";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        System.out.println("ID\tnama");
        System.out.println("---------------");

        while (rs.next()) {
            Siswa siswa = new Siswa();
            siswa.setId(rs.getInt("id"));
            siswa.setNama(rs.getString("nama"));
            siswa.setNim(rs.getString("nim"));
            System.out.println(siswa.getId()+"\t"+siswa.getNama());
        }

        return listOfSiswa;
    }
}
