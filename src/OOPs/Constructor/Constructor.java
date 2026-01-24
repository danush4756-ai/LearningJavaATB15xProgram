package OOPs.Constructor;

public class Constructor {
    public static void main(String[] args) {
        class MySQL {
            MySQL() {
                System.out.println("MySQL Connected!");
            }
        }

        class ReadExcelFile {
            ReadExcelFile() {
                System.out.println("ExcelFile is Loaded!");
            }
        }
    }
}