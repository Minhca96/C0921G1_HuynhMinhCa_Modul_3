package bean;

public class BenhAn {
    private String maBenhAn;
    private String tenBenhAn;

    public BenhAn() {
    }

    public BenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public BenhAn(String maBenhAn, String tenBenhAn) {
        this.maBenhAn = maBenhAn;
        this.tenBenhAn = tenBenhAn;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getTenBenhAn() {
        return tenBenhAn;
    }

    public void setTenBenhAn(String tenBenhAn) {
        this.tenBenhAn = tenBenhAn;
    }

    @Override
    public String toString() {
        return "BenhAn{" +
                "maBenhAn='" + maBenhAn + '\'' +
                ", tenBenhAn='" + tenBenhAn + '\'' +
                '}';
    }
}
