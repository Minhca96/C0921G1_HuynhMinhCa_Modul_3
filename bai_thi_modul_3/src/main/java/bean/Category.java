package bean;

public class Category {
    private String danhMuc;
    private String name;

    public Category() {
    }

    public Category(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public Category(String danhMuc, String name) {
        this.danhMuc = danhMuc;
        this.name = name;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "danhMuc='" + danhMuc + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
