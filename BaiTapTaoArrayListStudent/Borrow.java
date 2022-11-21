package BaiTapTaoArrayListStudent;

public class Borrow {
    private String studentId;
    private String bookID;
    private String dateBorrow;
    private String dateReturn = null;
    private boolean status = true;


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDateReturn() {
        return dateReturn;
    }

    public void setDateReturn(String dateReturn) {
        this.dateReturn = dateReturn;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getDateBorrow() {
        return dateBorrow;
    }

    public void setDateBorrow(String dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Borrow(){}

    public Borrow (String studentId, String bookID , String dateBorrow){
        this.studentId = studentId;
        this.bookID = bookID;
        this.dateBorrow = dateBorrow;
        this.dateReturn = null;
        this.status = false;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "studentId='" + studentId + '\'' +
                ", bookID='" + bookID + '\'' +
                ", dateBorrow='" + dateBorrow + '\'' +
                ", dateReturn='" + dateReturn + '\'' +
                ", status=" + status +
                '}';
    }
}
