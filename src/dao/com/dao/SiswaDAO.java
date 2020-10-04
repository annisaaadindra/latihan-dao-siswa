package com.dao;

import java.util.List;

import com.entity.Siswa;

public interface SiswaDAO {
    public int insert(Siswa siswa) throws Exception;
    public int update(Siswa siswa) throws Exception;
    public int delete(int id) throws Exception;
    public Siswa findByID(int id) throws Exception;
    public List<Siswa> findAll() throws Exception;
}
