/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author SHINTA
 */
public class Edit2 extends javax.swing.JFrame {

    /**
     * Creates new form Edit2
     */
    public Edit2() throws IOException {
        initComponents();
//        NewJFrame as = new NewJFrame("");
//        int noData = as.kirim();
//        System.out.println("No data : " + noData);

        FileReader fileInput;
        BufferedReader bufferedInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferedInput = new BufferedReader(fileInput);
        } catch (Exception e) {
            System.err.println("Database tidak ditemukan");
            System.err.println("Silahkan tambahkan data terlebih dahulu");
            File file = new File("src/database.txt");
//            TambahKegiatan(user);
            return;
        }

    }

    public void EditKegiatan(int dipilih, String user) throws IOException {
        System.out.println("INI EDIT");

        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        File tempDB = new File("temp.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        Scanner in = new Scanner(System.in);
//        System.out.println("Masukkan nomor buku yang akan dihapus: ");
        int deleteData = dipilih;

        boolean isFound = false;
        int count = 0;

        String data = bufferedInput.readLine();

        while (data != null) {
            if (data.contains(user)) {
                count++;
                boolean isDelete = false;

                StringTokenizer st = new StringTokenizer(data, "_");

                if (deleteData == count - 1) {
                    System.out.println("Data yang ingin Anda hapus adalah " + st.nextToken());
                    isDelete = true;
                    isFound = true;
                }

                if (isDelete) {
                    System.out.println("Data berhasil dihapus");
                } else {
                    System.out.println("Writing...");
                    bufferedOutput.write(data);
                    bufferedOutput.newLine();
                }
            } else {
                System.out.println("Writing original data");
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }
            data = bufferedInput.readLine();
        }
        if (!isFound) {
            System.out.println("Data tidak ditemukan");
        }

        bufferedOutput.flush();
        bufferedInput.close();
        bufferedOutput.close();
        fileInput.close();
        fileOutput.close();
        System.gc();
        database.delete();
        tempDB.renameTo(database);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TanggalInput = new javax.swing.JTextField();
        JenisKegiatan = new javax.swing.JTextField();
        Prioritas = new javax.swing.JTextField();
        Tambahorang = new javax.swing.JTextField();
        NamaKegiatan = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Progres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SisaWaktu = new javax.swing.JTextField();
        DueDate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        JamDue = new javax.swing.JTextField();
        UserUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Tanggal Input ");

        jLabel3.setText("Nama Kegiatan : ");

        jLabel4.setText("Due Date");

        jLabel6.setText("Jenis Kegiatan");

        jLabel7.setText("Tambah Orang");

        jLabel8.setText("Prioritas");

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jLabel9.setText("Progres");

        jLabel1.setText("Sisa Waktu");

        jLabel5.setText("Jam");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(SisaWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Progres, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(152, 152, 152))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Tambahorang, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Prioritas, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JenisKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel8)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NamaKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TanggalInput, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JamDue, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UserUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UserUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(NamaKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TanggalInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addComponent(DueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JamDue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JenisKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Prioritas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SisaWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Progres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tambahorang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Save)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void TambahKegiatan(String user, String NamaInput, String TanggalInput1, String DueInput, String JenisInput, String PrioritasInput, String selisihInput, String progressInput, String PeopleInput) throws IOException {

        Calendar cal = Calendar.getInstance();

        FileWriter fileOutput = new FileWriter("database.txt", true);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        ArrayList<String> users = new ArrayList<String>();

        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        
        SisaJam sisa = new SisaJam();

        Locale lokal = null;

        String jam = JamDue.getText();

        ZoneId zone = ZoneId.systemDefault();
        LocalTime time = LocalTime.now(zone);

        int tahun = cal.get(Calendar.YEAR);
        int bulan = cal.get(Calendar.MONTH) + 1;
        int tanggall = cal.get(Calendar.DAY_OF_MONTH);

        String tahun1 = Integer.toString(tahun);
        String bulan1 = Integer.toString(bulan);
        String tanggal1 = Integer.toString(tanggall);
        
        String tanggal2 = String.valueOf(date.format(DueDate.getDate()));

        String pola = "dd-MM-yyyy HH:mm:ss";
        String waktuSatuStr = (tanggal2 + " " + jam + ":00");
        String waktuDuaStr = (tanggal1 + "-" + bulan1 + "-" + tahun1 + " " + time);
        Date waktuSatu = SisaJam.konversiStringkeDate(waktuSatuStr, pola, lokal);
        Date WaktuDua = SisaJam.konversiStringkeDate(waktuDuaStr, pola, lokal);
        String hasilSelisih = SisaJam.selisihDateTime(waktuSatu, WaktuDua);

        String judulKegiatan = NamaKegiatan.getText();
        String tanggal = TanggalInput.getText();
        String due = String.valueOf(date.format(DueDate.getDate()));
        String jenisKegiatan = JenisKegiatan.getText();
        String prioritasKegiatan = Prioritas.getText();
        String sisaWaktu = hasilSelisih;
        String progress = Progres.getText();
        String people = Tambahorang.getText();
        users.add(user);
        users.add(people);

//        SisaJam sisa = new SisaJam();
//        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");

//        Locale lokal = null;
//
//        ZoneId zone = ZoneId.systemDefault();
//        LocalTime time = LocalTime.now(zone);
//
//        int tahun = cal.get(Calendar.YEAR);
//        int bulan = cal.get(Calendar.MONTH) + 1;
//        int tanggall = cal.get(Calendar.DAY_OF_MONTH);
//
//        String tahun1 = Integer.toString(tahun);
//        String bulan1 = Integer.toString(bulan);
//        String tanggal1 = Integer.toString(tanggall);
//
//        String tanggal2 = String.valueOf(date.format(DueDate.getDate()));

        bufferedOutput.write(judulKegiatan + "_" + tanggal + "_" + due + "_" + jenisKegiatan + "_" + prioritasKegiatan + "_" + sisaWaktu + "_" + progress + "_" + users);
        bufferedOutput.newLine();
        bufferedOutput.flush();

        fileOutput.close();
        bufferedOutput.close();
    }

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

//    public static String selisih(String hasilSelisih) {
//        String selisih = hasilSelisih;
//        return selisih;
//    }

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        Calendar cal = Calendar.getInstance();
        String nama = NewJFrame.userX.getText();

        NewJFrame jframe = new NewJFrame(nama);
        String user = UserUser.getText();

        SisaJam sisa = new SisaJam();

        Locale lokal = null;

        String jam = JamDue.getText();

        ZoneId zone = ZoneId.systemDefault();
        LocalTime time = LocalTime.now(zone);
//            String jam3 = Jam.getText();

        int tahun = cal.get(Calendar.YEAR);
        int bulan = cal.get(Calendar.MONTH) + 1;
        int tanggall = cal.get(Calendar.DAY_OF_MONTH);

        String tahun1 = Integer.toString(tahun);
        String bulan1 = Integer.toString(bulan);
        String tanggal1 = Integer.toString(tanggall);
        
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        
        String nama1 = NamaKegiatan.getText();
        String tanggal = TanggalInput.getText();
        String due = String.valueOf(date.format(DueDate.getDate()));
        String jenis = JenisKegiatan.getText();
        String prioritas = Prioritas.getText();
        String progres = Progres.getText();
        String tambah = Tambahorang.getText();
        String arrayOrang = "[" + user + ", " + tambah + "]";

        String tanggal2 = String.valueOf(date.format(DueDate.getDate()));

        String pola = "dd-MM-yyyy HH:mm:ss";
        String waktuSatuStr = (tanggal2 + " " + jam + ":00");
        String waktuDuaStr = (tanggal1 + "-" + bulan1 + "-" + tahun1 + " " + time);
        Date waktuSatu = SisaJam.konversiStringkeDate(waktuSatuStr, pola, lokal);
        Date WaktuDua = SisaJam.konversiStringkeDate(waktuDuaStr, pola, lokal);
        String hasilSelisih = SisaJam.selisihDateTime(waktuSatu, WaktuDua);

//        String nama1 = NamaKegiatan.getText();
//        String tanggal = TanggalInput.getText();
//        String due = String.valueOf(date.format(DueDate.getDate()));
//        String jenis = JenisKegiatan.getText();
//        String prioritas = Prioritas.getText();
        String sisa1 = hasilSelisih;
//        String progres = Progres.getText();
//        String tambah = Tambahorang.getText();

//        TambahKegiatan(user, nama1, tanggal, due, jenis, prioritas, sisa, progres, tambah);
        String data[] = {nama1, tanggal, due, jenis, prioritas, sisa1, progres, arrayOrang};

        DefaultTableModel tblJadwal = (DefaultTableModel) jframe.Jadwal.getModel();

        tblJadwal.addRow(data);

        try {
            TambahKegiatan(user, nama1, tanggal, due, jenis, prioritas, sisa1, progres, tambah);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "salahh!");
        }
        this.dispose();

//        try {
//            tblJadwal.addRow(data);
//            jframe.TambahKegiatan(user, nama1, tanggal, due, jenis, prioritas, sisa, progres, tambah);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Salah");
//        }
//        try{
//        jframe.TambahKegiatan(user, nama1, tanggal, due, jenis, prioritas, sisa, progres, tambah);
//        } catch (Exception e){
//            
//        }
//        jframe.userX.setText(msg);
//        NewJFrame jframe = new NewJFrame(nama);
//        int nomor = jframe.nomorDataYangDikirim();
//        
//        jframe.Jadwal.setValueAt(nama, nomor, 0);
//        jframe.Jadwal.setValueAt(tanggal, nomor, 1);
//        jframe.Jadwal.setValueAt(due, nomor, 2);
//        jframe.Jadwal.setValueAt(jenis, nomor, 3);
//        jframe.Jadwal.setValueAt(prioritas, nomor, 4);
//        jframe.Jadwal.setValueAt(sisa, nomor, 5);
//        jframe.Jadwal.setValueAt(progres, nomor, 6);
//        jframe.Jadwal.setValueAt(tambah, nomor, 7);

    }//GEN-LAST:event_SaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Edit2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Edit2().setVisible(true);
                } catch (Exception e) {

                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.toedter.calendar.JDateChooser DueDate;
    public javax.swing.JTextField JamDue;
    public javax.swing.JTextField JenisKegiatan;
    public javax.swing.JTextField NamaKegiatan;
    public javax.swing.JTextField Prioritas;
    public javax.swing.JTextField Progres;
    private javax.swing.JButton Save;
    public javax.swing.JTextField SisaWaktu;
    public javax.swing.JTextField Tambahorang;
    public javax.swing.JTextField TanggalInput;
    public javax.swing.JTextField UserUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
