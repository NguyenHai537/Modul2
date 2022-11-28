package ThucHanhTimGiaTriLonNhatGhiFile;

import java.util.List;

import static ThucHanhTimGiaTriLonNhatGhiFile.FindMaxValue.findMax;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("C:\\Users\\nguye\\OneDrive\\Máy tính\\textfile.txt");
        int maxValue = findMax(numbers);

        readAndWriteFile.writeFile("C:\\Users\\nguye\\OneDrive\\Máy tính\\result.txt", maxValue);
    }
}
