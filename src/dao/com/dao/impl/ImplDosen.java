package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.dao.InfaceDosen;
import com.entity.Dosen;

public class ImplDosen implements InfaceDosen {
    private Connection conn;

    public ImplDosen(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int delete(int id) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Dosen> findAll() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Dosen findById(int id) throws Exception {
        Dosen dosen = null;
        String sql = "Select * from tdosen where id = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();

        if(rs.next())
        {
            dosen = new Dosen();
            dosen.setId(rs.getInt("id"));
            dosen.setNama(rs.getString("nama"));
            dosen.setNip(rs.getString("nip"));
        }
        return dosen;
    }

    @Override
    public int insert(Dosen dosen) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int update(Dosen dosen) throws Exception {
       return 0;
    }
    
    
}
