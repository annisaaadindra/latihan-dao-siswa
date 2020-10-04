package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.dao.InfaceMataKuliah;
import com.entity.MataKuliah;

public class ImplMataKuliah implements InfaceMataKuliah {
    private Connection conn;

    public ImplMataKuliah(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int delete(int id) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<MataKuliah> findAll() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MataKuliah findById(int id) throws Exception {
        MataKuliah mk = null;
        String sql = "Select * from tmatakuliah where id = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();

        if(rs.next())
        {
            mk = new MataKuliah();
            mk.setId(rs.getInt("id"));
            mk.setKode(rs.getString("kode"));
            mk.setNama(rs.getString("nama"));
            mk.setSks(rs.getInt("sks"));
        }
        return mk;
    }

    @Override
    public int insert(MataKuliah matakuliah) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int update(MataKuliah matakuliah) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

}
