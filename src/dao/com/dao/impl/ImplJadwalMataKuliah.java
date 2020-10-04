package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.dao.InfaceDosen;
import com.dao.InfaceJadwalMataKuliah;
import com.dao.InfaceMataKuliah;
import com.entity.JadwalMataKuliah;

public class ImplJadwalMataKuliah implements InfaceJadwalMataKuliah {
    private Connection conn;

    @Override
    public int create(JadwalMataKuliah jadwal) throws Exception {
        String sql = "insert into tjadwal_kelas(nama_kelas, hari, jam_mulai, jam_selesai, tmatakuliah_id, tdosen_id) values(?,?,?,?,?,?)";
        PreparedStatement pst = this.conn.prepareStatement(sql);
        pst.setString(1, jadwal.getNamKelas());
        pst.setString(2, jadwal.getHari());
        pst.setInt(3, jadwal.getJamMulai());
        pst.setInt(4, jadwal.getJamSelesai());
        pst.setInt(5, jadwal.getMatakuliah().getId());
        pst.setInt(6, jadwal.getDosen().getId());
        return pst.executeUpdate();
    }

    @Override
    public int delete(int id) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<JadwalMataKuliah> findByDosen(int idDosen) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public JadwalMataKuliah findById(int id) throws Exception {
        JadwalMataKuliah jadwalMatakuliah = null;
        String sql = "select id, nama_kelas, hari, jam_mulai, jam_selesai, tmatakuliah_id, tdosen_id from tjadwal_kelas where id=?";
        PreparedStatement pst = this.conn.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            // reuse DosenDAO dan MatakuliahDAO
            InfaceDosen dosendao = new ImplDosen(this.conn);
            InfaceMataKuliah mkdao = new ImplMataKuliah(this.conn);

            jadwalMatakuliah = new JadwalMataKuliah();
            
            jadwalMatakuliah.setId(rs.getInt("id"));
            jadwalMatakuliah.setNamKelas(rs.getString("nama_kelas"));
            jadwalMatakuliah.setHari(rs.getString("hari"));
            jadwalMatakuliah.setJamMulai(rs.getInt("jam_mulai"));
            jadwalMatakuliah.setJamSelesai(rs.getInt("jam_selesai"));
            jadwalMatakuliah.setMatakuliah(mkdao.findById(rs.getInt("tmatakuliah_id")));
            jadwalMatakuliah.setDosen(dosendao.findById(rs.getInt("tdosen_id")));
        }
        return jadwalMatakuliah;
    }

    @Override
    public List<JadwalMataKuliah> findByMatakuliah(int idMatakuliah) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int update(JadwalMataKuliah jadwal) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    public ImplJadwalMataKuliah(Connection conn) {
        this.conn = conn;
    }

}
