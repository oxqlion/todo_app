/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Calendar;

public class SisaJam {

    public static void main(String[] args) {
        SisaJam sisa = new SisaJam();

        Locale lokal = null;

        Calendar cal = Calendar.getInstance();
        int jam = cal.get(Calendar.HOUR);
        int menit = cal.get(Calendar.MINUTE);
        int detik = cal.get(Calendar.SECOND);

        String jam1 = Integer.toString(jam);
        String menit1 = Integer.toString(menit);
        String detik1 = Integer.toString(detik);

        int tahun = cal.get(Calendar.YEAR);
        int bulan = cal.get(Calendar.MONTH) + 1;
        int tanggal = cal.get(Calendar.DAY_OF_MONTH);
        
        String tahun1 = Integer.toString(tahun);
        String bulan1 = Integer.toString(bulan);
        String tanggal1 = Integer.toString(tanggal);

        String pola = "dd-MM-yyyy HH:mm:ss";
        String waktuSatuStr = (tanggal1 + bulan1 + tahun1 + jam1 + menit1 + detik1);
        String waktuDuaStr = (tanggal1 + bulan1 + tahun1 + jam1 + menit1 + detik1);
        Date waktuSatu = SisaJam.konversiStringkeDate(waktuSatuStr, pola, lokal);
        Date WaktuDua = SisaJam.konversiStringkeDate(waktuDuaStr, pola, lokal);
        String hasilSelisih = SisaJam.selisihDateTime(waktuSatu, WaktuDua);
        System.out.println(hasilSelisih);
    }
    // Method menghitung selisih dua waktu

    public static String selisihDateTime(Date waktuSatu, Date waktuDua) {
        long selisihMS = Math.abs(waktuSatu.getTime() - waktuDua.getTime());
        long selisihDetik = selisihMS / 1000 % 60;
        long selisihMenit = selisihMS / (60 * 1000) % 60;
        long selisihJam = selisihMS / (60 * 60 * 1000) % 24;
        long selisihHari = selisihMS / (24 * 60 * 60 * 1000);
        String selisih = selisihHari + " hari " + selisihJam + " Jam " + selisihMenit + " Menit " + selisihDetik + " Detik";
        return selisih;
    }

    public static Date konversiStringkeDate(String tanggalDanWaktuStr, String pola, Locale lokal) {
        Date tanggalDate = null;
        SimpleDateFormat formatter;
        if (lokal == null) {
            formatter = new SimpleDateFormat(pola);
        } else {
            formatter = new SimpleDateFormat(pola, lokal);
        }
        try {
            tanggalDate = formatter.parse(tanggalDanWaktuStr);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return tanggalDate;
    }
}
