public class KhachHang {
    private String name;
    private int age;
    private String address;
    private String school;
    private String images;

    public KhachHang() {
    }

    public KhachHang(String name, int age, String address, String school, String images) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.school = school;
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", school='" + school + '\'' +
                ", images='" + images + '\'' +
                '}';
    }
}
