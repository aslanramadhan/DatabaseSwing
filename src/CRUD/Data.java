package CRUD;

/**
 *
 * userundie
 *
 */
public class Data {
    private String nama;
    private String kelas;
    private String jk;
    private String alamat;

    public Data(String nama, String kelas, String jk, String alamat) {
        this.nama = nama;
        this.kelas = kelas;
        this.jk = jk;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
    

}
