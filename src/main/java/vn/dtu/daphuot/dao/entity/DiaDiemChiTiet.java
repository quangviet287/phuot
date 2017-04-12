package vn.dtu.daphuot.dao.entity;

/**
 * Created by teivg on 2/28/2017.
 */
public class DiaDiemChiTiet {

    private String id;
    private String iddiadiem;
    private String ten;
    private String vitri;
    private String mota;
    private String hinhanh;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIddiadiem() {
        return iddiadiem;
    }

    public void setIddiadiem(String iddiadiem) {
        this.iddiadiem = iddiadiem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }
}
