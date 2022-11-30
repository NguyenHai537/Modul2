package BaiTapCopyFileText;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a source file: ");
        String sourceFile = sc.nextLine();
        String line = "";
        try {
            File file = new File(sourceFile);
            if ( !file.exists()){
                throw new FileNotFoundException();
            }else {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                line = bufferedReader.readLine();
                bufferedReader.close();

                System.out.println("Enter a target file: ");
                String targetFile = sc.nextLine();
                try {
                    File file2 = new File(targetFile);
                    if ( !file2.canWrite()){
                        throw  new FileNotFoundException();
                    }
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
                    bufferedWriter.write(line);
                    bufferedWriter.close();
                    System.out.println(line);
                    System.out.println("Đã Copy xong");
                } catch (Exception e) {
                    System.err.println("File đã tôn tại or có lỗi!");
                }
            }

        }catch (Exception e){
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }

    }
}
