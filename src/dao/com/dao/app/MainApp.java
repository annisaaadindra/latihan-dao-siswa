package com.dao.app;

import com.dao.InfaceDosen;
import com.dao.InfaceJadwalMataKuliah;
import com.dao.InfaceMataKuliah;
import com.dao.SiswaDAO;
import com.dao.connection.MySQLConnection;
import com.dao.impl.ImplDosen;
import com.dao.impl.ImplJadwalMataKuliah;
import com.dao.impl.ImplMataKuliah;
import com.dao.impl.ImplSiswa;
// import com.entity.Siswa;
import com.entity.Dosen;
import com.entity.JadwalMataKuliah;
import com.entity.MataKuliah;

public class MainApp {
    public static void main(String[] args) throws Exception {
        //deklarasi objek
        SiswaDAO siswadao = new ImplSiswa(MySQLConnection.getConnection());
        
        // Siswa siswa = new Siswa();
        // dao.update(siswa);
        // System.out.println("Data " +siswa.getNama()+ " berhasil dihapus");

        //delete record
        // dao.delete(23);

        siswadao.findByID(24);
        // System.out.println("ID\tnama");
        // System.out.println("---------------");
        
        // System.out.println(siswa.getId() + "\t" + siswa.getNama());
        InfaceDosen dosendao = new ImplDosen(MySQLConnection.getConnection());
        InfaceMataKuliah mkdao = new ImplMataKuliah(MySQLConnection.getConnection());

        Dosen dosen = dosendao.findById(1);
       
        // System.out.println(mkdao.findById(1).getNama());
        MataKuliah mk = mkdao.findById(1);

        // JadwalMataKuliah jadwalMK = new JadwalMataKuliah(1, "A", "Senin", 9, 12, mk, dosen);

        InfaceJadwalMataKuliah jadwaldao = new ImplJadwalMataKuliah(MySQLConnection.getConnection());
        // jadwaldao.create(jadwalMK);

        JadwalMataKuliah jadwal = jadwaldao.findById(1);
        System.out.println(jadwal.getHari());
        System.out.println(jadwal.getDosen().getNama());//panggil multiple table
    }
}
