package com.entity;

public class Siswa {
    private int id;
    private String nama;
    private String nim;

    public Siswa() {
    }

    public Siswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
