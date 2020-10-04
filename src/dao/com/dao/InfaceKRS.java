package com.dao;

import java.util.List;

import com.entity.KRS;

public interface InfaceKRS {
    public int insert(KRS krs) throws Exception;
	public int delete(int id) throws Exception;
	public KRS findById(int id) throws Exception;
	public List<KRS> findByMahasiswa(int id) throws Exception;
}
