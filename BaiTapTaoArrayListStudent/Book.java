package BaiTapTaoArrayListStudent;

public class Book {
    private String iD;
    private String name;
    private String style;

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Book(){}

    public Book(String iD, String name, String style){
        this.iD = iD;
        this.name = name;
        this.style = style;
    }

    @Override
    public String toString() {
        return "Book{" +
                "iD='" + iD + '\'' +
                ", name='" + name + '\'' +
                ", style='" + style + '\'' +
                '}';
    }
}
