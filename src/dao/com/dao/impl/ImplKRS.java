package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.dao.InfaceJadwalMataKuliah;
import com.dao.InfaceKRS;
import com.dao.SiswaDAO;
import com.entity.KRS;

public class ImplKRS implements InfaceKRS {
    private Connection conn;

    public ImplKRS(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int delete(int id) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public KRS findById(int id) throws Exception {
        KRS krs = null;
		String sql = "select id, tmahasiswa_id, tjadwal_kelas_id from tkrs where id=?";
		PreparedStatement pst = this.conn.prepareStatement(sql);
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
			SiswaDAO mhsDAO = new ImplSiswa(this.conn);
			InfaceJadwalMataKuliah jadwalDAO = new ImplJadwalMataKuliah(this.conn);
			krs = new KRS();
			krs.setId(rs.getInt("id"));
			krs.setMhs(mhsDAO.findByID(rs.getInt("tmahasiswa_id")));
			krs.setJadwal(jadwalDAO.findById(rs.getInt("tjadwal_kelas_id")));
		}
		return krs;
    }

    @Override
    public List<KRS> findByMahasiswa(int id) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int insert(KRS krs) throws Exception {
        String sql = "insert into tkrs(tmahasiswa_id, tjadwal_kelas_id) values(?,?)";
		PreparedStatement pst = this.conn.prepareStatement(sql);
		pst.setInt(1, krs.getMhs().getId());
		pst.setInt(2, krs.getJadwal().getId());
		return pst.executeUpdate();
    }

    
}
