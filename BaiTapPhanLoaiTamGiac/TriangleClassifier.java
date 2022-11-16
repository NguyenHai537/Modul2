package BaiTapPhanLoaiTamGiac;

public class TriangleClassifier {
     public  static String result = "";
    public static String readTriangle(int sideA , int sideB, int sideC){
        if ( sideA == sideB && sideA == sideC){
            result = "Tam giác đều";
        }else if ( sideA == sideB && sideA + sideB > sideC){
            result = "Tam giác cân";
        } else if (sideA < sideB && sideA + sideB > sideC) {
            result = "Tam giác thường";
        }else
            result = "Không phải tam giác";
        return result;
    }

}
