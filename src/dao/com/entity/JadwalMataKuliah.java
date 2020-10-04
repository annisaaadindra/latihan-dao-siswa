package com.entity;

public class JadwalMataKuliah {
    private int id;
	private String namKelas;
	private String hari;
	private int jamMulai;
	private int jamSelesai;
	private MataKuliah matakuliah;
    private Dosen dosen;

    public JadwalMataKuliah() {
    }

    public JadwalMataKuliah(int id, String namKelas, String hari, int jamMulai, int jamSelesai, MataKuliah matakuliah, Dosen dosen) {
        this.id = id;
        this.namKelas = namKelas;
        this.hari = hari;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
        this.matakuliah = matakuliah;
        this.dosen = dosen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamKelas() {
        return namKelas;
    }

    public void setNamKelas(String namKelas) {
        this.namKelas = namKelas;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public int getJamMulai() {
        return jamMulai;
    }

    public void setJamMulai(int jamMulai) {
        this.jamMulai = jamMulai;
    }

    public int getJamSelesai() {
        return jamSelesai;
    }

    public void setJamSelesai(int jamSelesai) {
        this.jamSelesai = jamSelesai;
    }

    public MataKuliah getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(MataKuliah matakuliah) {
        this.matakuliah = matakuliah;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }
}
