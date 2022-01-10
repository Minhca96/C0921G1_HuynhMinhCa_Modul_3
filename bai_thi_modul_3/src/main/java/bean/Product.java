package bean;

import java.util.Locale;

public class Product {
    private int id;
    private String ten;
    private String gia;
    private String soLuong;
    private String mau;
    private String moTa;
    private Category danhMuc;

    public Product() {
    }

    public Product(int id, String ten, String gia, String soLuong, String mau, String moTa, Category danhMuc) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
        this.mau = mau;
        this.moTa = moTa;
        this.danhMuc = danhMuc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Category getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(Category danhMuc) {
        this.danhMuc = danhMuc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", gia='" + gia + '\'' +
                ", soLuong='" + soLuong + '\'' +
                ", mau='" + mau + '\'' +
                ", moTa='" + moTa + '\'' +
                ", danhMuc=" + danhMuc +
                '}';
    }
}