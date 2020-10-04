package com.dao;

import java.util.List;

import com.entity.JadwalMataKuliah;

public interface InfaceJadwalMataKuliah {
    public int create(JadwalMataKuliah jadwal) throws Exception;
	public int update(JadwalMataKuliah jadwal) throws Exception;
	public int delete(int id) throws Exception;
	public JadwalMataKuliah findById(int id) throws Exception;
	public List<JadwalMataKuliah> findByMatakuliah(int idMatakuliah) throws Exception;
	public List<JadwalMataKuliah> findByDosen(int idDosen) throws Exception;
}
