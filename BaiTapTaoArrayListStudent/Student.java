package BaiTapTaoArrayListStudent;

public class Student {
    private String iD;
    private String name;
    private String address;

    public Student(String id, String name, String address) {
        this.iD = id;
        this.name = name;
        this.address = address;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = String.valueOf(iD);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student (){}

    public Student(int iD , String name , String address){
        this.iD = String.valueOf(iD);
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
