package com.entity;

public class KRS {
    private int id;
    private Siswa mhs;
    private JadwalMataKuliah jadwal;

    public KRS() {
    }

    public KRS(int id, Siswa mhs, JadwalMataKuliah jadwal) {
        this.id = id;
        this.mhs = mhs;
        this.jadwal = jadwal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Siswa getMhs() {
        return mhs;
    }

    public void setMhs(Siswa mhs) {
        this.mhs = mhs;
    }

    public JadwalMataKuliah getJadwal() {
        return jadwal;
    }

    public void setJadwal(JadwalMataKuliah jadwal) {
        this.jadwal = jadwal;
    }

}
