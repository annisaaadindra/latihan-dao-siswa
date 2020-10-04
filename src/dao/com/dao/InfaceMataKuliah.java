package com.dao;

import java.util.List;

import com.entity.MataKuliah;

public interface InfaceMataKuliah {
    public int insert(MataKuliah matakuliah) throws Exception;

	public int update(MataKuliah matakuliah) throws Exception;

	public int delete(int id) throws Exception;

	public MataKuliah findById(int id) throws Exception;

	public List<MataKuliah> findAll() throws Exception;
}
